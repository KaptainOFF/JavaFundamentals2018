import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ByteParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isParty = true;

        int numberOfIntegers = Integer.parseInt(scanner.nextLine());

        int[] numbers = new int[numberOfIntegers];
        for (int i = 0; i < numberOfIntegers; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            numbers[i] = number;
        }

        while(isParty) {
            String userCommand = scanner.nextLine();
            if("party over".equals(userCommand)) {
                isParty = false;
                continue;
            }

            String[] tokens = userCommand.split("\\s+");
            int pattern = Integer.parseInt(tokens[0]);
            int position = Integer.parseInt(tokens[1]);

            for (int i = 0; i < numbers.length; i++) {
                switch (pattern) {
                    case 1:
                        changeValueToOne(numbers, position);
                        break;
                    case 0:
                        changeValueToZero(numbers, position);
                        break;
                    case -1:
                        changeValueToMinusOne(numbers, position, i);
                        break;
                }
            }
        }

        for (int number : numbers) {
            System.out.println(number);
        }

    }

    private static void changeValueToZero(int[] numbers, int position) {
        for (int j = 0; j < numbers.length; j++) {
            int a = numbers[j];
            int b = a >> position;
            int c = b & 1;
            int d = ~(1 << position);
            int result = a & d;
            numbers[j] = result;
        }
    }

    private static void changeValueToMinusOne(int[] numbers, int position, int i) {
        int a = numbers[i];
        int b = a >> position;
        int c = b & 1;
        if (c == 0) {
            int d = 1 << position;
            int result = a | d;
            numbers[i] = result;
        } else {
            int d = ~(1 << position);
            int result = a & d;
            numbers[i] = result;
        }
    }

    private static void changeValueToOne(int[] numbers, int position) {
        for (int j = 0; j < numbers.length; j++) {
            int a = numbers[j];
            int b = a >> position;
            int c = b & 1;
            int d = 1 << position;
            int result = a | d;
            numbers[j] = result;
        }
    }
}
