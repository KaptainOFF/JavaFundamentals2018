import java.util.*;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> elements = new TreeSet<>();
        int numberOfSets = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfSets; i++) {
            elements.addAll(Arrays.asList(scanner.nextLine().split("\\s+")));
        }

        elements.forEach(el -> System.out.print(el + " "));

    }
}
