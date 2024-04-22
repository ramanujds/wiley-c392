package stringbascics;

public class StringBasics {
    public static void main(String[] args) {


        StringBuilder sb1 = new StringBuilder("Hello");

        sb1.reverse();

        System.out.println(sb1);


        String code = """
                package stringbascics;
                               
                public class StringBasics {
                    public static void main(String[] args) {
                               
                        int num = 10;
                               
                        String code = ""
                               
                              
                              
                    }
                }
                                
                """;
        System.out.println(code);


    }
}
