import java.util.Scanner;

public class SquareInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rowsAndCols = scanner.nextLine();

        String[] annoying = rowsAndCols.split(", ");
        int rows = Integer.parseInt(annoying[0]);
        int cols = Integer.parseInt(annoying[1]);
        int[][] matrix = new int[rows][cols];
        int endSum = 0;
        int[][] subMatrix = new int[2][2];

        createMatrix(scanner, rows, cols, matrix);
        endSum = getEndSum(rows, cols, matrix, endSum, subMatrix);
        printMatrix(endSum, subMatrix);

    }

    private static void printMatrix(int endSum, int[][] subMatrix) {
        for (int[] subMatrix1 : subMatrix) {
            for (int i : subMatrix1) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println(endSum);
    }

    private static int getEndSum(int rows, int cols, int[][] matrix, int endSum, int[][] subMatrix) {
        for (int row = 0; row < rows-1; row++) {
            int sum = 0;
            for (int col = 0; col < cols-1; col++) {
                sum = matrix[row][col] + matrix[row][col + 1] + matrix[row+1][col] + matrix[row + 1][col + 1];

                if (sum > endSum) {
                    endSum = sum;
                    subMatrix[0][0] = matrix[row][col];
                    subMatrix[0][1] = matrix[row][col + 1];
                    subMatrix[1][0] = matrix[row+1][col];
                    subMatrix[1][1] = matrix[row+1][col+1];
                }
            }
        }
        return endSum;
    }

    private static void createMatrix(Scanner scanner, int rows, int cols, int[][] matrix) {
        for (int i = 0; i < rows; i++) {
            String[] elements = scanner.nextLine().split(", ");

            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(elements[j]);
            }
        }
    }
}
