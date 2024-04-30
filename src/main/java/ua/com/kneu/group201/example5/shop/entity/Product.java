package ua.com.kneu.group201.example5.shop.entity;

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
    private String image;

    private Category category;

    private List<ProductHasOrder> productHasOrderList;

    public Product(Long id, String name, String description, double price, String image, Category category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.image = image;
        this.category = category;
    }
}
