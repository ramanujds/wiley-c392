package ds.stack;


public class StackExample {


    public static void main(String[] args) {

//        java.util.Stack<Integer> stack = new java.util.Stack<>();
//        System.out.println(stack.push(1));

        Stack myStack = new Stack(2);
        myStack.push(2);
        myStack.push(5);


        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

//        while (!stack.isEmpty()) {
//            System.out.println(stack.pop());
//        }


    }

}
