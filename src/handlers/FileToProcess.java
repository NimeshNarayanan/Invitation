package handlers;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by nimeshp on 07/03/16.
 */
public class FileToProcess {
    public static  String readAndStringfy(String fileToRead) throws IOException {
        String fileContent;
        File file  = new File(fileToRead);
        FileReader fr = new FileReader(file);
        char[] characters = new char[(int) file.length()];
        fr.read(characters);
        fileContent = new String(characters);
        fr.close();
        return fileContent;
    }
}
