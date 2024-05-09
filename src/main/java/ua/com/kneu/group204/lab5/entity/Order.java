package ua.com.kneu.group204.lab5.entity;

import jakarta.persistence.*;
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

@Entity
@Table(name = "orders")
public class Order {

    @Id // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // NN AI
    private Long id;
    // @Column(name = "date_created")
    private Date dateCreated;
    private boolean status;
    private String delivery;
    private String payment;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client clientes;

    @OneToMany(mappedBy = "_order")
    private List<ProductHasOrder> productHasOrderLists;
}
