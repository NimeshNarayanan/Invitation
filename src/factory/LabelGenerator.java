package factory;

import factory.InvitationLabelGenerator;
import handlers.Guests;
import personal.Person;

import java.util.ArrayList;
import java.util.Iterator;

public class LabelGenerator implements InvitationLabelGenerator {
    private Guests guests;

    public LabelGenerator(Guests guests) {
        this.guests = guests;
    }



    public ArrayList<String> parsePeople() {
        ArrayList<String> list = new ArrayList<>();
        Iterator iterator = guests.iterator();
        while (iterator.hasNext()){
            Person person = (Person) iterator.next();
            list.add(String.format("%s %s %s\n%s",person.getGender().toString(),
                                    person.getName().getFirstName(),
                                    person.getName().getLastName(),
                                    person.getAddress().getCountry()));
        }
        return list;
    }
//    public String getNameByFormat(boolean formatChoice){
//        String formatedName =
//    }
}
