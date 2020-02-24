package execution;

import contactADT.contactADT;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class myContact implements contactADT {
    Scanner sc = new Scanner(System.in);

    linkedList<person> MyContactsBook = new linkedList<>();
    linkedList<String> contactNumbers = new linkedList<>();


    @Override
    public void addContact() {
        System.out.println("You have chosen to add a new contact:");
        String firstname = GetFirstName();
        String lastname = GetLastname();
        contactNumbers = GetContactNumbers();
        String Email = GetEmail();
        person newContact;
        newContact = new person(firstname, lastname,contactNumbers, Email );
        int index = compareFirstName(firstname);
        MyContactsBook.add(index,newContact);
        System.out.println("Contact Added SucessFully");
        System.out.println();
        System.out.println();


    }

    @Override
    public void viewContacts() {

    }

    @Override
    public void deleteContact() {

    }

    @Override
    public void searchContact() {

    }

    private String GetFirstName() {
        System.out.println("Please Enter the name of the person");
        System.out.print("FirstName: ");
        String firstname = sc.next();
        return firstname;

    }

    private String GetLastname() {
        System.out.print("Lastname: ");
        String lastname = sc.next();
        return lastname;

    }

    private linkedList<String> GetContactNumbers() {
        linkedList<String> contactNumbers = new linkedList<String>();
        System.out.print("ContactNumber: ");
        String contactno = sc.next();
        while (true) {
            if (Pattern.matches("[0-9]+", contactno)) {
                contactNumbers.add(contactno);
                break;
            } else {
                System.out.println("Invaild PhoneNumber");

            }
        }
        while (true) {
            System.out.print("Do You Want to add a new Contactnumber? (y/n) :");
            String a = ((sc.next()).toLowerCase());
            char at = a.charAt(0);
            if (a.length() > 1) {
                System.out.println("Please Enter a Vaild Input i.e., y(lowercase) for Yes or n(lowercase for no)");
                continue;
            }
            if (at == 'y') {
                System.out.print("ContactNumber: ");
                contactno = sc.next();
                if (Pattern.matches("[0-9]+", contactno)) {

                    contactNumbers.add(contactno);
                } else {
                    System.out.println("Invaild PhoneNumber");
                }
            } else if (at == 'n') {
                break;
            } else {
                System.out.println("Please Enter a Vaild Input i.e., y(lowercase) for Yes or n(lowercase for NO)");
            }
        }

        return contactNumbers;


    }

    private String GetEmail() {
        String Email = null;
        while (true) {

            System.out.print("Do You Want to add an email ? (y/n) :");
            String a = ((sc.next()).toLowerCase());
            char at = a.charAt(0);
            if (a.length() > 1) {
                System.out.println("Please Enter a Vaild Input i.e., y(lowercase) for Yes or n(lowercase for NO)");
                continue;
            }
            if (at == 'y') {
                System.out.print("Email Address: ");
                Email = sc.next();
            } else if (at == 'n') {
                break;
            } else {
                System.out.println("Please Enter a Vaild Input i.e., y(lowercase) for Yes or n(lowercase for NO)");
            }
        }
        return Email;
    }

    private int compareFirstName(String Firstname) {
        int index = 0;
        if (MyContactsBook.size == 0) {
        } else {
            for (int i = 0; i < MyContactsBook.size; i++) {
                person temp = MyContactsBook.getData(i);
                String name = temp.getFirstName();
                name = name.toLowerCase();
                Firstname = Firstname.toLowerCase();
                if (name.compareTo(Firstname) < 0) {
                    index++;
                } else if (name.compareTo(Firstname) == 0) {
                    return index;

                } else {
                    break;
                }

            }

        }
        return index;
    }

}
