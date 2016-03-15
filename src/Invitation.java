import factory.GuestGenerator;
import factory.LabelGenerator;
import handlers.Cli;
import handlers.FileHandler;
import handlers.Guests;
import org.apache.commons.cli.*;

import java.io.IOException;
import java.util.ArrayList;

public class Invitation {
    public static void printLabel(ArrayList<String> listOfLabel){
        for (String label : listOfLabel) {
            System.out.printf(label);
        }
    }
    public static void main(String[] args)throws IOException {

        Cli cli = new Cli(args);
        CommandLine cmds = cli.parse();
        String[] files = cmds.getArgs();
        Option[] options = cmds.getOptions();


        System.out.println("files " + files[0]);
        String data = FileHandler.readAndStringfy(files[0]);
        GuestGenerator guestGenerator = new GuestGenerator(data);
        Guests people = guestGenerator.createPersonDetails();
        Boolean nameFormatChoice = true;
        for (Option option : options) {
            String command = option.getOpt();
            switch (command) {
                case "l":
                    nameFormatChoice = false;
                    break;
                case "c":
                    people = people.filterByCountry(option.getValue());
                    break;
                case "a":
                    people = people.getPersonsAgeGreaterThan(Integer.parseInt(option.getValue()));
                    break;
            }
        }

        ArrayList<String> listOfLabel = people.setTemplet(new LabelGenerator(),nameFormatChoice);
        printLabel(listOfLabel);

    }

}
