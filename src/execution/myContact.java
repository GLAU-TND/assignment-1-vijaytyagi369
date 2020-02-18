package execution;
import contactADT.contactADT;
import java.util.Scanner;

import java.util.*;
public class myContact<E> implements contactADT<E> {
    private String firstName;
    private String lastName;
    private List<String> listNumber = new ArrayList<String>();
    private String email;
    Scanner sc=new Scanner(System.in);

    List<E> myContacts=new ArrayList<E>();

    @Override
    public void addContact() {
        System.out.println("You Have Chosen To Enter A New Contact");
        System.out.println("Please Enter The Name of The Person");
        System.out.println("First Name:");
        firstName=sc.nextLine();
        System.out.println("Last Name:");
        lastName=sc.nextLine();
        System.out.println("Phone No:");
        listNumber.add(sc.nextLine());

        System.out.println("Would you like add another Contact Number?(y/n)");
        boolean res;

        if(sc.nextLine()=="y")
            {res=true;}
        else{
            res=false;
        }

        while(res){
            System.out.println("Phone No:");
            listNumber.add(sc.nextLine());
            System.out.println("Would you like add another Contact Number?(y/n)");
            String a=sc.nextLine();
            if(a=="y"){
                res=true;
            }
            else{
                res=false;
            }
        }
        System.out.println("Would You Like TO Add Email Address?(y/n)");
        if(sc.nextLine()=="y"){
            System.out.println("Email:");
            email=sc.nextLine();
        }
        else{
            email="";
        }
        person entry = new person(firstName,lastName,listNumber,email);
        myContacts.add((E) entry);
        System.out.println(myContacts.get(0));





    }

    @Override
    public void viewContact() {

    }

    @Override
    public void searchContact() {

    }

    @Override
    public E deleteContact() {
        return null;
    }



}
