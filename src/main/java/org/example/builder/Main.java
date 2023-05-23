package org.example.builder;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Product product = new Product.Builder()
            .id(1)
            .name("Product 1")
            .price(BigDecimal.valueOf(10.7))
            .color("Red")
            .build();
        System.out.println(product);
    }
}
