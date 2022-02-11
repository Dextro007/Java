import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class dateTime {
    public static String findDay(int month, int day, int year){
        Calendar date = Calendar.getInstance();
        /* Note:
        * Int(January) -> 0
        * So actual month is month-1*/
        date.set(year, month-1, day);
        int numDay = date.get(Calendar.DAY_OF_WEEK);
        List<String> days = Arrays.asList("SUNDAY", "MODAY", "TUESDAY", "WEDNESDAY",
                "THURSDAY", "FRIDAY", "SATURDAY");
        return days.get(numDay - 1);
        
    }
}
