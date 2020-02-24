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
}
