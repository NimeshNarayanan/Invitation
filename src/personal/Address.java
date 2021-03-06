package personal;

import factory.LabelGenerator;

public class Address {
    protected String city;
    protected String state;
    protected String country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
    public void formatAddress(LabelGenerator labelGenerator) {
        labelGenerator.getAddressByFormat(city,state,country);
    }

    public String toString() {
        return city + ", " +
                state + ", " +
                country;


    }
}
