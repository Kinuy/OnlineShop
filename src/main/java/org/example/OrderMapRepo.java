package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderMapRepo implements OrderRepo {

    Map<Integer,Order> orderMap;

    public OrderMapRepo(ProductRepo productRepo) {
        orderMap = new HashMap<>();

    }


    @Override
    public void addOrder(Order order) {
        int id = orderMap.size();
        orderMap.put(id,order);
    }

    @Override
    public void removeOrder(int id) {
        orderMap.remove(id);
    }

    @Override
    public void removeAllOrders() {
        orderMap.clear();
    }

    @Override
    public Order getOrder(int id) {
        return orderMap.get(id);
    }

    @Override
    public Map<Integer,Order> getAllOrders() {
        return orderMap;
    }

    @Override
    public double getTotalPrice() {
        return 0;
    }
}
