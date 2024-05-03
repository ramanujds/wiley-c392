package ds.queue;



public class QueueExample {

    public static void main(String[] args) {

        Queue queue = new Queue(10);

        System.out.println(queue.insert("Javed"));
        System.out.println(queue.insert("Harsh"));
        System.out.println(queue.insert("Karan"));



        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());




    }

}
