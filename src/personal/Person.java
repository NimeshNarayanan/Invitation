package personal;
public class Person {
    protected Address address;
    protected Name name;
    protected Gender gender;
    protected Age age;

    public Person(Name name, Address address,Gender gender,Age age) {
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.age = age;
    }
    private String getNameByChoice(boolean choice) {
        return (choice) ? name.getFirstLastName() : name.getLastFirstName();
    }
//    @Override
//    public String getAddress() {
//        return getAddress(true, " ");
//    }
    public String getNameWithTitle(boolean choice){
       return  gender.toString()+getNameByChoice(choice);
    }
    public String getAddress(boolean choice, String separator) {
        String name = getNameByChoice(choice);
        return name + "\n" + address.toString();
    }

    public String getNameWithCountry() {
        return getNameWithCountry(true);
    }

    public String getNameWithCountry(boolean choice) {
        String name = getNameByChoice(choice);
        return gender.toString()+name + ", " + address.getCountry();
    }
    public boolean isAgeGrater(int age){
        return this.age.isGraterThan(age);
    }
    public boolean isFromCountry(String country){
        return country.equals(address.getCountry());
    }

    public Gender getGender() {
        return gender;
    }
    public Address getAddress(){
        return  address;
    }

    public Name getName() {
        return name;
    }

    public Age getAge() {
        return age;
    }
}
