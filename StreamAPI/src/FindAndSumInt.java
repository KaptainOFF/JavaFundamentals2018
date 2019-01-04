import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalInt;

public class FindAndSumInt {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        OptionalInt result = Arrays.stream(reader.readLine()
                .split("\\s+"))
                .filter(val -> !val.isEmpty())
                .filter(val -> val.matches("-?[0-9]+"))
                .mapToInt(Integer::parseInt)
                .reduce((x, y) -> x + y);

        if(result.isPresent()) {
            System.out.println(result.getAsInt());
        } else {
            System.out.println("No match");
        }
    }
}
