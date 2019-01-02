import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateForNames {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int stringLen = Integer.parseInt(reader.readLine());
        List<String> names = Arrays.stream(reader.readLine()
                .split("\\s+"))
                .collect(Collectors.toList());

        Predicate<String> checkLength = x -> x.length() <= stringLen;
        names.stream().filter(checkLength::test).forEach(System.out::println);
    }
}
