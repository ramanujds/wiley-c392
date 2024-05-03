package ds.queue;

public class Queue {

    private int maxSize;
    private String[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int maxSize){
        this.maxSize = maxSize;
        queueArray = new String[maxSize];
        front=0;
        rear=-1;
        nItems=0;
    }

    public boolean insert(String item){
        if (isFull()){
            return false;
        }



        rear++;
        queueArray[rear]=item;
        nItems++;
        return true;
    }

    public String remove(){
        if (isEmpty()){
            throw  new RuntimeException("Queue is empty");
        }
        String item = queueArray[front];
        front++;
        nItems--;
        return item;
    }

    public boolean isEmpty(){
        return nItems==0;
    }

    public boolean isFull(){
        return nItems==maxSize;
    }

    public String peek(){
        return queueArray[front];
    }

}
