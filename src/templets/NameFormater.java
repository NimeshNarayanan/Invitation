package templets;

import factory.TempletFormat;

public class NameFormater implements TempletFormat {
    private String nameFormat;
    public NameFormater(String nameFormat) {
        this.nameFormat = nameFormat;
    }


    @Override
    public String setTemplet(String firstName, String lastName) {
        if(nameFormat.equals("firstNameFirst"))
            return firstName+" "+lastName;
        return lastName+" "+firstName;
    }
}
