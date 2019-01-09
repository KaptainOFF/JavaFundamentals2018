import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.ClientFilter;
import com.sun.jersey.core.util.MultivaluedMapImpl;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import java.util.ArrayList;
import java.util.List;

public class NationsRestApiClient {

    protected enum CallType {
        POST, GET;
    }

    private StringBuilder callSuffix = new StringBuilder("/rest/v2/");
    private MultivaluedMap<String, String> queryParams = new MultivaluedMapImpl();
    private CallType callType;
    private String url;
    private WebResource resource;
    private Client client;

    public NationsRestApiClient() {
        this.url = "https://restcountries.eu/";
        this.client = Client.create();
        this.resource = client.resource(url);
    }

    private JSONObject obj = new JSONObject();

    public MultivaluedMap<String, String> getQueryParams() {
        return queryParams;
    }

    public CallType getCallType() {
        return callType;
    }

    public void setCallType(CallType callType) {
        this.callType = callType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public WebResource getResource() {
        return resource;
    }

    public Client getClient() {
        return client;
    }

    public JSONArray getRequest(String name, String... filters) throws JSONException {
        ClientResponse response;
        if(!name.toLowerCase().equals("")) {
            response = getCountryByName(name, filters);
        } else {
            response = getAllCountries(filters);
        }
        return new JSONArray(response.getEntity(String.class));
    }

    private void addQueryParams(String key, String value) {
        if(this.queryParams.get(key) == null) {
            List<String> values = new ArrayList<>();
            values.add(value);
            this.queryParams.put(key, values);
        } else {
            this.queryParams.get(key).add(value);
        }
    }

    private ClientResponse getAllCountries(String...filters) {
        setGetCall();
        setCallSuffix("all");
        if(!(filters.length == 1 && filters[0].equals(""))) {
            filter(filters);
        }
        return resource.path(this.callSuffix.toString()).queryParams(this.queryParams).accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
    }

    private void setCallSuffix(String... values) {
        for (String value : values) {
            callSuffix.append(value).append("/");
        }
    }

    private ClientResponse getCountryByName(String name, String... filters) {
        setCallSuffix("name", name);
        filter(filters);
        return resource.path(this.callSuffix.toString()).queryParams(this.queryParams).accept("application/json").get(ClientResponse.class);
    }

    private void setGetCall() {
        this.callType = callType.GET;
    }

    private void filter(String... filters) {
        for (String filter : filters) {
            addQueryParams("fields", filter);
        }
    }
}
