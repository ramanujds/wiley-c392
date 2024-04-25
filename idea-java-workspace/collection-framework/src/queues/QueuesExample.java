package queues;

import java.util.*;

public class QueuesExample {

    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();

        queue.offer("Harsh");
        queue.offer("Gaurav");
        queue.offer("Karan");
        queue.offer("Suraj");
        queue.offer("Suraj");
        queue.offer("Suraj");

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }





    }

}
