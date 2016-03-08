import org.apache.commons.cli.*;

import java.io.IOException;
import java.util.List;

public class Invitation {
    public static void main(String[] args)throws IOException {

        Cli cli = new Cli(args);
        CommandLine cmds = cli.parse();
        String[] files = cmds.getArgs();
        Option[] options = cmds.getOptions();

        System.out.println("files " + files[0]);
        String data = FileToProcess.readAndStringfy(files[0]);
        Guests people = createPersonDetails(data);
        String []names = people.gtformalName();
        for (int i = 0; i < options.length; i++) {
            String command = options[i].getOpt();
            System.out.println("hai"+command);
            switch (command) {
                case "l":
                    names = people.gtformalName();
//                    people = people.getPersonFromCountry(cmds.getOptionValue(command));
                    break;
                case "f":
                    names = people.getInformalName();
                    break;
            }
        }
        PrintLabel.printLabel(names);



    }

    private static Guests createPersonDetails(String file) {
        String[] records = file.split("\n");
        System.out.println("record"+records);
        Guests guests = new Guests();

        for (String personData : records) {
            String[] personDatas = personData.split(",");
            Name name = new Name(personDatas[0],personDatas[1]);
            String gend =  personDatas[2].toUpperCase();
            Gender gender = gend.equals("MALE") ? Gender.MALE : Gender.FEMALE;
            Integer age = Integer.parseUnsignedInt(personDatas[3]);
            Address address = new Address(personDatas[4],personDatas[5],personDatas[6]);
            Person guest = new Person(name, address,gender, age);
            guests.addGuest(guest);
        }
        return guests;
    }

}
