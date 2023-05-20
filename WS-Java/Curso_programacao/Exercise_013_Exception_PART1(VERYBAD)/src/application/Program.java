package application;

import model.entites.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Program {
    public static void main(String[] args) throws ParseException {

        Scanner input = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Please, send the room number: ");
        int room_number = input.nextInt();

        System.out.print("Please send the date of Check-in: (dd/MM/yyyy)");
        Date checkIn = sdf.parse(input.next());

        System.out.print("Please send the date of Check-out: (dd/MM/yyyy)");
        Date checkOut = sdf.parse(input.next());

        if (!checkOut.after(checkIn)){
            System.out.println("Error in reservation! Checkout date must be after check-in date...");
        }
        else {
            Reservation reservation = new Reservation(room_number, checkIn, checkOut);
            System.out.println(reservation);

            System.out.println("Enter data to update the reservation: ");
            System.out.print("Send the new check-in date: ");
            Date newCheckin = sdf.parse(input.next());

            System.out.print("Send the new check-out date: ");
            Date newCheckout = sdf.parse(input.next());

            if (!newCheckin.after(checkOut)){
                System.out.println("Error in update reservation, new check-in date must be after first check-out...");
            }
            else if (!newCheckin.before(newCheckout)){
                System.out.println("Error in update reservation, new check-in date must be before new check-out date...");
            }
            else{
                reservation.updateDates(newCheckin, newCheckout);
                System.out.println(reservation);
            }
        }
        input.close();
    }
}
