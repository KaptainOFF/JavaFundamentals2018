import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindSmallestNum {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> numbers = Arrays.stream(reader.readLine()
                .split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        Function<List<Integer>, Integer> findSmallest = x -> {
            int min = Integer.MAX_VALUE;
            for (int x1 : x) {
                if (x1 < min) {
                    min = x1;
                }
            }
            return numbers.indexOf(min);
        };

        System.out.println(findSmallest.apply(numbers));
    }
}
