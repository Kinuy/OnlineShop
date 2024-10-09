package org.example;

public record Product(
        int productId,
        int numberOfProducts,
        String productName,
        double productPrice,
        boolean isAvailable
) {
    public Product setProduct(int numberOfProducts) {
        return new Product(this.productId, numberOfProducts, this.productName, this.productPrice, isAvailable);
    }
}
