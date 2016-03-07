import org.apache.commons.cli.CommandLine;

import java.io.IOException;

public class Invitation {
    public static void main(String[] args)throws IOException {

        Cli cli = new Cli(args);
        CommandLine cmds = cli.parse();
        String[] files = cmds.getArgs();
        System.out.println("files " + files[0]);
        System.out.println(cmds.getOptions());
        String records = FileToProcess.readAndStringfy(files[0]);
        String [] rec = records.split("\n");
        System.out.printf(rec[0]);

    }
}
