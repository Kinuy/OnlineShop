package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {
    List<Product> products;


    public ProductRepo() {
        products = new ArrayList<>();
    }
    public List<Product> getProducts() {
        return products;
    }
    public void setProducts(List<Product> products) {
        this.products = products;
    }
    public void addProduct(Product product) {
        for (Product p : products) {
            if(p.productId()==product.productId()){
                return p.setProduct(p.numberOfProducts()+1);
            }
        }
        products.add(product);
    }
    public void removeProduct(Product product) {
        products.remove(product);
    }
    public Product getProduct(int id) {
        return products.get(id);
    }
}
