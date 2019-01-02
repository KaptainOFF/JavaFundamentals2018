import java.io.*;

public class Main {
    public static void main(String[] args) {
        String resourceFolder = "C:\\Users\\ykapitanov\\IntelliJ\\" +
                "JavaFundamentals2018\\InputOutputFiles\\resources\\";

        String serializableObject = resourceFolder + "object.ser";
        FootballPlayer footballPlayer = new FootballPlayer("Salah",27,"Liverpool",170000);

        try(FileOutputStream fos = new FileOutputStream(serializableObject);
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(footballPlayer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
