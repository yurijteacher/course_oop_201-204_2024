package ua.com.kneu.group203.example4.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class ProductHasOrder {

    private Long id;

    private Product product;
    private Order order;

    private int quatity;

}
