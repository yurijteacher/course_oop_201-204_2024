package ua.com.kneu.group203.example4.shop.entity;

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

public class Order {

    private Long id;
    private Date dateCreated;
    private String delivery;
    private String payment;

    private boolean status;

    private Client client;

    private List<ProductHasOrder> productHasOrderLists;

}
