import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void TestGetFirstLastNameShouldGiveFullNmeWithSufix()throws Exception {
        Name name = new Name("Nimesh", "Narayanan");
        name.setMrPrefix();
        Address address = new Address("vilayil","kerala","india");
        Person person = new Person(name,22,address);
        assertEquals("Mr Nimesh Narayanan",person.getFirstLastName(" "));
    }

    @Test
    public void TesGetLastFirstNameShouldGiveFullNameWithSufix() throws Exception {
        Name name = new Name("Ayyar", "krishna");
        name.setMrPrefix();
        Address address = new Address("vilayil","kerala","india");
        Person person = new Person(name,45,address);
        assertEquals("Mr krishna,Ayyar",person.getLastFirstName(","));
    }
}