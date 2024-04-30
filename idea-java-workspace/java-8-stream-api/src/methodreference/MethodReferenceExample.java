package methodreference;

// Static Method Reference

interface StringOperation{
    String operate(String s);
}

class StringUtil{
    static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }
}

public class MethodReferenceExample {

    public static void main(String[] args) {
        StringOperation operation = StringUtil::reverse;

        System.out.println(operation.operate("tushar"));
    }

}
