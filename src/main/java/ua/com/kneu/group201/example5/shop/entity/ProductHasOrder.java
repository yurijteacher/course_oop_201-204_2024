package ua.com.kneu.group201.example5.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class ProductHasOrder {

    private Long id;
    private Product product;
    private Order order;
    private int quen;
}
