package personal;
public class Name{
    protected String firstName;
    protected String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName =lastName;
    }

    public String getFirstLastName() {
        return firstName+" "+lastName;
    }
    public String getLastFirstName(){
        return lastName+", "+firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

//    public String parse(LabelGeneratorTest labelGeneratorTest,boolean formatChoice) {
//    }
}
