public class Male extends Person {

    public Male(Name name, int age, Address address) {
        super(name, age, address);
        name.setMrPrefix();
    }
}
