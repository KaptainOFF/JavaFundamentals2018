import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rowsAndCols = scanner.nextLine();

        String[] annoying = rowsAndCols.split(", ");
        int row = Integer.parseInt(annoying[0]);
        int col = Integer.parseInt(annoying[1]);
        int sum = 0;

        for (int i = 0; i < row; i++) {
            String[] elements = scanner.nextLine().split(", ");

            for (int j = 0; j < col; j++) {
                sum += Integer.parseInt(elements[j]);
            }
        }

        System.out.println(row);
        System.out.println(col);
        System.out.println(sum);
    }
}
