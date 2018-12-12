import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int dimensions = Integer.parseInt(input[0]);
        String type = input[1];
        int[][] matrix = new int[dimensions][dimensions];
        if (type.equals("A")) {
            matrix = patternA(dimensions);
        } else {
            matrix = patternB(dimensions);
        }
        printMatrix(dimensions, matrix);
    }

    private static int[][] patternB(int dimensions) {
        int[][] matrix = new int [dimensions][dimensions];
        int counter = 1;
        for (int row = 0; row < dimensions; row++) {
            int reverse = dimensions;
            for (int col = 0; col < dimensions; col++) {
                if(row % 2 == 0) {
                    matrix[col][row] = counter;
                } else {
                    matrix[reverse-1][row] = counter;
                    reverse--;
                }
                counter++;
            }
        }
        return matrix;
    }

    private static void printMatrix(int dimensions, int[][] matrix) {
        for (int i = 0; i < dimensions; i++) {
            for (int j = 0; j < dimensions; j++) {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }

    private static int[][] patternA(int dimensions) {
        int counter = 1;
        int[][] matrix = new int [dimensions][dimensions];
        for (int row = 0; row < dimensions; row++) {
            for (int col = 0; col < dimensions; col++) {
                    matrix[col][row] = counter;
                    counter++;
            }
        }
        return matrix;
    }
}
