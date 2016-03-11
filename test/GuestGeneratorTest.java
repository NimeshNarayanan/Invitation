//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
///**
// * Created by nimeshp on 09/03/16.
// */
//public class GuestGeneratorTest {
//
//    @Test
//    public void test_create_person_details_should_give_person_details_in_a_guestsList_with_prefix_Mr() throws Exception {
//        String recordOfAPerson = "Julius,Barrows,Female,18,Veda haven,Vermont,Macedonia";
//        GuestGenerator guestGenerator = new GuestGenerator(recordOfAPerson);
//        Guests guests = guestGenerator.createPersonDetails();
//        assertEquals("Ms Julius Barrows",guests.getInformalName()[0]);
//    }
//
//    @Test
//    public void testCreatePersonDetailsShould_give_person_details_in_a_guests_list_with_prefix_Ms() throws Exception {
//        String recordOfAPerson = "Melody,Dooley,Female,31,West Shanna,Vermont,Bangladesh";
//        GuestGenerator guestGenerator = new GuestGenerator(recordOfAPerson);
//        Guests guests = guestGenerator.createPersonDetails();
//        assertEquals("Ms Melody Dooley",guests.getInformalName()[0]);
//    }
//
//    @Test
//    public void testCreatePersonDetailsShould_give_person_details_in_a_guestsList_with_prefix_Ms_in_informal_format() throws Exception {
//        String recordOfAPerson = "Melody,Dooley,Female,31,West Shanna,Vermont,Bangladesh\nJulius,Barrows,Female,18,Veda haven,Vermont,Macedonia";
//        GuestGenerator guestGenerator = new GuestGenerator(recordOfAPerson);
//        Guests guests = guestGenerator.createPersonDetails();
//        assertEquals("Ms Dooley, Melody",guests.getFormalName()[0]);
//        assertEquals("Ms Barrows, Julius",guests.getFormalName()[1]);
//    }
//
//    @Test
//    public void testCreatePersonDetailsShould_give_person_details_in_a_guests_list_with_prefix_Ms_and_Mr_inInformal_format() throws Exception {
//        String recordOfAPerson = "Gavin,Hyatt,Male,36,Crooks ton,Illinois,Romania\nJulius,Barrows,Female,18,Veda haven,Vermont,Macedonia";
//        GuestGenerator guestGenerator = new GuestGenerator(recordOfAPerson);
//        Guests guests = guestGenerator.createPersonDetails();
//        assertEquals("Mr Hyatt, Gavin",guests.getFormalName()[0]);
//        assertEquals("Ms Barrows, Julius",guests.getFormalName()[1]);
//    }
//
//}