package ua.com.kneu.group204.lab5.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString(of={"id","name","description"})

@Entity
@Table(name = "category")
public class Category {

    @Id // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // NN AI (i=i+1)
    private Long id;

    @Column(name = "name")
    private String name;
    private String description;
    private String image;

    @OneToMany(mappedBy = "categories") // Obj == class.Pr.Obj
    private List<Product> productList;

}
