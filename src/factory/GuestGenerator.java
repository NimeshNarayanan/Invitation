package factory;

import handlers.Guests;
import personal.*;

public class GuestGenerator {
    protected String guestRecords;

    public GuestGenerator(String guestRecords) {
        this.guestRecords = guestRecords;
    }
    public Guests createPersonDetails() {
        String[] records = guestRecords.split("\n");
        Guests guests = new Guests();

        for (String personData : records) {
            String[] personDatas = personData.split(",");
            Name name = new Name(personDatas[0],personDatas[1]);
            String gend =  personDatas[2].toUpperCase();
            Gender gender = gend.equals("MALE") ? Gender.MALE : Gender.FEMALE;
            Integer ageOfPerson = Integer.parseUnsignedInt(personDatas[3]);
            Age age = new Age(ageOfPerson);
            Address address = new Address(personDatas[4],personDatas[5],personDatas[6]);
            Person guest = new Person(name, address,gender, age);
            guests.addGuest(guest);
        }
        return guests;
    }
}
