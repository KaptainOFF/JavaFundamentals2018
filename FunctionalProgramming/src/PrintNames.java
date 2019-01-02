import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Consumer;

public class PrintNames {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] names = reader.readLine().split("\\s+");

        Consumer<String[]> printNames = name -> Arrays.stream(name).forEach(nm -> System.out.println("Sir " + nm));

        printNames.accept(names);

    }
}
