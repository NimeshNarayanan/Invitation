import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nimeshp on 08/03/16.
 */
public class GuestsTest {
    Guests guests;
    @Before
    public void setUp() throws Exception {
        String personsRecord = "Gavin,Hyatt,Male,36,Crooks ton,Illinois,Romania\nJulius,Barrows,Female,18,Veda haven,Vermont,Macedonia";
        GuestGenerator guestGenerator = new GuestGenerator(personsRecord);
        guests = guestGenerator.createPersonDetails();
    }

    @Test
    public void test_getInformalName_will_give_All_persons_name_in_informal_format() throws Exception {
       assertEquals("Mr Gavin Hyatt",guests.getInformalName()[0]);
       assertEquals("Ms Julius Barrows",guests.getInformalName()[1]);
    }

    @Test
    public void test_getFormalName_should_give_person_name_in_Formal_format() throws Exception {
        assertEquals("Mr Hyatt, Gavin",guests.getFormalName()[0]);
        assertEquals("Ms Barrows, Julius",guests.getFormalName()[1]);
    }
}