import org.junit.Test;

import static org.junit.Assert.*;

public class NameTest {

    @Test
    public void testGetFirstLastName() throws Exception {
        Name name = new Name("Nimesh", "Narayanan");
        String fullName = "Nimesh Narayanan";
        assertEquals(fullName, name.getFirstLastName(" "));
    }

    @Test
    public void testGetLastFirstNameShouldGiveLastFirstNameSeperatedByCommas() throws Exception {
        Name name = new Name("ashique", "abu");
        String fullName = "abu,ashique";
        assertEquals(fullName, name.getLastFirstName(","));
    }

    @Test
    public void testSetSufixShouldGiveFullNameWithSufix() throws Exception {
        Name name = new Name("Leonardo", "DiCaprio");
        name.setMrPrefix();
        String sufixedName = "Mr Leonardo DiCaprio";
        assertEquals(sufixedName,name.getFirstLastName(" "));
    }
}