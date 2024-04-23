package ua.com.kneu.group204.example4.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Orders
{

    private Long id;

    private Date dateCreated;
    private boolean status;

    private Clients client;

    private List<ProductsHasOrder> productsHasOrderLists;

}
