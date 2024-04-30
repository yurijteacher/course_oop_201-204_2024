package ua.com.kneu.group204.lab5.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    private String username;
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Roles> rolesset = new HashSet<>();

    @OneToMany(mappedBy = "clientes")
    private List<Order> orderList;
}
