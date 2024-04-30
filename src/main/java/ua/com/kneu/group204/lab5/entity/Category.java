package ua.com.kneu.group204.lab5.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "category")
public class Category {

    @Id // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // NN AI
    private Long id;
    private String name;
    private String description;
    private String image;

    @OneToMany(mappedBy = "categories") // Obj == class.Pr.Obj
    List<Product> productList;


}
