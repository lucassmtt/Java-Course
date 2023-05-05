package entities.entities;

public class OrderItem {
    public Integer quantity;
    public Double price;
    Product product;

    public OrderItem(){}
    public OrderItem(Integer quantity, Double price){this.quantity = quantity; this.price = price;}

    public Double subTotal(){
        return quantity * price;
    }
}
