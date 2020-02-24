package main;



import contactADT.contactADT;
import execution.linkedList;
import execution.myContact;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        myContact user = new myContact();
        boolean response = true;
        do {
            System.out.println("Welcome to Vj's's Contact List App\n" +
                    "Press 1 to add a new contact\n" +
                    "Press 2 to view all contacts\n" +
                    "Press 3 to search for a contact\n" +
                    "Press 4 to delete a contact\n" +
                    "Press 5 to exit program ");
            String str = sc.next();
            if (str.length() > 1) {
                System.out.println("Invaild Option");
                continue;
            }
            char choice = str.charAt(0);
            switch (choice) {
                case '1':
                    user.addContact();
                    break;
                case '2':
                    user.viewContacts();
                    break;
                case '3':
                    user.searchContact();
                    break;
                case '4':
                    user.deleteContact();
                    break;
                case '5':
                    System.out.println("Thank You");
                    System.out.println("Have a great Day");
                    response = false;
                    break;
                default:
                    System.out.println("Invaild Option");
            }

        } while (response);

        sc.close();
    }

}
