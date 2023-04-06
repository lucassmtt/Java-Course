package Products;

import java.io.PrintStream;

public class Products {
    public String name;
    public double price;
    public int quantity;

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
