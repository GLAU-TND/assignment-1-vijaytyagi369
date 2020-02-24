package execution;
import contactADT.singleLinkedListadt;

public class linkedList<E>implements singleLinkedListadt<E> {









    @Override
    public void add(E item) {

    }

    @Override
    public E getData(int index) {
        return null;
    }


    private static class Node<E> {
        private E data;
        private Node<E> next;
    }
}
