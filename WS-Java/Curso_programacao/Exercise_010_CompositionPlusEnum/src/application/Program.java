package application;

import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;

import entities.entities.Client;
import entities.entities.OrderItem;
import entities.entities.Product;
import entities.entities.Order;
import entities.enums.OrderStatus;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the client data: ");

        System.out.print("Name: ");
        String name_client = input.nextLine();

        System.out.print("Email: ");
        String email_client = input.nextLine();

        System.out.print("Birth date (DD/MM/YYYY): ");
        String dateInString = input.next();

        Calendar calendar = new GregorianCalendar();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date formatted_date = formatter.parse(dateInString.formatted("dd/MM/YYYY"));

        calendar.setTime(formatted_date);

        Client client = new Client(name_client, email_client, formatted_date);
        System.out.println(client);

        System.out.println("Enter order data: ");
        System.out.print("Status: (PENDING_PAYMENT/PROCESSING/SHIPPED/DELIVERED): ");
        String status = input.next();
        while (!status.equals("PENDING_PAYMENT") && !status.equals("PROCESSING") &&
               !status.equals("SHIPPED") && !status.equals("DELIVERED")) {

            System.out.println("Please, send the value correct to order status!");
            status = input.next().toUpperCase();
        }


        System.out.print("How many items to this order? ");
        int number_Of_items = input.nextInt();

        for (int x=1; x<number_Of_items+1; x++){
            System.out.println("Enter #" + x + "item data: ");
            System.out.print("Product name: ");
            String name_product = input.next();
            System.out.print("Product price: ");
            Double price = input.nextDouble();
        }

        input.close();
    }
}
