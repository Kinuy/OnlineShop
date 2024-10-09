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
/*        for (Product p : products) {
            if(p.productId()==product.productId()){
                p = p.setProduct(p.numberOfProducts()+1);
            }
        }*/
        for(int i=0; i<products.size(); i++){
            if(products.get(i).productId()==product.productId()){
                products.set(i,products.get(i).setProduct(products.get(i).numberOfProducts()+1));
                System.out.println("Product already in List -> will be added, you have now " + products.get(i).numberOfProducts() +" items of this product in your list.");
                return;
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
