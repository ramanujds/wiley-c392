package functionalinterfaceandlambda;

public class StringManagement {
    static String doApply(String str, StringOperation op){
        return op.operate(str);
    }

    public static void main(String[] args) {

        var stringUpper = doApply("hello", s->s.toUpperCase());

        var stringLower = doApply("Hello World", s-> s.toLowerCase());

        var strReverse = doApply("hello world", s -> {
            StringBuilder sb = new StringBuilder(s);
            return sb.reverse().toString();
        });

        System.out.println(stringLower);
        System.out.println(stringUpper);
        System.out.println(strReverse);

        Thread t1 = new Thread(()-> System.out.println("Hello from Thread 1"));

    }

}

interface StringOperation{

    String operate(String str);

}
