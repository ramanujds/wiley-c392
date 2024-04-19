package exceptionbasics;

public class MultiCatchDemo {

    public static void main(String[] args) {

        int []values = {10,5,7,0,2};

        try {
            int output = values[0] / values[3];
            System.out.println("Result = "+output);
        }
        catch (ArithmeticException e){
            System.out.println("Can't divide by zero");
        }

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

        // catch all
        catch (Exception e){
            System.out.println(e.getMessage());
        }


        System.out.println("Bye..");


    }

}
