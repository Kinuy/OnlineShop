package org.example;

public class ShopService{
    OrderRepo orderRepo;
    public ShopService(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    public void placeNewOrder(Order order) {
        boolean test = orderRepo.equals(order);
        for (Integer key : this.orderRepo.getAllOrders().keySet()){
            if(key == order.orderId()){
                System.out.println("Order already placed!");
                return;
            }
        }
        System.out.println("We have a new order!");
        this.orderRepo.addOrder(order);


    }
}
