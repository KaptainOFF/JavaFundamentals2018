import java.util.Arrays;
import java.util.Scanner;

public class Encrypt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfNames = Integer.parseInt(scanner.nextLine());
        String[] names = new String[numberOfNames];
        int[] endResult = new int[numberOfNames];

        addNames(scanner, names);
        getNames(names, endResult);
        Arrays.sort(endResult);
        printResults(endResult);
    }

    private static void printResults(int[] endResult) {
        for (int result : endResult) {
            System.out.println(result);
        }
    }

    private static void addNames(Scanner scanner, String[] names) {
        for (int i = 0; i < names.length; i++) {
            String name = scanner.nextLine();
            names[i] = name;
        }
    }

    private static void getNames(String[] names, int[] endResult) {
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            int nameSum = 0;

            nameSum = getNameSum(name, nameSum);
            endResult[i] += nameSum;
        }
    }

    private static int getNameSum(String name, int nameSum) {
        for (int j = 0; j < name.length(); j++) {
            char letter = name.charAt(j);
            if (checkLetterIsVowel(letter)) {
                nameSum += letter * name.length();
            } else {
                nameSum += letter / name.length();
            }
        }
        return nameSum;
    }

    private static boolean checkLetterIsVowel(char letter) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for (char vowel: vowels) {
            if (vowel == Character.toLowerCase(letter)) {
                return true;
            }
        }
        return false;
    }
}
