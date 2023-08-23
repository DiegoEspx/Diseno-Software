package datePerson;
//In this exercise I try to find a very basic personal database.
//The idea is that depending on what is requested, it can be increased.
//In my case, I only put the basics for a question and answer box (name, last name, telephone and email) but a password, document, etc. could be added.
public class personalinformation {
    private String name;
    private String lastName;
    private String numberCel;
    private String gmail;
    
    public personalinformation(String name, String lastName, String numberCel, String gmail) {
        this.name = name;
        this.lastName = lastName;
        this.numberCel = numberCel;
        this.gmail = gmail;
    }
    
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
    
    public String getNumberCel() {
        return numberCel;
    }
    
    public String getGmail() {
        return gmail;
    }
    
    public void printpersonalinformation() {
        System.out.println("NAME: " + name);
        System.out.println("LAST NAME: " + lastName);
        System.out.println("NUMBER CEL: " + numberCel);
        System.out.println("GMAIL: " + gmail);
      
    }
}
