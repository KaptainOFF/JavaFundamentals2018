import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(", ");

        Function<String[], List<Integer>> parseArray = arr -> {
            List<Integer> output = new ArrayList<>();
            Arrays.stream(arr).map(Integer::parseInt).forEach(output::add);
            return output;
        };

        Function<List<Integer>, Integer> getSum = list -> {
            return list.stream().mapToInt(Integer::intValue).sum();
        };
        List<Integer> numbers = parseArray.apply(input);


        int count = numbers.size();
        int sum = getSum.apply(numbers);
        System.out.println("Count = " + count);
        System.out.println("Sum = " + sum);

    }
}
