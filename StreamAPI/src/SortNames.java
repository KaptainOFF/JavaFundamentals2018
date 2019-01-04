import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

public class SortNames {
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
        students.stream()
                .sorted(Comparator.comparing((String[] x) -> x[1]).reversed()
                        .thenComparing(x -> x[0]).reversed())
                .forEach(x -> {
                    StringBuilder sb = new StringBuilder();
                    sb.append(x[0]).append(" ").append(x[1]);
                    System.out.println(sb.toString());
        });

    }
}
