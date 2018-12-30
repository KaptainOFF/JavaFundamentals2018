import java.io.*;
import java.util.Scanner;

public class FileReading {

    public static void main(String[] args) {
        String resourceFolder = "C:\\Users\\ykapitanov\\IntelliJ\\" +
                "JavaFundamentals2018\\InputOutputFiles\\resources\\";

        String inPath = resourceFolder + "input.txt";
        String outPath = resourceFolder + "output.txt";

        try (Scanner scanner = new Scanner(new FileInputStream(inPath))) {
            PrintWriter writer = new PrintWriter(new FileOutputStream(outPath));
            while (scanner.hasNextLine()) {
                if(scanner.hasNextInt()) {
                    writer.println(scanner.nextInt());
                }
                scanner.next();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
