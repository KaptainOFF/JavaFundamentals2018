import java.util.ArrayDeque;
import java.util.Scanner;

public class StackBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] commands =  scanner.nextLine().split("\\s+");
        int numberOfElementsInStack = Integer.parseInt(commands[0]);
        int numberOfElementsTobeTaken = Integer.parseInt(commands[1]);
        int numberToBeChecked = Integer.parseInt(commands[2]);
        ArrayDeque<Integer> stack = new ArrayDeque<>(numberOfElementsInStack);

        String[] elements = scanner.nextLine().split("\\s+");

        for (String element : elements) {
            stack.push(Integer.parseInt(element));
        }

        for (int i = 0; i < numberOfElementsTobeTaken; i++) {
            stack.poll();
        }

        if(stack.contains(numberToBeChecked)) {
            System.out.println(true);
        } else {
            int min = Integer.MAX_VALUE;
            if(stack.size() == 0) {
                min = 0;
            }
            while (stack.size()>0) {
                int element = stack.poll();
                if(element < min) {
                    min = element;
                }
            }
            System.out.println(min);
        }
    }
}
