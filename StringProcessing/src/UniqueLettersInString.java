import javafx.beans.binding.StringBinding;

import java.util.Scanner;

public class UniqueLettersInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] letters = scanner.nextLine().toCharArray();
        StringBuilder sb = new StringBuilder();
        char holder = ' ';

        for (char letter : letters) {
            if (letter != holder) {
                sb.append(letter);
                holder = letter;
            }
        }

        System.out.println(sb.toString());
    }
}
