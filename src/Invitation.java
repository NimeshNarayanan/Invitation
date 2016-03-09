import org.apache.commons.cli.*;

import java.io.IOException;
//import java.util.List;

public class Invitation {
    public static void main(String[] args)throws IOException {

        Cli cli = new Cli(args);
        CommandLine cmds = cli.parse();
        String[] files = cmds.getArgs();
        Option[] options = cmds.getOptions();

        System.out.println("files " + files[0]);
        String data = FileToProcess.readAndStringfy(files[0]);
        GuestGenerator guestGenerator = new GuestGenerator(data);
        Guests people = guestGenerator.createPersonDetails();
        String []names = people.getFormalName();
        for (int i = 0; i < options.length; i++) {
            String command = options[i].getOpt();
            System.out.println("hai"+command);
            switch (command) {
                case "l":
                    names = people.getFormalName();
//                    people = people.getPersonFromCountry(cmds.getOptionValue(command));
                    break;
                case "f":
                    names = people.getInformalName();
                    break;
            }
        }
        PrintLabel.printLabel(names);



    }

}
