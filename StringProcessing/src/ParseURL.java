import java.util.Scanner;

public class ParseURL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String url = scanner.nextLine().trim();
        String[] resources = url.split("://");

        if (resources.length > 2) {
            System.out.println("Invalid URL");
        } else {
            int index = resources[1].indexOf("/");
            String protcol = resources[0];
            String server = resources[1].substring(0,index);
            String resource = resources[1].substring(index + 1);
            System.out.printf("Protocol = %1$s%nServer = %2$s%nResources = %3$s",protcol, server, resource);
        }
    }


    private static boolean checkUrl(String[] symbols) {
        for (int i = 2; i < symbols.length; i++) {
            if ("://".equals(symbols[i])) {
                return false;
            }
        }
        return true;
    }
}
