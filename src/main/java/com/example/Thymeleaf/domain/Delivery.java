package com.example.Thymeleaf.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 배송 방식
 */
@Data
@AllArgsConstructor
public class Delivery {

    /**
     * System 에서 전달하는 값
     */
    private String code;

    /**
     * 고객에게 보여주는 값
     */
    private String name;

}
