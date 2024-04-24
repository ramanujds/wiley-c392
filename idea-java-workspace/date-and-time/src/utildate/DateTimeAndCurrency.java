package utildate;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;

public class DateTimeAndCurrency {

    public static void main(String[] args) {

        Date date = new Date();

        System.out.println(date);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        System.out.println(dateFormat.format(date));

        dateFormat = new SimpleDateFormat("dd/MMM/yyyy HH:mm");

        System.out.println(dateFormat.format(date));


        Locale locale = new Locale("en","IN");
        Currency currency = Currency.getInstance(locale);
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
        System.out.println(currencyFormat.format(5000)+" "+currency.getSymbol());

    }

}
