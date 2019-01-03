import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseNames {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Arrays.stream(reader.readLine().split("\\s+"))
                .map(String::toUpperCase)
                .forEach(word -> System.out.print(word + " "));

    }
}
