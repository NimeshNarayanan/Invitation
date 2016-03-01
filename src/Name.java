public class Name {
    protected String firstName;
    protected String lastName;
    protected String sufix;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName =lastName;
        this.sufix = "";
    }

    public String getFirstLastName(String seperator){
        return sufix+firstName+seperator+lastName;
    }
    public String getLastFirstName(String seperator){
      return sufix+lastName+seperator+firstName;
    }

    public void setMrPrefix() {
        this.sufix = "Mr ";
    }

    public void setMsPrefix() {
        this.sufix = "Ms ";
    }
}
