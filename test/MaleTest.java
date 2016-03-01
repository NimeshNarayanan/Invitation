import org.junit.Test;

import static org.junit.Assert.*;

public class MaleTest {
    @Test
    public void TestGetFirstLastNameShouldGiveFullNmeWithSufix()throws Exception {
        Name name = new Name("Nimesh", "Narayanan");
        name.setMrPrefix();
        Address address = new Address("vilayil","kerala","india");
        Person person = new Male(name,22,address);
        assertEquals("Mr Nimesh Narayanan",person.getFirstLastName(" "));
    }
    @Test
    public void TestGetLastFirstNameShouldGiveFullNmeWithSufix()throws Exception {
        Name name = new Name("Nimesh", "Narayanan");
        Address address = new Address("vilayil","kerala","india");
        Person person = new Male(name,22,address);
        assertEquals("Mr Narayanan,Nimesh",person.getLastFirstName(","));
    }
}