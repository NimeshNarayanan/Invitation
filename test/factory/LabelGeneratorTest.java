package factory;

import org.junit.Test;

import static org.junit.Assert.*;

public class LabelGeneratorTest {

    @Test
    public void test_GetNameByFormat_should_give_name_in_a_format() throws Exception {
        LabelGenerator labelGenerator = new LabelGenerator();
        labelGenerator.getNameByFormat("Ann","Augustian",true);
        assertEquals("Ann Augustian",labelGenerator.getFormatedName());
    }
    @Test
    public void test_GetNameByFormat_should_give_name_in_formal_format() throws Exception {
        LabelGenerator labelGenerator = new LabelGenerator();
        labelGenerator.getNameByFormat("Ann","Augustian",false);
        assertEquals("Augustian, Ann",labelGenerator.getFormatedName());
    }
    @Test
    public void test_GetAddressByFormat_it_will_give_address_as_coma_seperated_values() throws Exception {
        LabelGenerator labelGenerator = new LabelGenerator();
        labelGenerator.getAddressByFormat("sony city","karnataka","india");
        assertEquals("sony city, karnataka,\nindia",labelGenerator.getAddress());
    }

    @Test
    public void test_GetFormatedDetails_get_full_details_of_person() throws Exception {
        LabelGenerator labelGenerator = new LabelGenerator();
        labelGenerator.getNameByFormat("Ann","Augustian",false);
        labelGenerator.getAddressByFormat("sony city","karnataka","india");
        labelGenerator.getFormatedPersonDetails("Ms");
        assertEquals("Ms Augustian, Ann\nsony city, karnataka,\nindia\n",labelGenerator.getFormatedPersonDetails());
    }

}