package execution;


public class person {

    private String firstName;
    private String lastName;
    private linkedList<String> contactNumbers;
    private String email;

    public person(String firstName, String lastName, linkedList<String> contactNumbers, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNumbers = contactNumbers;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }



}
