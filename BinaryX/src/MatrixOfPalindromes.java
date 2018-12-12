import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] holders = scanner.nextLine().split("\\s+");
        int r = Integer.parseInt(holders[0]);
        int c = Integer.parseInt(holders[1]);

        String[][] matrix = new String[r][c];

        for (int i = 0; i <r; i++) {
            char start = 'a';
            start +=i;
            for (int j = 0; j <c; j++) {
                char holder = (char)(start +j);
                matrix[i][j] = Character.toString(start) + Character.toString(holder) + Character.toString(start);
            }

        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
