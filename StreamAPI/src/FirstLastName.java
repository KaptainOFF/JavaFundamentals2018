import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FirstLastName {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean isEnd = false;
        List<String> students = new ArrayList<>();

        while(!isEnd) {
            String name = reader.readLine();

            if("END".equals(name)) {
                isEnd = true;
                continue;
            }
            students.add(name);
        }

        students.stream().filter(name -> {
            String[] fullName = name.split("\\s+");
            int i = fullName[0].compareTo(fullName[1]);
            return i <= 0;
        }).forEach(System.out::println);
    }
}
