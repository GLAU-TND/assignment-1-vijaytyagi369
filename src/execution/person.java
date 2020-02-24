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

    public String getContactNumbers() {
        StringBuilder contacts = new StringBuilder();
        boolean a = false;
        for (int i = 0; i < contactNumbers.size; i++) {
            if (i == 0) {
                contacts.append(contactNumbers.getData(i));
            } else
                contacts.append(", ").append(contactNumbers.getData(i));
        }
        if (contactNumbers.size == 0) {
            contacts.append("null");
        } else if (contactNumbers.size == 1) {
            a = true;
        }

        return a ? "Contact: " + contacts : "Contacts:" + contacts;
    }


}
