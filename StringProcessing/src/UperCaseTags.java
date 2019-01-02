import java.util.Scanner;

public class UperCaseTags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("<upcase>|/upcase>");

        System.out.println();
        String output = "";
        for (int i = 0; i < words.length; i++) {
            if(words[i].contains("<")) {
                words[i] = words[i].replace("<", "").toUpperCase();
            }
            output += words[i];
        }

        System.out.println(output);
    }
}
