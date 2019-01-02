import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = Arrays.stream(reader.readLine()
                .split(", ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        Function<Integer, Integer> asd = x -> x*2;
        numbers.removeIf(x -> x % 2 != 0);
        System.out.println(numbers.toString().replaceAll("[\\[\\]]",""));
        numbers.sort(Integer::compareTo);
        System.out.println(numbers.toString().replaceAll("[\\[\\]]",""));
        int all = asd.apply(7);
    }
}
