import java.time.LocalDateTime;
import java.util.Calendar;

public class Date {
    public static void main(String[] args) {
        LocalDateTime d= LocalDateTime.now();
        System.out.println("Date"+d);

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        calendar.set(Calendar.YEAR, 2021);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 1);

        System.out.println("Specific Date: " + calendar.getTime());
    }
}
