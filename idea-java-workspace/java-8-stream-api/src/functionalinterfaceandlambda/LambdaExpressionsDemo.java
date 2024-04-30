package functionalinterfaceandlambda;


import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;

interface Printable {
    void print();
    default void scan(){
        System.out.println("Scanning something..");
    }


    static void show(){
        System.out.println("Hey there..");
    }
}

interface Scannable {
    public void scan(String filename);
}

interface Calculator {
    double operate(double a, double b);
}

interface StringCheckOperation{
    boolean checkString(String str);
}

interface StringLengthOperation{
    int getLength(String str);
}

// lambda expression to get the length of a string
// lambda expression to find the max f two numbers
// lambda expression to check if a string is not blank


public class LambdaExpressionsDemo {

    public static void main(String[] args) {
        Printable printable = () -> System.out.println("Hello World");
        printable.scan();
        Scannable scannable = fileName -> System.out.println("Scanning " + fileName);
        Calculator calc = (a, b) -> a/b;



        printable.print();
        scannable.scan("MyFile.txt");
        double result = calc.operate(10,0);
        System.out.println(result);

        StringCheckOperation checkBlank = str -> str.isBlank();

        StringLengthOperation strLength = str -> str.length();

        System.out.println(checkBlank.checkString(" "));

        System.out.println(strLength.getLength("abc"));

        Printable.show();

    }


}
