import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numbers.stream()
                .filter(num -> (num >= 10 && num <= 20))
                .distinct()
                .limit(2)
                .forEach(num -> System.out.print(num + " ") );
    }
}
