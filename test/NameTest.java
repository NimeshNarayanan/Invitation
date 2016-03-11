import org.junit.Test;
import personal.Name;

import static org.junit.Assert.*;

public class NameTest {

    @Test
    public void test_GetFirstLastName_sould_give_full_name_seperated_by_space() throws Exception {
        Name name = new Name("Nimesh", "Narayanan");
        String fullName = "Nimesh Narayanan";
        assertEquals(fullName, name.getFirstLastName());
    }

    @Test
    public void test_GetLastFirstName_should_give_last_first_name_seperated_by_commas() throws Exception {
        Name name = new Name("ashique", "abu");
        String fullName = "abu, ashique";
        assertEquals(fullName, name.getLastFirstName());
    }

    @Test
    public void testSetSufixShouldGiveFullNameWithSufix() throws Exception {
        Name name = new Name("Leonardo", "DiCaprio");
        String sufixedName = "Leonardo DiCaprio";
        assertEquals(sufixedName,name.getFirstLastName());
    }
}