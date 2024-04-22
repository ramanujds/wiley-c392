package newstringapimethods;

public class NewStringApiMethods {

    public static void main(String[] args) {

        String str = """
                    The %s class in Java represents a sequence of characters.   
                    %s in Java are immutable, meaning their values cannot be changed after they are created.   
                    This immutability ensures thread safety and allows %s to be used as constants.
                    """.formatted("String","Strings", "String");

        // repeat

        String str2 = " hello wiley   ";

        // isBlank()
        System.out.println(str2.isBlank());

        // lines()
    //    str.lines().forEach(System.out::println);

        // strip

//        System.out.println(str2.strip());
//        System.out.println(str2.stripTrailing());
//        System.out.println(str2.stripLeading());

        // formatted

       // System.out.println(str);

        // transform

        var newString =  str.transform(String::toUpperCase);

       // System.out.println(newString);
        System.out.println(str.indent(5));

    }

}
