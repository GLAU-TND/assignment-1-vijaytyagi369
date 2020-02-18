package contactADT;

public interface contactADT<E> {
   abstract void addContact();
    void viewContact();
    void searchContact();
     E deleteContact();
}
