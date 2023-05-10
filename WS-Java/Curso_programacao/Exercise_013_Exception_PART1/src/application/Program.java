package application;

import model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.spi.CalendarDataProvider;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);

        System.out.print("Checkin: ");
        String dateInString = input.next();

        System.out.print("Checkout: ");
        String dateInString2 = input.next();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date format = formatter.parse(dateInString.formatted(formatter));
        Date format2 = formatter.parse(dateInString2.formatted(formatter));

        Reservation reservation = new Reservation(100, format, format2);
        System.out.println(reservation.toString());

        System.out.println(reservation.duration());
    }
}
