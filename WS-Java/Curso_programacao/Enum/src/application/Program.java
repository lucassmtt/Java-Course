package application;

import entitie.Order;
import entities.enums.OrderStatus;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Order order_num_102 = new Order(102, new Date(), OrderStatus.DELIVERED);
        System.out.println(order_num_102.toString());

        Scanner mySc = new Scanner(System.in);
        System.out.println("Send the order status... ");
        String newStatusString = mySc.next();
        OrderStatus newOrderStatus = OrderStatus.valueOf(newStatusString);

        Order order_num_103 = new Order(103, new Date(), newOrderStatus);
        System.out.println("Order 103 = " + order_num_103.toString());
    }
}
