import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (String item : input) {
            stack.push(Integer.parseInt(item));
        }

        while(stack.size()>0) {
            System.out.print(stack.poll() + " ");
        }
    }
}
