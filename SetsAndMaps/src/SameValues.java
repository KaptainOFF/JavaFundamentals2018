import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SameValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Map<Double, Integer> values = new HashMap<>();

        double[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble).toArray();

        for (double s : input) {
            if (!values.containsKey(s)) {
                values.put(s,0);
            }
            values.put(s, values.get(s) + 1);
        }

        for (Double key : values.keySet()) {
            System.out.printf("%s - %d times%n", decimalFormat.format(key), values.get(key));
        }
    }
}
