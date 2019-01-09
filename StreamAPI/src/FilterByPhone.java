import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class FilterByPhone {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean isEnd = false;
        Map<String, String> students = new LinkedHashMap<>();

        while (!isEnd) {
            String[] name = reader.readLine().split("\\s+");

            if ("END".equals(name[0])) {
                isEnd = true;
                continue;
            }
            students.put(name[0] + " " + name[1], name[2]);
        }
        students.keySet().stream()
                .filter(kv -> students.get(kv).startsWith("02") || students.get(kv).startsWith("+3592"))
                .forEach(System.out::println);
    }
}
