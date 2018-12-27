import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isStop = false;
        Map<String, Integer> resource = new LinkedHashMap<>();
        int counter = 1;
        String key = "";

        while(!isStop) {
            String input = scanner.nextLine();
            if("stop".equals(input)) {
                isStop = true;
                continue;
            }
            if(counter % 2 != 0) {
                key = input;
            } else{
                if(resource.get(key) != null) {
                    resource.put(key, resource.get(key) + Integer.parseInt(input));
                } else {
                    resource.put(key, Integer.parseInt(input));
                }
            }
            counter++;
        }

        for (String s : resource.keySet()) {
            System.out.printf("%s -> %s%n",s,resource.get(s));
        }
    }
}
