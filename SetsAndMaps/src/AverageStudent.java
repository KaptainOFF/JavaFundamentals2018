import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AverageStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, double[]> studentGrades = new TreeMap<>();
        int numberOfStudents = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < numberOfStudents; i++) {
            String studentName = scanner.nextLine();
            double[] grades = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
            studentGrades.put(studentName, grades);
        }

        for (Map.Entry<String, double[]> student : studentGrades.entrySet()) {
            System.out.printf("%s is graduated with %f%n",student.getKey(),Arrays.stream(student.getValue()).average().getAsDouble());
        }
    }
}
