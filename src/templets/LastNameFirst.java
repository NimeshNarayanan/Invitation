package templets;

import factory.InvitationLabelGenerator;
import handlers.Guests;
import personal.Person;

import java.util.ArrayList;
import java.util.Iterator;

public class LastNameFirst implements InvitationLabelGenerator {
    Guests guests;

    public LastNameFirst(Guests listOfPeople) {
        this.guests = listOfPeople;
    }

    @Override
    public ArrayList<String> parsePeople() {
        ArrayList<String> list = new ArrayList<>();
        Iterator iterator = guests.iterator();
        while (iterator.hasNext()){
            Person person = (Person) iterator.next();
            list.add(String.format("%s %s, %s\n",
                    person.getGender().toString(),
                    person.getName().getLastName(),
                    person.getName().getFirstName()));
        }
        return list;
    }
}
