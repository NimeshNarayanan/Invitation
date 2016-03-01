/**
 * Created by nimeshp on 01/03/16.
 */
public class Name {
    private String firstName;
    private String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName =lastName;
    }

    public String getFirstLast(){
        return firstName+" "+lastName;
    };
}
