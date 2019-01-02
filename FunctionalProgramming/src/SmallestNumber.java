import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Function;

public class SmallestNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] nums = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Function<int[],Integer> findSmallestNum = x -> {
            int min = Integer.MAX_VALUE;
            for (int i : x) {
                if (i < min) {
                    min = i;
                }
            }
            return min;
        };

        System.out.println(findSmallestNum.apply(nums));
    }
}
