import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] userInput = scanner.nextLine().split(" ");

        ArrayDeque<String> stack = new ArrayDeque<>(Arrays.asList(userInput));
        System.out.println(getSum(stack));
    }

    private static int getSum(ArrayDeque<String> stack) {
        return getEndResult(stack);
    }

    private static int getEndResult(ArrayDeque<String> stack) {
        boolean operator = true;
        int result = 0;
        for (String obj: stack) {
            if (obj.equals("+")) {
                operator = true;
            } else if (obj.equals("-")) {
                operator = false;
            } else {
                result = performCalculation(operator, obj);
            }
        }
        return result;
    }

    private static int performCalculation(boolean operator, Object obj) {
        int sum = 0;
        if (operator) {
            sum += Integer.parseInt(obj.toString());
        } else {
            sum -= Integer.parseInt(obj.toString());
        }
        return sum;
    }
}
