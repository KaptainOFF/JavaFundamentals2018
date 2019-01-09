import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Day day = Day.MONDAY;

        System.out.println(day);

    }
    private enum Day
    {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY;
    }

}
