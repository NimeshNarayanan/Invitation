import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void testGetAddressGivesRepresentationOfAddress() throws Exception {
        Name name = new Name("mohan", "lal");
        Address addr = new Address("alapuzha", "kerala", "india");
        Gender gender = Gender.Male;
        Person dulqur = new Person(name, addr,gender, 28);
        String expected = "mohan lal\nalapuzha, kerala, india";
        assertEquals(expected, dulqur.getAddress());

    }

    @Test
    public void testGetAddressWithOptionsGiven() throws Exception {
        Name name = new Name("mohan", "lal");
        Address addr = new Address("alapuzha", "kerala", "india");
        Gender gender = Gender.Male;
        Person mohan = new Person(name, addr,gender, 28);
        String expected = "mohan lal\nalapuzha, kerala, india";
        assertEquals(expected, mohan.getAddress(true, ", "));

        expected = "lal, mohan\nalapuzha, kerala, india";
        assertEquals(expected, mohan.getAddress(false, ", "));
    }

    @Test
    public void testGetAddressWithCountry() throws Exception {
        Name name = new Name("mohan", "lal");
        Address addr = new Address("alapuzha", "kerala", "india");
        Gender gender = Gender.Male;
        Person mohan = new Person(name, addr,gender, 28);
        String expected = "Mr mohan lal, india";
        assertEquals(expected, mohan.getNameWithCountry());
    }

    @Test
    public void testGetAddressWithCountryWithGivenOptions() throws Exception {
        Name name = new Name("mohan", "lal");
        Address addr = new Address("alapuzha", "kerala", "india");
        Gender gender = Gender.Male;
        Person mohan = new Person(name, addr,gender, 28);
        String expected = "Mr mohan lal, india";
        assertEquals(expected, mohan.getNameWithCountry(true, ", "));
        expected = "Mr lal, mohan, india";
        assertEquals(expected, mohan.getNameWithCountry(false, ", "));
    }

    @Test
    public void testgetNameWithTitleWillGiveFullNameWithTitle() throws Exception {
        Name name = new Name("mohan", "lal");
        Address addr = new Address("alapuzha", "kerala", "india");
        Gender gender = Gender.Male;
        Person mohan = new Person(name, addr,gender, 28);
        String expected = "Mr mohan lal";
        assertEquals(expected, mohan.getNameWithTitle(true));
    }
    @Test
    public void testgetNameWithTitleWillGiveFullNameFormalyWithTitle() throws Exception {
        Name name = new Name("Mohan", "Lal");
        Address addr = new Address("alapuzha", "kerala", "india");
        Gender gender = Gender.Male;
        Person mohan = new Person(name, addr,gender, 28);
        String expected = "Mr Lal, Mohan";
        assertEquals(expected, mohan.getNameWithTitle(false));
    }
}