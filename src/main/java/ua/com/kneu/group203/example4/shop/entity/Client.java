package ua.com.kneu.group203.example4.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Client {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private int age;

    private List<Order> orderList;

}
