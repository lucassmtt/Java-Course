import java.util.Locale;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class class_03 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Calendar date = new GregorianCalendar(2012, 9, 5);
        int year = date.get(Calendar.YEAR);  // 2012
        int month = date.get(Calendar.MONTH);  // 9 - October!!!
        int day = date.get(Calendar.DAY_OF_MONTH);  // 5
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
    }
}
