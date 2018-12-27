import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> elementsCount = new TreeMap<>();

        char[] elements = scanner.nextLine().trim().toCharArray();

        for (char element : elements) {
            if (!elementsCount.containsKey(element)) {
                elementsCount.put(element,0);
            }
            elementsCount.put(element, elementsCount.get(element) + 1);
        }

        for (char key : elementsCount.keySet()) {
            System.out.printf("%c: %d time/s%n",key,elementsCount.get(key) );
        }

    }
}
