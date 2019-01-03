import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalNames {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> names = Arrays.stream(reader.readLine()
                .split("\\s+"))
                .collect(Collectors.toList());

        List<Character> letters = Arrays.stream(reader.readLine()
                .split("\\s+"))
                .map(String::toUpperCase)
                .map(letter -> letter.charAt(0))
                .collect(Collectors.toList());

        Optional<String> namesToPrint = names.stream()
                .filter( name -> letters.contains(name.charAt(0)))
                .findAny();

        if (namesToPrint.isPresent()) {
            namesToPrint.stream().forEach(name -> System.out.print(name + " "));
        } else {
            System.out.println("No match");
        }
    }
}
