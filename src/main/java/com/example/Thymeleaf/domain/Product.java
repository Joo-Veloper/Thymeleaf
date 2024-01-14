package com.example.Thymeleaf.domain;

import lombok.Data;

import java.util.List;

@Data
public class Product {

    private Long id;
    private String name;
    private Integer price;
    private Integer quantity;

    // 중고 여부
    private Boolean isUsed;
    // 색상
    private List<String> colors;
    // 상품 종류
    private ProductType productType;
    // 배송 방식
    private String delivery;


    public Product() {}

    public Product(String name, Integer quantity, Integer price) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}