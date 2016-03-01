import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nimeshp on 01/03/16.
 */
public class NameTest {

    @Test
    public void testGetFirstLast() throws Exception {
        Name name = new Name("Nimesh","Narayanan");
        String fullName = "Nimesh Narayanan";
        assertEquals(fullName,name.getFirstLast());
    }
}