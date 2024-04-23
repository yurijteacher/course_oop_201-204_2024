package ua.com.kneu.group203.example4.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Product {

    private Long id;
    private String name;
    private String description;
    private double price;
    private String image;

    private Category category;

    private List<ProductHasOrder> productHasOrderList;

}
