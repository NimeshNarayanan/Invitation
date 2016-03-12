import factory.GuestGenerator;
import factory.InvitationLabelGenerator;
import factory.LabelGenerator;
import handlers.Cli;
import handlers.FileToProcess;
import handlers.Guests;
import org.apache.commons.cli.*;
import templets.LastNameFirst;

import java.io.IOException;
import java.util.ArrayList;
//import java.util.List;

public class Invitation {
    public static void printLabel(Guests listOfPeople, boolean isLastNameFirst){
        InvitationLabelGenerator labelGenerator = isLastNameFirst ? new LastNameFirst(listOfPeople) : new LabelGenerator(listOfPeople);
        ArrayList<String> list = labelGenerator.parsePeople();
        list.forEach(System.out::println);
    }
    public static void main(String[] args)throws IOException {

        Cli cli = new Cli(args);
        CommandLine cmds = cli.parse();
        String[] files = cmds.getArgs();
        Option[] options = cmds.getOptions();


        System.out.println("files " + files[0]);
        String data = FileToProcess.readAndStringfy(files[0]);
        GuestGenerator guestGenerator = new GuestGenerator(data);
        Guests people = guestGenerator.createPersonDetails();
        Guests filteredListOfPeople = people;
        for (int i = 0; i < options.length; i++) {
            String command = options[i].getOpt();
            System.out.println("hai"+options[i]);
            switch (command) {
                case "c":
                    filteredListOfPeople = filteredListOfPeople.filterByCountry(options[i].getValue());
                    break;
                case "a":
                    filteredListOfPeople = filteredListOfPeople.getPersonsAgeGreaterThan(Integer.parseInt(options[i].getValue()));
                    break;
            }
        }

//        LabelGenerator labelGenerator = new LabelGenerator(people);
//        ArrayList<String> list = labelGenerator.printFullNameWithPrefix(true);
        printLabel(filteredListOfPeople,false);

    }

}
