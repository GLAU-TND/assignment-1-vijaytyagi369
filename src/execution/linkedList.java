package execution;
import contactADT.singleLinkedListadt;

public class linkedList<E>implements singleLinkedListadt<E> {

    Node<E> head=null;
    public int size=0;

    private Node<E> getNode(int index) {
        Node<E> response=null;
        if(index<0 || index>size){
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        else{
            Node<E> temp=head;
            for(int i=0;i<index && temp!=null ;i++){
                temp=temp.getNext();

            }
            response=temp;
        }

        return response;
    }



    public void add(int index,E item) {
        if(index<0 || index>size){
            throw new IndexOutOfBoundsException();
        }
        else if(index==0) {
            addFirst(item);
        }
        else {
            addAfter(getNode(index-1),item);
        }

    }
    private void addFirst(E item){
        if (size==0){
            head=new Node<E>(item,head);
        }
        size++;
    }
    private void addAfter(Node<E>node,E item){
        node.next=new Node(item,node.getNext());
        size++;
    }










    @Override
    public void add(E item) {

        add(size,item);

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
