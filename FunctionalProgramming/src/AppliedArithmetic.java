import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AppliedArithmetic {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean isFinished = false;

        List<Integer> numbers = Arrays.stream(reader.readLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while(!isFinished) {
            String userInput = reader.readLine();

            if("end".equals(userInput)) {
                isFinished = true;
            } else if("add".equals(userInput)) {
                numbers = numbers.stream().map(x -> x + 1).collect(Collectors.toList());
            } else if("print".equals(userInput)) {
                numbers.forEach(x -> System.out.print(x + " "));
                System.out.println();
            } else if ("subtract".equals(userInput)) {
                numbers = numbers.stream().map(x -> x - 1).collect(Collectors.toList());
            } else if ("multiply".equals(userInput)) {
                numbers = numbers.stream().map(x -> x * 2).collect(Collectors.toList());
            }
        }

    }
}
