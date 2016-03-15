package handlers;

import factory.GuestGenerator;
import handlers.Guests;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuestsTest {
    Guests guests;

    @Before
    public void setUp() throws Exception {
        String personsRecord = "Cyril,Fay,Male,24,Katlynn view,Illinois,Slovakia (Slovak Republic)\n" +
                "Julius,Barrows,Female,18,Veda haven,Vermont,Macedonia\n" +
                "Brionna,Lubowitz,Male,30,New Alanna,Illinois,Slovakia (Slovak Republic)";
        GuestGenerator guestGenerator = new GuestGenerator(personsRecord);
        guests = guestGenerator.createPersonDetails();
    }

    @Test
    public void test_getPersonFromCountry_will_give_persons_from_specific_country() throws Exception {
        Guests sortedPeople = guests.filterByCountry("Slovakia (Slovak Republic)");
        assertEquals(2,sortedPeople.getSize());
    }

    @Test
    public void test_getPersonFromCountry_will_give_persons_count_from_specific_country() throws Exception {
        Guests sortedPeople = guests.filterByCountry("india");
        assertEquals(0,sortedPeople.getSize());
    }

    @Test
    public void test_getPersonsAgeGreaterThan_will_give_the_count_of_people_who_have_age_greater_than_a_specific_age() throws Exception {
        Guests sortedPeople = guests.getPersonsAgeGreaterThan(18);
        assertEquals(2,sortedPeople.getSize());
    }
    @Test
    public void test_getPersonsAgeGreaterThan_will_give_the_count_of_people_zero_if_no_one_have_age_greater_than_a_specific_age() throws Exception {
        Guests sortedPeople = guests.getPersonsAgeGreaterThan(40);
        assertEquals(0,sortedPeople.getSize());
    }

    @Test
    public void test_getSize_should_give_no_of_of_people_for_the_birth_day_party() throws Exception {
        assertEquals(3,guests.getSize());
    }
}