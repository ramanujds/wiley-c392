
import java.text.Format;
import java.util.function.Function;

public class TextProcessor {

    // Functionality: String repetition
    public static String repeatString(String str, int count) {
        return str.repeat(count);

    }

    // Functionality: Checking if a string is blank
    public static boolean isStringBlank(String str) {
        return str.isBlank();
    }

    // Functionality: Extracting lines from a multi-line string
    public static void extractLines(String multiLineStr) {
        multiLineStr.lines().forEach(s->System.out.println(s));;
    }
    // Functionality: String formatting
    public static String formatString(String format, Object... args) {
        return format.formatted(format, args);
    }


    // Functionality: String indentation
    public static String indentString(String str, int n) {
        return str.indent(n);
    }


    public static void main(String[] args) {

        String originalString = "Hello";
        String multiLineString = "Line 1\nLine 2\nLine 3";

        // String repetition
        String repeatedString = TextProcessor.repeatString(originalString, 3);
        System.out.println("Repeated String: " + repeatedString);

        // Checking if a string is blank
        String blankString = "   ";
        System.out.println("Is Blank String: " + TextProcessor.isStringBlank(blankString));

        // Extracting lines from a multi-line string
        System.out.println("Lines from Multi-line String:");
        TextProcessor.extractLines(multiLineString);

        // String formatting
        String formattedString = TextProcessor.formatString("Hello %s", "World");
        System.out.println("Formatted String: " + formattedString);


        // String indentation
        String indentedString = TextProcessor.indentString(multiLineString, 2);
        System.out.println("Indented String:\n" + indentedString);


    }


}
