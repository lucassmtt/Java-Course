package application;

import Products.Products;

import java.util.Locale;
import java.util.Scanner;

public class Program{
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner myScanner = new Scanner(System.in);

        Products myProduct = new Products();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        myProduct.name = myScanner.nextLine();

        System.out.print("Price: ");
        myProduct.price = myScanner.nextDouble();

        System.out.print("Quantity in Stock: ");
        myProduct.quantity = myScanner.nextInt();

        System.out.printf("Product Data: %s, $ %.2f, %d units, Total: $ %.2f \n",
                myProduct.name, myProduct.price, myProduct.quantity, myProduct.totalValueInStock());

        System.out.print("Enter the number of products to be added in stock: ");
        myProduct.AddProducts(myScanner.nextInt());

        System.out.printf("Update data: %s, $ %.2f, %d units, Total: $ %.2f \n",
                myProduct.name, myProduct.price, myProduct.quantity, myProduct.totalValueInStock());

        System.out.print("Enter the number de products to be removed from stock: ");
        myProduct.RemoveProducts(myScanner.nextInt());

        System.out.printf("Update data: %s, $ %.2f, %d units, Total: $ %.2f",
                myProduct.name, myProduct.price, myProduct.quantity, myProduct.totalValueInStock());

        myScanner.close();

    }
}