package ua.com.kneu.group204.example4.shop.entity;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(of = {"name", "description","image","price","category"})

public class Product {

    private Long id;
    private String name;
    private String description;
    private double price;

    private String image;

    private Category category;

    private List<ProductsHasOrder> productsHasOrderList;

    public Product(Long id, String name, String description, double price, String image, Category category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.image = image;
        this.category = category;
    }
}
