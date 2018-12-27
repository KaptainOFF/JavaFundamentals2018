import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class MatchingSets {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        String output = "";

        String[] setLengths = scanner.nextLine().split("\\s+");

        int firstSetLen = Integer.parseInt(setLengths[0]);
        int secondSetLen = Integer.parseInt(setLengths[1]);

        firstSet = populateSet(firstSetLen);
        secondSet = populateSet(secondSetLen);

        if(firstSetLen >= secondSetLen) {
            for (Integer number : firstSet) {
                if (secondSet.contains(number)) {
                    output += number + " ";
                }
            }
        } else {
            for (Integer number : secondSet) {
                if (firstSet.contains(number)) {
                    output = number + " ";
                }
            }
        }
        System.out.println(output);
    }

    private static Set<Integer> populateSet(int firstSetLen) {
        Set<Integer> firstSet = new LinkedHashSet<>();
        for (int i = 0; i < firstSetLen; i++) {
            firstSet.add(Integer.parseInt(scanner.nextLine()));
        }
        return firstSet;
    }
}
