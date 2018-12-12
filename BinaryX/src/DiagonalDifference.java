import java.util.Scanner;

public class DiagonalDifference {
    private static Scanner scanner = new Scanner(System.in);
    private static int size = Integer.parseInt(scanner.nextLine());
    private static int diagonalSumOne = 0;
    private static int diagonalSumTwo = 0;

    public static void main(String[] args) {
        int[][] matrix =generateMatrix();
        diagonalSumOne = getDiagonalSumOne(matrix);
        diagonalSumTwo = getDiagonalSumTwo(matrix);

        System.out.println(Math.abs(diagonalSumOne - diagonalSumTwo));

    }

    private static int[][] generateMatrix() {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            String[] values = scanner.nextLine().split("\\s+");
            for (int j = 0; j < size; j++) {
                matrix[i][j] = Integer.parseInt(values[j]);
            }
        }
        return matrix;
    }

    private static int getDiagonalSumOne(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }

    private static int getDiagonalSumTwo(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][size - 1 - i];
        }
        return sum;
    }
}
