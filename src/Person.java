public class Person{
    protected int age;
    protected Address address;
    protected Name name;

    public Person(Name name,int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getFirstLastName(String seperator) {
        return name.getFirstLastName(seperator);
    }
    public String getLastFirstName(String seperator){
        return name.getLastFirstName(seperator);
    }
}
