import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String resourceFolder = "C:\\Users\\ykapitanov\\IntelliJ\\" +
                "JavaFundamentals2018\\InputOutputFiles\\resources\\";

        String path = resourceFolder + "input.txt";

        try (FileInputStream fileInputStream = new FileInputStream(path);){

            int oneByte = fileInputStream.read();

            while(oneByte >= 0) {
                System.out.printf("%s ", oneByte);
                oneByte = fileInputStream.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
