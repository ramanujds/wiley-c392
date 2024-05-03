package ds.linkedlist;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) throws Exception {

        SinglyLinkedList list = new SinglyLinkedList();

        list.insertLast(10);
        list.insertLast(50);
        list.insertLast(20);
        list.insertLast(30);
        list.insertFirst(70);
        list.insertFirst(100);

//        list.removeFirst();
//        list.removeFirst();
        list.displayList();




    }



}
