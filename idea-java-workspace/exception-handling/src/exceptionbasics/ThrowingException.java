package exceptionbasics;

public class ThrowingException {

    static int factorial(int n){
        if(n<0){
            throw new NegativeNumberException("Input positive numbers only");
        }
        int f=1;
        while(n>0){
            f*=n;
            n--;
        }
        return f;
    }

    public static void main(String[] args) {
        try {
            System.out.println(factorial(-5));
        }
        catch (NegativeNumberException e){
            System.err.println("Input Positive Number Only");
        }
        System.out.println("Bye");
    }

}
