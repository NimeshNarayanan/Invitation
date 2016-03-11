package personal;
public class Address {
    protected String city;
    protected String state;
    protected String country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

//    public String getCity() {
//        return city;
//    }
//
//    public String getState() {
//        return state;
//    }

    public String getCountry() {
        return country;
    }

    public String toString() {
        return city + ", " +
                state + ", " +
                country;


    }
}
