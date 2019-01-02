import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PredicatesParty {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean isParty = false;

        List<String> partyGoers = Arrays.stream(reader.readLine()
                .split("\\s+")).collect(Collectors.toList());
        
        while(!isParty) {
            String[] userInput = reader.readLine().split("\\s+");

            if("Party!".equals(userInput[0])) {
                isParty = true;
                continue;
            }
            if("Double".equals(userInput[0])) {
                if("StartsWith".equals(userInput[1])) {
                    partyGoers.addAll(partyGoers.stream()
                            .filter(name -> name.startsWith(userInput[2]))
                            .collect(Collectors.toList()));
                } else if("EndsWith".equals(userInput[1])) {
                    partyGoers.addAll(partyGoers.stream()
                            .filter(name -> name.endsWith(userInput[2]))
                            .collect(Collectors.toList()));
                } else if("Length".equals(userInput[1]))
                    partyGoers.addAll(partyGoers.stream()
                            .filter(name -> name.length() == Integer.parseInt(userInput[2]))
                            .collect(Collectors.toList()));
            } else if("Remove".equals(userInput[0])) {
                if("StartsWith".equals(userInput[1])) {
                    partyGoers.removeIf(name -> name.startsWith(userInput[2]));
                } else if("EndsWith".equals(userInput[1])) {
                    partyGoers.removeIf(name -> name.endsWith(userInput[2]));
                } else if("Length".equals(userInput[1])) {
                    partyGoers.removeIf(name -> name.length() == Integer.parseInt(userInput[2]));
                }
            }

        }
        Collections.sort(partyGoers);
        if(partyGoers.size() > 0) {
            String output = String.join(", ",partyGoers);
            System.out.println(output + " are going to the party!");
        } else {
            System.out.println("Nobody is going to the party!");
        }
    }
}
