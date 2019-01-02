import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;

public class EvenOrOdd {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] range = Arrays.stream(reader.readLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String condition = reader.readLine();

        Function<Integer, String> odds = x -> {
            StringBuilder sb = new StringBuilder();
            if(x % 2 != 0) {
                sb.append(x).append(" ");
            }
            return sb.toString();
        };

        Function<Integer, String> even = x -> {
            StringBuilder sb = new StringBuilder();
            if(x % 2 == 0) {
                sb.append(x).append(" ");
            }
            return sb.toString();
        };

        Predicate<String> isOdd = cond -> "odd".equals(cond);

        printNumbers(isOdd,range,condition,odds,even);
    }

    private static void printNumbers(Predicate<String> evenOrOdd,int[] numsRange,
                                     String cond,
                                     Function<Integer, String> odds,
                                     Function<Integer, String> even) {
        for (int i = numsRange[0]; i <= numsRange[1]; i++) {
            if(evenOrOdd.test(cond)) {
                System.out.print(odds.apply(i));
            } else if(!evenOrOdd.test(cond)) {
                System.out.print(even.apply(i));
            }
        }
    }
}
