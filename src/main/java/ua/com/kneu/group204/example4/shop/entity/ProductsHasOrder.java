package ua.com.kneu.group204.example4.shop.entity;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProductsHasOrder {

    private Long id;
    private Product _product;
    private Orders _order;

    private short quantity;

}
