package com.example.Thymeleaf.domain;
/**
 * 상품 종류 Enum
 */
public enum ProductType {

    CLOTHES("패션"), FOOD("먹거리"), DIGITAL("가전");

    private final String category;

    ProductType(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}
