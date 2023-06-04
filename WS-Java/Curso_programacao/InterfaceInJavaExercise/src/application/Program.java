package application;

import model.services.PaypalPayment;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Program
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try{
            System.out.println("Send the contract data: ");
            System.out.print("Date (dd/MM/yyyy): ");
            String date_in_string = scanner.next();
            LocalDate date = LocalDate.parse(date_in_string, formatter);

            System.out.print("Send the contract value: ");
            double contract_value = scanner.nextDouble();

            System.out.print("Send the number portion: ");
            int number_portion = scanner.nextInt();


            PaypalPayment paypalPayment = new PaypalPayment();
            List<Double> everyPortions = new ArrayList<>();
            everyPortions = paypalPayment.tax_portion(contract_value, number_portion);

            for (int x = 0; x < everyPortions.size(); x++)
            {
                System.out.println(date.plusMonths(x + 1) + " - " + everyPortions.get(x));
            }
            scanner.close();
        }
        catch (Exception e){
            System.out.println(e.getStackTrace());
        }

    }
}
