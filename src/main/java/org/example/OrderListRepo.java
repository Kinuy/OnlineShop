package org.example;

import java.util.ArrayList;
import java.util.List;

public class OrderListRepo{

    List<Order> orderList;

    public OrderListRepo() {
        orderList = new ArrayList<>();
    }
    public void addOrder(Order order) {
        orderList.add(order);
    }
    public void removeOrder(int id) {

        orderList.remove(id);
    }
    public void removeAllOrders(){
        orderList.clear();
    }

    public Order getOrder(int id) {
        System.out.println(orderList.get(id));
        return orderList.get(id);
    }

    public List<Order> getAllOrders() {
        System.out.println(List.of());
        return orderList;
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Order order : orderList) {
            totalPrice += 0;
        }
        System.out.println(totalPrice);
        return totalPrice;
    }
}
