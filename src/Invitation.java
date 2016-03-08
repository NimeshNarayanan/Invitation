import org.apache.commons.cli.CommandLine;

import java.io.IOException;
import java.util.List;

public class Invitation {
    public static void main(String[] args)throws IOException {

        Cli cli = new Cli(args);
        CommandLine cmds = cli.parse();
        String[] files = cmds.getArgs();
        System.out.println("files " + files[0]);
        System.out.println(cmds.getOptions());
        FileToProcess fileToProcess = new FileToProcess(files[0]);
        List<String> data = fileToProcess.readAndStringfy();
//        String [] rec = records.split("\n");
//        System.out.printf(rec[0]);

    }
}
