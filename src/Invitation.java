import factory.GuestGenerator;
import handlers.Cli;
import handlers.FileToProcess;
import handlers.Guests;
import org.apache.commons.cli.*;

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
        Guests sortedListOfPeople = people;
        for (int i = 0; i < options.length; i++) {
            String command = options[i].getOpt();
            System.out.println("hai"+command);
            switch (command) {
                case "c":
                    sortedListOfPeople = people.filterByCountry(options[i].getValue());
//                    people.setTemplate(new LabelGenerator());
//                    people.setTemplate(new LastNameFirst());
                    break;
                case "a":
                    sortedListOfPeople = people.getPersonsAgeGreaterThan(Integer.parseInt(options[i].getValue()));
//                    people.setTemplate(new FirstNameFirst());
                    break;
            }
        }

//        LabelGenerator labelGenerator = new LabelGenerator(people);
//        ArrayList<String> list = labelGenerator.printFullNameWithPrefix(true);
        printLabel(sortedListOfPeople,false);

    }

}
