package handlers;

import factory.LabelGenerator;
import personal.Person;

import java.util.ArrayList;
import java.util.Iterator;

public class Guests {
    ArrayList<Person> people;

    public Guests() {
        this.people = new ArrayList<>();
    }

    public void addGuest(Person guest) {
        this.people.add(guest);
    }

    public Guests filterByCountry(String country) {
        Guests peopleFromCountry = new Guests();

        for (Person person : people)
            if (person.isFromCountry(country))
                peopleFromCountry.addGuest(person);

        return peopleFromCountry;
    }

    public Guests getPersonsAgeGreaterThan(int age) {
        Guests peopleWithAgeGreater = new Guests();

        for (Person person : people)
            if (person.isAgeGrater(age))
                peopleWithAgeGreater.addGuest(person);

        return peopleWithAgeGreater;
    }

    public ArrayList<String> setTemplet(LabelGenerator labelGenerator,boolean formatChoice) {
        ArrayList<String> formatedDetails = new ArrayList<>();
        for (Person person : people) {
            String label = person.useLabel(labelGenerator, formatChoice);
            formatedDetails.add(label);
        }
        return formatedDetails;
    }

    ;

    public Iterator iterator() {
        return people.iterator();
    }

    public int getSize() {
        return people.size();
    }
}
