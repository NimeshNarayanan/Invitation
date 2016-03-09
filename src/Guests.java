
import java.util.ArrayList;
import java.util.List;

public class Guests {
    ArrayList<Person> people;

    public Guests() {
        this.people = new ArrayList<>();
    }
    public void addGuest(Person guest){
        this.people.add(guest);
    }
    public String[] getInformalName(){
        String []names = new String[people.size()];
        int count = 0;
        for (Person person : people) {
            names[count] = person.getNameWithTitle(true);
            count++;
        }
        return  names;
    }
    public String[] getFormalName(){
        String []names = new String[people.size()];
        int count = 0;
        for (Person person : people) {
            names[count] = person.getNameWithTitle(false);
            count++;
        }
        return  names;
    }
    public Guests getPersonFromCountry(String country){
        Guests peopleFromCountry = new Guests();

        for (Person person : people)
            if (person.isFromCountry(country))
                peopleFromCountry.addGuest(person);

        return peopleFromCountry;
    }

}
