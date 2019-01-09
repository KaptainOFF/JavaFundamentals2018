import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ExcellentStudents {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean isEnd = false;
        List<String[]> students = new ArrayList<>();

        while (!isEnd) {
            String[] name = reader.readLine().split("\\s+");

            if ("END".equals(name[0])) {
                isEnd = true;
                continue;
            }
            students.add(name);
        }

        students.stream().filter((String[] x) -> {
            StringBuilder isWeak = new StringBuilder();
            for (int i = 2; i < x.length; i++) {
                if(Integer.parseInt(x[i]) <= 3) {
                    isWeak.append(x[i]);
                }
            }
            return isWeak.length() >= 2;
        }).forEach((String[] x) -> {
            System.out.println(x[0] + " " + x[1]);
        });
    }
}
