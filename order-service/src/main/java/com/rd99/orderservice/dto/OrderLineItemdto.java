package com.rd99.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderLineItemdto {
    private Long id;
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;
}
