package personal;

import factory.LabelGenerator;
import org.junit.Test;
import personal.*;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void test_isAgeGrater_should_give_true_or_false_is_person_have_age_greater_than_a_given_age() throws Exception {
        Name name = new Name("mohan", "lal");
        Address addr = new Address("alapuzha", "kerala", "india");
        Gender gender = Gender.MALE;
        Age age = new Age(28);
        Person mohan = new Person(name, addr, gender, age);
        assertTrue(mohan.isAgeGrater(26));
    }
    @Test
    public void test_isAgeGrater_should_give_false_is_person_have_age_greater_than_a_given_age() throws Exception {
        Name name = new Name("sarn", "raj");
        Address addr = new Address("gudam", "chennai", "india");
        Gender gender = Gender.MALE;
        Age age = new Age(28);
        Person saran = new Person(name, addr, gender, age);
        assertFalse(saran.isAgeGrater(29));
    }

    @Test
    public void test_isFromCountry_should_give_true_or_false_depend_on_person_is_from_specific_country() throws Exception {
        Name name = new Name("dulgur", "salman");
        Address addr = new Address("alapuzha", "kerala", "india");
        Gender gender = Gender.MALE;
        Age age = new Age(28);
        Person dulqur = new Person(name, addr, gender, age);
        assertTrue(dulqur.isFromCountry("india"));
    }

    @Test
    public void test_isFromCountry_should_give_false_depend_on_person_is_from_specific_country() throws Exception {
        Name name = new Name("rohith", "kumar");
        Address addr = new Address("alapuzha", "kerala", "india");
        Gender gender = Gender.MALE;
        Age age = new Age(28);
        Person dulqur = new Person(name, addr, gender, age);
        assertFalse(dulqur.isFromCountry("Macedonia"));
    }

    @Test
    public void test_usetemplet_should_give_the_formated_personal_details() throws Exception {
        Name name = new Name("Goudam", "joh");
        Address addr = new Address("devo", "karnataka", "india");
        Gender gender = Gender.MALE;
        Age age = new Age(23);
        Person goudam = new Person(name, addr, gender, age);
        String formatedDetail = goudam.useLabel(new LabelGenerator(),true);
        String expectedString = "Mr Goudam joh\ndevo, karnataka,\nindia\n";
        assertEquals(expectedString,formatedDetail);

    }
}