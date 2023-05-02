import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class class_02 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        LocalDate formatDateTime = LocalDate.parse("2002-04-22");
        DateTimeFormatter myformat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Instant d03 = Instant.parse("2002-04-22T01:20:24Z");

        System.out.println("D01 = " + formatDateTime.format(myformat));
        System.out.println("D02 = " + myformat.format(formatDateTime));

        DateTimeFormatter myFormatInstant = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        System.out.println("D03 = " + myFormatInstant.format(d03));
    }
}
