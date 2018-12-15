import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int max= Integer.MIN_VALUE;
        int numberOfCommands = Integer.parseInt(scanner.nextLine());
        int command = 0;
        int number = 0;

        for (int i = 0; i < numberOfCommands; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            if(input.length > 1) {
                command = Integer.parseInt(input[0]);
                number = Integer.parseInt(input[1]);
            } else {
                command = Integer.parseInt(input[0]);
            }

            if (command == 1) {
                stack.push(number);
            } else if (command == 2) {
                stack.poll();
            } else {
                for (Integer num : stack) {
                    if (num > max) {
                        max = num;
                    }
                }
                System.out.println(max);
            }
        }
    }
}
