package application;

import entities.Product;
import model.services.ProductService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Program
{
    public static void main(String[] args)
    {
        List<Product> productList = new ArrayList<>();

//        productList.add(new Product(1200.00, "Television 4K"));
//        productList.add(new Product(400.00, "PlayStation 5"));
//        productList.add(new Product(500.00, "Xbox Series X"));

//        Comparator<Product> comparator = new Comparator<Product>() {
//            @Override
//            public int compare(Product p1, Product p2) {
//                return p1.getName.toUpperCase().compareTo(p2.getName.toUpperCase());
//            }
//        };

        // We can simplify
//
//        Comparator<Product> comparator = (p1, p2) -> {
//            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//        };

        // We can simplify even more
//
//        productList.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
//
//        for (Product product : productList){
//            System.out.println(product.getName() + " - " + product.getPrice());
//        }


        productList.add(new Product(3500.00, "Apple Vision"));
        productList.add(new Product(400.00, "Sangung S21"));
        productList.add(new Product(500.00, "Xbox Series X"));
        productList.add(new Product(600.00, "Xiaomi 12"));

        double cut_value = 500.00;

//        productList.removeIf(product -> product.getPrice() <= cut_value); // Remove every product that price is bigger 500.00

//        for (Product product : productList){
//            System.out.println(product.getName() + " - " + product.getPrice());
//        }

//        productList.forEach(product -> product.setPrice(product.getPrice() * 1.1)); // set price with 10 per cent more


        // result in one list of string with the name of products in upper case...
//        List<String> newProducts = productList.stream().map(x -> x.getName().toUpperCase()).collect(Collectors.toList());
//        newProducts.forEach(System.out :: println);


        // Create one function that receive one function as argument..
        ProductService productService = new ProductService();
        double result = productService.filterWithPredicate(productList, x -> x.getName().charAt(0) == 'X');
        productList.forEach(System.out::println);
        System.out.println("Sum result: " + result);
    }
}
