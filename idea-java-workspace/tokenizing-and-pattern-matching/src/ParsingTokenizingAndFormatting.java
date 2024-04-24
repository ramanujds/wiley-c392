import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParsingTokenizingAndFormatting {


    public static void main(String[] args) {

        // Formatting LocalDate

        String dateString = "24/04/2024";
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(dateString,dateFormat);
        System.out.println(date.format(dateFormat));


        // Tokenizing

        String str = "Hello world.. Enjoy the Summer";

        StringTokenizer tokenizer = new StringTokenizer(str, ".");

        System.out.println("Tokens : ");

        while (tokenizer.hasMoreTokens()){
            System.out.println(tokenizer.nextToken());
        }


        // Formatting

        double value = 2.887766;
        NumberFormat format = NumberFormat.getInstance();
        format.setMaximumFractionDigits(2);
        System.out.println(format.format(value));

        // Pattern Matching (regex)

        String text = "@";

        String patternString = "[^A-Za-z0-9]";

        System.out.println(Pattern.matches(patternString,text));


    }

}
