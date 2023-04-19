package entities;

import java.io.PrintStream;

public class Products {
    public String name;
    public double price;
    public int quantity;

    public Products(){
    }

    public Products(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Products(String name, double price){
        this.name = name;
        this.price = price;
        // Could add the "quantity" with default value equal to 0, but that would be redundant
    }

    public double totalValueInStock(){
        double TotalValue;
        TotalValue = quantity * price;
        return TotalValue;
    }

    public void AddProducts(int quantity){
        //quantity += Quantity;
        //Poderia deixar o argumento com letra maiuscula ou usar o this
        this.quantity += quantity;
    }

    public void RemoveProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        System.out.printf("Name: %s, Price: %.2f, Quantity: %s", name, price, quantity);
        return "";
    }
}
