package entities.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import entities.enums.OrderStatus;

public class Order {
    public Date moment;
    public OrderStatus status;

    public List<OrderItem> items = new ArrayList<>();

    public Order(){}
    public Order(Date moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }

    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public Double total(){
        double total = 0;
        for (OrderItem items : items){
            total += items.subTotal();
        }
        return total;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        StringBuilder stringB = new StringBuilder();
        stringB.append("Order Moment: ").append(moment)
                .append("\nOrder Status: ").append(status)
                .append("\n");
        return stringB.toString();
    }
}
