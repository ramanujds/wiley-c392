package ds.linkedlist;

public class SinglyLinkedList {

    private Node first;
    private Node last;

    public SinglyLinkedList(){
        first=null;
        last=null;
    }

    public boolean isEmpty(){
        return first==null;
    }

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty()){
            last=newNode;
        }
        newNode.next=first;
        first=newNode;
    }

    public void insertLast(int data){

        Node newNode = new Node();
        newNode.data = data;
        if(isEmpty()){
            first=newNode;
            last=newNode;
        }
        else {
            last.next=newNode;
            last=newNode;
        }


    }

    public Node removeFirst(){
        Node temp = first;
        if (first.next==null){
            last=null;
        }
        first=first.next;
        return temp;
    }


    public void displayList(){
        Node current = first;
        do {
            current.displayNode();
            current=current.next;
        }while (current!=null);
        System.out.println();
    }

}
