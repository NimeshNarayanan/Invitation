public class Female extends Person {

    public Female(Name name, Address address, int age) {
        super(name, age, address);
        name.setMsPrefix();
    }
}
