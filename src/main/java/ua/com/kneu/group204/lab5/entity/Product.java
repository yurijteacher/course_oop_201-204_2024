package ua.com.kneu.group204.lab5.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(of = {"id","name","description","price"})

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category categories;

    @OneToMany(mappedBy = "_product")
    private List<ProductHasOrder> productHasOrderList;

//
//    @Override
//    public String toString() {
//        return "Product{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", description='" + description + '\'' +
//                ", price=" + price +
//                ", categories=" + categories +
//                ", productHasOrderList=" + productHasOrderList +
//                '}';
//    }
//
//    public Product() {
//    }
//
//    public Product(Long id, String name, String description, BigDecimal price, Category categories) {
//        this.id = id;
//        this.name = name;
//        this.description = description;
//        this.price = price;
//        this.categories = categories;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public BigDecimal getPrice() {
//        return price;
//    }
//
//    public void setPrice(BigDecimal price) {
//        this.price = price;
//    }
//
//    public Category getCategories() {
//        return categories;
//    }
//
//    public void setCategories(Category categories) {
//        this.categories = categories;
//    }
//
//    public List<ProductHasOrder> getProductHasOrderList() {
//        return productHasOrderList;
//    }
//
//    public void setProductHasOrderList(List<ProductHasOrder> productHasOrderList) {
//        this.productHasOrderList = productHasOrderList;
//    }
}
