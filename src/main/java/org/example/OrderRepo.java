package org.example;

import java.util.List;
import java.util.Map;

public interface OrderRepo {
    public void addOrder(Order order);
    public void removeOrder(int id);
    public void removeAllOrders();
    public Order getOrder(int id);
    public Map<Integer,Order> getAllOrders();
    public double getTotalPrice();
}
