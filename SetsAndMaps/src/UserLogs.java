import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Map<String, Integer>> messages = new TreeMap<>();
        boolean isEnd = false;
        String iP = "";
        String user = "";

        while(!isEnd) {
            Map<String,Integer> values = new TreeMap<>();
            String[] message = scanner.nextLine().split("[ =+]");

            if("end".equals(message[0])){
                isEnd = true;
                continue;
            }
            iP = message[1].trim();;
            user = message[5].trim();


            if(!messages.containsKey(user)) {
                values.put(iP,1);
                messages.put(user, values);
            } else if (messages.containsKey(user)){
                values = messages.get(user);
                if(messages.get(user).containsKey(iP)) {
                    int newValue = messages.get(user).get(iP) + 1;
                    values.put(iP,newValue);
                    messages.replace(user, values);
                } else {
                    values.put(iP, 1);
                    messages.put(user, values);
                }
            }
        }
        for (String keyUser : messages.keySet()) {
            user = keyUser;
            System.out.printf("%s:%n", user);
            Map<String, Integer> out = messages.get(user);
            for (String s : out.keySet()) {
                System.out.printf("%s => %d.%n",s, out.get(s));
            }
        }


    }
}
