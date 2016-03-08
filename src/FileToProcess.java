import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

/**
 * Created by nimeshp on 07/03/16.
 */
public class FileToProcess {
    private String fileName;

    public FileToProcess(String fileName) {
        this.fileName = fileName;
    }

    public List<String> readAndStringfy() throws IOException {
            File file = new File(this.fileName);
            List<String> lines = null;
            try {
                lines = Files.readAllLines(file.toPath(), Charset.defaultCharset());
            } catch (IOException e) {
                e.printStackTrace();
            }
            return lines;
    }
}
