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

        private Node(E data,Node next){
            this.data=data;
            this.next=next;
        }

        private Node(E data){
            this.data=data;
        }
        private Node(){}

        public E getData() {
            return data;
        }

        public Node<E> getNext(){
            return next;
        }
    }
}
