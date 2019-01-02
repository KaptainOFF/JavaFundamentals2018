import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class SortLines {
    public static void main(String[] args) {
        String resourceFolder = "C:\\Users\\ykapitanov\\IntelliJ\\" +
                "JavaFundamentals2018\\InputOutputFiles\\resources\\";

        String inPath = resourceFolder + "input.txt";
        String outPath = resourceFolder + "output2.txt";
        Path inputPath = Paths.get(inPath);
        Path outputPath = Paths.get(outPath);
        String rootDirectoryPath = resourceFolder + "Files-and-Streams";
        try {
            File rootDir = new File(rootDirectoryPath);
            File[] files = rootDir.listFiles();
            for (File file : files) {

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
