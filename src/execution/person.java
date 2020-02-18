package execution;

import java.util.ArrayList;
import java.util.List;

public class person {
    private String firstName;
    private String lastName;
    private List<String> phoneNumber = new ArrayList<String>();
    private String email;

    public person(String firstName, String lastName, List<String> phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<String> getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
}
