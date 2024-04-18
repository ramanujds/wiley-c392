import java.time.DayOfWeek;
import java.time.Month;

public class EnumExample {
    public static void main(String[] args) {
        Days day = Days.MONDAY;
        System.out.println(day.value());
        System.out.println(day);
        Month month = Month.APRIL;
        System.out.println(month);

    }
}

enum Days{
    SUNDAY(1),MONDAY(2),TUESDAY(3),WEDNESDAY(4),THURSDAY(5),FRIDAY(6),SATURDAY(7);
    private final int value;
    public int value(){
        return this.value;
    }
    Days(int value) {
        this.value=value;
    }
}
