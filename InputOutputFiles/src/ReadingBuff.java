import java.io.*;
import java.util.Scanner;

public class ReadingBuff {

    public static void main(String[] args) throws IOException {
        String resourceFolder = "C:\\Users\\ykapitanov\\IntelliJ\\" +
                "JavaFundamentals2018\\InputOutputFiles\\resources\\";

        String inPath = resourceFolder + "input.txt";
        String outPath = resourceFolder + "output1.txt";

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(inPath)))) {
            PrintWriter writer = new PrintWriter(new FileOutputStream(outPath));

            int counter = 1;
            String line = reader.readLine();

            while(line != null) {
                if(counter % 3 == 0) {
                    writer.println(line);
                }
                counter++;
                line = reader.readLine();
            }
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }

    }
}
