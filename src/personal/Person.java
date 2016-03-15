package personal;

import factory.LabelGenerator;

public class Person {
    protected Address address;
    protected Name name;
    protected Gender gender;
    protected Age age;

    public Person(Name name, Address address, Gender gender, Age age) {
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.age = age;
    }

    public boolean isAgeGrater(int age) {
        return this.age.isGraterThan(age);
    }

    public boolean isFromCountry(String country) {
        return country.equals(address.getCountry());
    }

    public String useLabel(LabelGenerator labelGenerator, boolean formatChoice) {
        name.formatName(labelGenerator,formatChoice);
        address.formatAddress(labelGenerator);
        labelGenerator.getFormatedPersonDetails(gender.toString());
        LabelGenerator fromatedLabel = labelGenerator;
        return fromatedLabel.getFormatedPersonDetails();

    }
}
