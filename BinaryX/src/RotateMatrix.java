import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RotateMatrix {
    private static Scanner scanner = new Scanner(System.in);
    private static boolean isEnd = false;
    private static double finalStep = 0;
    private static List<String> container = new ArrayList<>();
    public static void main(String[] args) {
        container = getValues();
        char[][] matrix = fillMatrix(container);
        printMatrix(finalStep,matrix);
    }

    private static List<String> getValues() {
        List<String> container = new ArrayList<>();
        while(!isEnd) {
            String input = scanner.nextLine();
            if(input.equals("END")) {
                isEnd = true;
                continue;
            }
            try {
                finalStep = getFinalStep(input);
            } catch (Exception e) {
                container.add(input);
            }
        }
        return container;
    }

    private static void printMatrix(double rotationStep, char[][] matrix) {

        if(rotationStep == 0 || rotationStep == 1) {
            for (char[] matrix1 : matrix) {
                for (char c : matrix1) {
                    System.out.print(c);
                }
                System.out.println();
            }
        } else if (rotationStep == 0.25) {
            Character[][] matrixToPrint = new Character[getLongestValue(container)][matrix.length];
            for (int row = 0; row < matrixToPrint.length; row++) {
                for (int col = 0; col < matrixToPrint[row].length; col++) {
                    matrixToPrint[row][col] = matrix[col][row];
                    if(matrixToPrint[row][col] != null) {
                        System.out.print(matrixToPrint[row][col]);
                    }
                }
                System.out.println();
            }
        }
    }

    private static double getFinalStep(String input) {
        int rotation= Integer.parseInt(input.substring(7, input.length() - 1));
        double step = rotation / 360.0;
        double output = (int) step - step;
        return Math.abs(output);
    }

    private static int getLongestValue(List<String> cont) {
        int max = Integer.MIN_VALUE;
        for (String value : cont) {
            if (value.length() > max) {
                max = value.length();
            }
        }
        return max;
    }

    private static char[][] fillMatrix(List<String> container) {
        char[][] matrix = new char[container.size()][getLongestValue(container)];

        for (int i = 0; i < container.size(); i++) {
            if (container.get(i).toCharArray().length >= 0)
                System.arraycopy(container.get(i).toCharArray(),
                        0, matrix[i],
                        0,
                        container.get(i).toCharArray().length);
        }
        return matrix;
    }


}
