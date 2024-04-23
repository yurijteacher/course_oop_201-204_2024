package ua.com.kneu.group202.example3.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Orders {

    private Long id;
    private Date dateCreated;
    private boolean status;
    private String delivery;
    private String payment;

    private Client client;

    private List<ProductsHasOrder> productsHasOrderList;


}
