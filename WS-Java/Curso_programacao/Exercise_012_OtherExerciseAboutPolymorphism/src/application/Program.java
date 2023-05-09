package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import entities.Product;
import entities.ImportedProduct;
import entities.UsedProduct;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        List<Product> productList = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int numberOfProducts = input.nextInt();

        for (int x = 1; x < numberOfProducts+1; x++){
            System.out.println("Product #" + x + " data:");
            System.out.print("Common, used or imported (C/U/I): ");
            String response = input.next().toUpperCase().substring(0, 1);

            while (!(response.equals("C") || response.equals("U") || response.equals("I"))){
                System.out.println("Please, send the correct response!");
                response = input.next().toUpperCase().substring(0, 1);
            }

            System.out.print("Name: ");
            String name_product = input.next();
            System.out.print("Price: ");
            Double price_product = input.nextDouble();

            if (response.equals("I")){
                System.out.print("Customs fee: ");
                Double custom_fee_amount = input.nextDouble();
                Product product_with_customs_fee = new ImportedProduct(name_product, price_product, custom_fee_amount);
                productList.add(product_with_customs_fee);
            }
            else if (response.equals("U")) {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String input_date = input.next();
                int day = Integer.parseInt(input_date.substring(0, 2));
                int month = Integer.parseInt(input_date.substring(3, 5));
                int year = Integer.parseInt(input_date.substring(6, 10));

                DateTimeFormatter myformat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate date = LocalDate.of(year, month, day);

                Product used_product = new UsedProduct(name_product, price_product, date);
                productList.add(used_product);
            }
            else {
                Product product = new Product(name_product, price_product);
                productList.add(product);
            }
        }

        System.out.println("PRICE TAGS: ");

        for (Product product : productList){
            System.out.println(product.priceTag());
        }
    }
}