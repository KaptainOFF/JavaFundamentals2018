import java.util.*;

public class SplitByWordCasing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lowerCase = new ArrayList<>();
        List<String> upperCase = new ArrayList<>();
        List<String> mixedCase = new ArrayList<>();

        String[] sentence = scanner.nextLine().split("[,;:.!()\"'/\\[\\]\\s\\\\]+");

        for (String word : sentence) {
            boolean isMixed = false;
            for (int i = 0; i < word.length(); i++) {
                if (word.trim().length() == 0) {
                    continue;
                }
                if (!Character.isLetter(word.toCharArray()[i])) {
                    isMixed = true;
                    mixedCase.add(word);
                }
            }
            if(!isMixed) {
                if(word.toLowerCase().equals(word)) {
                    lowerCase.add(word);
                } else if (word.toUpperCase().equals(word)) {
                    upperCase.add(word);
                } else {
                    mixedCase.add(word);
                }
            }

        }

        System.out.printf("Lower-case: %s%n", String.join(", ", lowerCase));
        System.out.printf("Mixed-case: %s%n", String.join(", ", mixedCase));
        System.out.printf("Upper-case: %s%n", String.join(", ", upperCase));
    }
}
