package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome shopping!");

        ProductRepo productList = new ProductRepo();
        Product product1 = new Product(0,1,"Mouse",10,true);
        Product product2 = new Product(1,1,"Tastatur",15,false);

        productList.addProduct(product1);
        productList.addProduct(product2);
        productList.addProduct(product2);

        OrderRepo orderList = new OrderMapRepo(productList);
        Order myOrder1 = new Order(0,"Tobias","Berlin",productList);
        Order myOrder2 = new Order(1,"Klaus","Kölln",productList);
        Order myOrder3 = new Order(2,"Peter","München",productList);
        Order myOrder4 = new Order(3,"Hans","München",productList);



/*        orderList.addOrder(myOrder1);
        orderList.addOrder(myOrder2);
        orderList.addOrder(myOrder3);*/

        ShopService shop = new ShopService(orderList);
        shop.placeNewOrder(myOrder1);
        shop.placeNewOrder(myOrder2);
        shop.placeNewOrder(myOrder3);
        shop.placeNewOrder(myOrder4);
        shop.placeNewOrder(myOrder4);



    }
}