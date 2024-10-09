package org.example;

import java.util.Map;

public record Order(
        int orderId,
        String customerName,
        String customerAddress,
        ProductRepo products
) {
}
