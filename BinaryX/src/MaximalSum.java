import java.util.Scanner;

public class MaximalSum {
    private static Scanner scanner = new Scanner(System.in);
    private static int[][] subMatrix = new int[3][3];
    public static void main(String[] args) {

        String[] arguments = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(arguments[0]);
        int cols = Integer.parseInt(arguments[1]);
        int[][] matrix = constructMatrix(rows, cols);
        int max = findBiggestSum(matrix);
        System.out.println("Sum = " + max);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(subMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static int[][] constructMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            String[] values = scanner.nextLine().split("\\s+");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(values[j]);
            }
        }
        return matrix;
    }

    private static int findBiggestSum(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length-2; i++) {
            for (int j = 0; j < matrix[i].length -2; j++) {
                 int sum = 0;
                 sum += matrix[i][j]
                        + matrix[i][j+1]
                        + matrix[i][j+2]
                        + matrix[i+1][j]
                        + matrix[i+1][j+1]
                        + matrix[i+1][j+2]
                        + matrix[i+2][j]
                        + matrix[i+2][j+1]
                        + matrix[i+2][j+2];
                if (sum > max) {
                    max = sum;
                    subMatrix[0][0] = matrix[i][j];
                    subMatrix[0][1] = matrix[i][j+1];
                    subMatrix[0][2] = matrix[i][j+2];
                    subMatrix[1][0] = matrix[i+1][j];
                    subMatrix[1][1] = matrix[i+1][j+1];
                    subMatrix[1][2] = matrix[i+1][j+2];
                    subMatrix[2][0] = matrix[i+2][j];
                    subMatrix[2][1] = matrix[i+2][j+1];
                    subMatrix[2][2] = matrix[i+2][j+2];
                }
            }
        }
        return max;
    }
}
