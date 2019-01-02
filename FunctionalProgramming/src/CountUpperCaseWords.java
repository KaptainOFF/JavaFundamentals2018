import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUpperCaseWords {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> upperCasedWords = new ArrayList<>();

        List<String> userInput = Arrays.stream(reader.readLine().split("\\s+")).collect(Collectors.toList());

        Predicate<String> checkUppercase = letter -> Character.isUpperCase(letter.charAt(0));

        userInput.stream().filter(checkUppercase).forEach(upperCasedWords::add);

        System.out.println(upperCasedWords.size());
        upperCasedWords.forEach(System.out::println);
    }
}
