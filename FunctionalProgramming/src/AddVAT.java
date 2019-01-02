import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddVAT {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Double> vatPrices = new ArrayList<>();


        List<Double> prices = Arrays.stream(reader.readLine()
                .split(", "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        prices.stream().map(price -> price * 1.2).forEach(vatPrices::add);
        System.out.println("Prices with VAT: ");
        vatPrices.forEach(x -> System.out.printf("%.2f%n", x));


    }

}
