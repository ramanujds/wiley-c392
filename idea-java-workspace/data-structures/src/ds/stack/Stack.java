package ds.stack;

public class Stack {

    private int maxSize;
    private long[] stackArray;
    private int top;

    public Stack(int maxSize){
        this.maxSize=maxSize;
        stackArray = new long[maxSize];
        top = -1;
    }

    public long push(long data){
        if(isFull()){
            throw new RuntimeException("Stack is already full");
        }
        top++;
        stackArray[top]=data;
        return data;
    }

    public long pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack is already empty");
        }
        long data = stackArray[top];
        top--;
        return data;
    }

    public long peek(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public boolean isFull(){
        return top==(maxSize-1);
    }

}
