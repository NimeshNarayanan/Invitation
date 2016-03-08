import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InvitationCards {
    protected String []records;

    public InvitationCards(String[] records) {
        this.records = records;
    }
    public ArrayList<String> getInformalRepresentation(String records) throws IOException {
        FileToProcess fileToProcess = new FileToProcess(records);
        List<String> lines = fileToProcess.readAndStringfy();
        ArrayList<String> list = new ArrayList<String>();
        for (String line : lines) {
            String[] array = line.split(",");
            Gender gender = array[2].contains("Female") ? Gender.Female : Gender.Male;
            Address address = new Address(array[4],array[5],array[6]);
            int age = Integer.parseInt(array[3]);
            Name name = new Name(array[0],array[1]);
            Person person = new Person(name,address,gender,age);




        }
        return list;
    }
}
