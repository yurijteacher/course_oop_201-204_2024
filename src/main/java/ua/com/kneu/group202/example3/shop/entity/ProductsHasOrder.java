package ua.com.kneu.group202.example3.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ProductsHasOrder {

    private Long id;
    private Orders order;
    private Product product;

    private short quentity;


}
