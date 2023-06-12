package entities;

public class Product
{
    public Double price;
    public String name;

    Product(){}
    public Product(Double price, String name){
        this.price = price;
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product[" +
                "price=" + price +
                ", name='" + name + '\'' +
                ']';
    }
}
