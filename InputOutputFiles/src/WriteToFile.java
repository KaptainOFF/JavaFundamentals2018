import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WriteToFile {
    public static void main(String[] args) {
        String resourceFolder = "C:\\Users\\ykapitanov\\IntelliJ\\" +
                "JavaFundamentals2018\\InputOutputFiles\\resources\\";

        String inPath = resourceFolder + "input.txt";
        String outPath = resourceFolder + "output.txt";

        try (FileInputStream fis = new FileInputStream(inPath);
            FileOutputStream fos = new FileOutputStream(outPath)){

            int oneByte = fis.read();
            int asciiCodeSpace = 32;
            int asciiCodeNewLine = 10;

            while(oneByte >= 0) {

                if(asciiCodeSpace == oneByte || asciiCodeNewLine == oneByte) {
                    fos.write(oneByte);
                } else {
                    char[] characters = String.valueOf(oneByte).toCharArray();
                    for (char character : characters) {
                        fos.write(character);
                    }
                }
                oneByte = fis.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
