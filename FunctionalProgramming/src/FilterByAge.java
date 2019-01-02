import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Predicate;

public class FilterByAge {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> people = new LinkedHashMap<>();
        List<String> peopleToPrint = new ArrayList<>();

        int numberOfElements = Integer.parseInt(reader.readLine());

        for (int i = 0; i < numberOfElements; i++) {
            String[] element = reader.readLine().split(", ");
            people.put(element[0], Integer.parseInt(element[1]));
        }

        Predicate<String> checkCondition = "older"::equals;
        Predicate<String[]> checkOutputPattern = arr -> arr.length > 1;
        String condition = reader.readLine();
        int age = Integer.parseInt(reader.readLine());

        String[] outputPattern = reader.readLine().split(" ");

        if(checkCondition.test(condition)) {
            people.keySet().stream().filter(x -> people.get(x) >= age).forEach(peopleToPrint::add);
        } else {
            people.keySet().stream().filter(x -> people.get(x) < age).forEach(peopleToPrint::add);
        }

        if(checkOutputPattern.test(outputPattern)) {
            people.keySet().stream().filter(peopleToPrint::contains).forEach(x -> System.out.printf("%s - %d%n",x, people.get(x)));
        } else {
            if("age".equals(outputPattern[0])) {
                people.keySet().stream().filter(peopleToPrint::contains).forEach(x -> System.out.println(people.get(x)));
            } else {
                people.keySet().stream().filter(peopleToPrint::contains).forEach(System.out::println);
            }
        }



    }
}
