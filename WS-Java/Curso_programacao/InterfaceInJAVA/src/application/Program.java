package application;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        try{
            Locale.setDefault(Locale.US);
            Scanner scanner = new Scanner(System.in);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
            System.out.println("Send the data rental...");

            System.out.print("Car model: ");
            String model = scanner.nextLine();

            System.out.println("Withdrawal (dd/MM/yyyy 12:12) : ");
            String start_string = scanner.nextLine();
            LocalDateTime start = LocalDateTime.parse(start_string, formatter);

            System.out.println("Return (dd/MM/yyyy 12:12) : ");
            String finish_string = scanner.nextLine();
            LocalDateTime finish = LocalDateTime.parse(finish_string, formatter);

            Vehicle vehicle = new Vehicle(model);
            CarRental carRental = new CarRental(start, finish, vehicle);

            System.out.print("Send the price hour: ");
            double price_per_hour = scanner.nextDouble();

            System.out.print("Send the day price: ");
            double price_per_day = scanner.nextDouble();

            BrazilTaxService taxService = new BrazilTaxService();

            RentalService rentalService = new RentalService(price_per_hour, price_per_day, taxService);
            rentalService.processInvoice(carRental);

            System.out.println("INVOICE: ");
            System.out.println("Basic payment: " + carRental.getInvoice().getBasicPayment());
            System.out.println("Tax: " + carRental.getInvoice().getTax());
            System.out.println("Total payment: " + carRental.getInvoice().getTotalPayment());
            scanner.close();
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }

    }
}
