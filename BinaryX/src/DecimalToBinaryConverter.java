import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int number = Integer.parseInt(scanner.nextLine());

        if(number == 0) {
            System.out.println(0);
        } else {
            while (number != 0) {
                stack.push(number % 2);
                number /= 2;
            }
            while (stack.size() > 0) {
                System.out.print(stack.pop());
            }
        }
    }
}
