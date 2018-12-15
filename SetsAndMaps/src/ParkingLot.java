import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isFinished = false;
        Set<String> parkingLot = new HashSet<>();

        while(!isFinished) {
            String[] input = scanner.nextLine().split(", ");
            String command = input[0];

            if("END".equals(command)) {
                isFinished = true;
                continue;
            }

            String numberPlate = input[1];

            if("IN".equals(command)) {
                parkingLot.add(numberPlate);
            } else if("OUT".equals(command)){
                parkingLot.remove(numberPlate);
            }
        }

        if(parkingLot.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String s : parkingLot) {
                System.out.println(s);
            }
        }
    }
}
