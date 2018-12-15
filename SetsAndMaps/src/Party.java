import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Party {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> invitedGuests = new TreeSet<>();
        boolean isOver = false;

        while(!isOver) {
            String input = scanner.nextLine();
            if("END".equals(input)) {
                isOver = true;
            } else {
           if("PARTY".equals(input)) {
               while (!isOver) {
                   input = scanner.nextLine();
                   if ("END".equals(input)) {
                       isOver = true;
                   } else {
                       invitedGuests.remove(input);
                   }
               }
               }  else {
                   invitedGuests.add(input);
               }
           }
        }

        System.out.println(invitedGuests.size());
        for (String invitedGuest : invitedGuests) {
            System.out.println(invitedGuest);
        }
    }
}
