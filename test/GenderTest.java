import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nimeshp on 07/03/16.
 */
public class GenderTest {
    @Test
    public void test_prefix_for_male() throws Exception {
        Gender male = Gender.Male;
        assertEquals(male.title(),"Mr ");
    }

    @Test
    public void test_prefix_for_female() throws Exception {
        Gender female = Gender.Female;
        assertEquals(female.title(),"Ms ");
    }

}