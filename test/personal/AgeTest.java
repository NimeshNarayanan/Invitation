package personal;
import org.junit.Test;
import personal.Age;

import static org.junit.Assert.*;

public class AgeTest {

    @Test
    public void test_IsGraterThan_should_give_the_person_age_grater_than_a_specific_age() throws Exception {
        Age age = new Age(28);
        assertTrue(age.isGraterThan(27));
    }

    @Test
    public void testIsGraterThan_should_give_false_if_the_person_age_not_grater_than_a_specific_age() throws Exception {
        Age age = new Age(28);
        assertFalse(age.isGraterThan(29));
    }
}