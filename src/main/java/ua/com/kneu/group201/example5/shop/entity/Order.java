package ua.com.kneu.group201.example5.shop.entity;

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
    private String status;
    private Date dateCreated;

    private Client client;

    private List<ProductHasOrder> productHasOrderList;


}
