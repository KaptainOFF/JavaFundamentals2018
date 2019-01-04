import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class DoubleAverage {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] numbers  = reader.readLine().split("\\s+");

        if(numbers[0].equals("")) {
            System.out.println("No match");
        } else {
            DoubleStream doubleStream = DoubleStream.of(Arrays.stream(numbers)
                    .mapToDouble(Double::parseDouble).toArray());
            OptionalDouble result = doubleStream.average();

            if (result.isPresent()) {
                System.out.printf("%.2f", result.getAsDouble());
            } else {
                System.out.println("No match");
            }
        }
    }
}
