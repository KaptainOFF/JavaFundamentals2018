import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.filter.ClientFilter;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, JSONException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        NationsRestApiClient apiClient = new NationsRestApiClient();

        String name = reader.readLine();
        String[] filters = reader.readLine().split("\\s+");
        JSONArray output = null;
        try {
            output = apiClient.getRequest(name, filters);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < output.length(); i++) {
            System.out.println(output.get(i));
        }
        System.out.println("Thanks! Bye!");
    }
}
