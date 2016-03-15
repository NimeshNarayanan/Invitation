package personal;

import factory.LabelGenerator;

public class Name{
    protected String firstName;
    protected String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName =lastName;
    }

    public void formatName(LabelGenerator labelGenerator, boolean nameFormat) {
        labelGenerator.getNameByFormat(firstName,lastName,nameFormat);
    }
}
