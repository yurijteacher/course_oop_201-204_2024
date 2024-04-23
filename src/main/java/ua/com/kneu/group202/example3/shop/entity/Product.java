package ua.com.kneu.group202.example3.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Product {

    private Long id;
    private String name;
    private String description;
    private double price;
    private String link;

    private Category category;

    private List<ProductsHasOrder> productsHasOrderLis;

}
