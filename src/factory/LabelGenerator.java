package factory;

public class LabelGenerator {
    private String formatedName;
    private String address;
    private String formatedPersonDetail;

    public void getNameByFormat(String firstName,String lastName,boolean formatChoice){
       formatedName = formatChoice?firstName+" "+lastName:lastName+", "+firstName;
    }

    public void getAddressByFormat(String city, String state, String country) {
        address = String.format("%s, %s,\n%s",city,state,country);
    }
    public void getFormatedPersonDetails(String gender){
       formatedPersonDetail = String.format("%s %s\n%s",gender,formatedName,address);
    }

    public String getFormatedPersonDetails() {
        return formatedPersonDetail+"\n";
    }

    public String getFormatedName() {
        return formatedName;
    }

    public String getAddress() {
        return address;
    }
}
