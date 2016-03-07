public class Person {
    protected int age;
    protected Address address;
    protected Name name;
    protected Gender gender;

    public Person(Name name,  Address address,Gender gender,int age) {
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.age = age;
    }
    private String getNameByChoice(boolean choice) {
        return (choice) ? name.getFirstLastName() : name.getLastFirstName();
    }

    public String getAddress() {
        return getAddress(true, " ");
    }
    public String getNameWithTitle(boolean choice){
       return  gender.title()+getNameByChoice(choice);
    }
    public String getAddress(boolean choice, String separator) {
        String name = getNameByChoice(choice);
        return name + "\n" + address.toString();
    }

    public String getNameWithCountry() {
        return getNameWithCountry(true, " ");
    }

    public String getNameWithCountry(boolean choice, String separator) {
        System.out.printf("gender"+gender);
        String name = getNameByChoice(choice);
        return gender.title()+name + ", " + address.getCountry();
    }

}
