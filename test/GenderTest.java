import org.junit.Test;
import personal.Gender;

import static org.junit.Assert.*;

/**
 * Created by nimeshp on 07/03/16.
 */
public class GenderTest {
    @Test
    public void test_prefix_for_male() throws Exception {
        Gender male = Gender.MALE;
        assertEquals(male.toString(),"Mr ");
    }

    @Test
    public void test_prefix_for_female() throws Exception {
        Gender female = Gender.FEMALE;
        assertEquals(female.toString(),"Ms ");
    }

}