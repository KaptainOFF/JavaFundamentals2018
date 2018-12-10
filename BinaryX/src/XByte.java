import java.util.Scanner;

public class XByte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[8][32];

        for (int i = 0; i < 8; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            char[] numToStr = new StringBuilder(Integer.toBinaryString(number))
                    .reverse()
                    .toString()
                    .toCharArray();
            for (int j = 0; j < numToStr.length; j++) {
                int index = matrix[i].length - numToStr.length + j;
                matrix[i][index] = Integer.parseInt(String.valueOf(numToStr[j]));
            }
        }
        String debug = "";
    }
}
