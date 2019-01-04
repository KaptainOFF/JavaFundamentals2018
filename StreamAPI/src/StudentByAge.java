import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StudentByAge {
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
            students.add(name.trim());
        }

        students.stream().filter(student -> {
            int age = Integer.parseInt(student.substring(student.length()-2));
            return age >= 18 && age <= 24;
        }).forEach(System.out::println);
    }
}
