import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentsByGroup {
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
            students.add(name.trim());
        }

        students.stream().filter(name -> name.trim().endsWith("2"))
                .map(x -> {
                    StringBuilder sb = new StringBuilder();
                    String[] name = x.split("\\s+");
                    sb.append(name[0]).append(" ").append(name[1]);
                    return sb;
                })
                .sorted((name1, name2) -> {
                    String[] firstToCompare = name1.toString().split("\\s+");
                    String[] secondToComapre = name2.toString().split("\\s+");
                    return firstToCompare[0].compareTo(secondToComapre[0]);
                })
                .forEach(System.out::println);
    }
}
