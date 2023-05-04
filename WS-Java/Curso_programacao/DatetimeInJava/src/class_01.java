import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class class_01 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner myScan = new Scanner(System.in);
        LocalDate myDateNow = LocalDate.now();
        LocalDateTime myDateTimeNow = LocalDateTime.now();
        Instant instant_now = Instant.now();
        LocalDate localDateIso = LocalDate.parse("2022-09-12");
        Instant instantIso = Instant.parse("2022-09-12T20:38:30Z");
        Instant instantIsoLocal = Instant.parse("2022-09-12T20:38:30-03:00");

        DateTimeFormatter formatCustom = DateTimeFormatter.ofPattern("MM/yyyy");
        LocalDate dateCustom = LocalDate.parse("12/2022", formatCustom);

        DateTimeFormatter formatCustomWithHourAndMin = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDate dateCustomWithHM = LocalDate.parse("02/07/2004 18:05", formatCustomWithHourAndMin);

        LocalDate dateCustomWithHM2 = LocalDate.parse("02/07/2004 18:05", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        LocalDate localDateWithArgs = LocalDate.of(2020, 04, 20);

        System.out.println("Date Time 1: " + myDateNow);
        System.out.println("Date Time 2: " + myDateTimeNow);
        System.out.println("Date time 3: " + instant_now);
        System.out.println("Date time 4: " + localDateIso);
        System.out.println("Date time 5: " + instantIso);
        System.out.println("Date time 6: " + instantIsoLocal);
        System.out.println("Date time 7: " + dateCustom);
        System.out.println("Date time 8: " + dateCustomWithHM);
        System.out.println("Date time 9: " + dateCustomWithHM2);
        System.out.println("Date time 10: " + localDateWithArgs);
        System.out.println("Date time 10: " + localDateWithArgs);
    }
}
