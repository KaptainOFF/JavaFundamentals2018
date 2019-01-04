import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FilterByGmail {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean isEnd = false;
        List<String> students = new ArrayList<>();

        while (!isEnd) {
            String name = reader.readLine();

            if ("END".equals(name)) {
                isEnd = true;
                continue;
            }
            students.add(name);
        }

        students.stream().filter(x -> {
            int index = x.indexOf("@");
            String email = x.substring(index);
            return "@gmail.com".equals(email);
        }).forEach(x -> {
            String[] student = x.split("\\s+");
            StringBuilder sb = new StringBuilder();
            sb.append(student[0]).append(" ").append(student[1]);
            System.out.println(sb.toString());
        });
    }
}
