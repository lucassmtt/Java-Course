package application;

import entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program
{
    public static void main(String[] args)
    {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product(1200.00, "Television 4K"));
        productList.add(new Product(400.00, "PlayStation 5"));
        productList.add(new Product(500.00, "Xbox Series X"));

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

        productList.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for (Product product : productList){
            System.out.println(product.getName() + " - " + product.getPrice());
        }
    }
}
