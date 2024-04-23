package ua.com.kneu.group203.example4.shop.entity;

import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class Category {

    private Long id;
    private String name;
    private String description;
    private String image;
    protected List<Product> productList;


    public Category(Long id, String name, String description, String image) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.image = image;
    }
}


//
//    public Category() {
//    }
//
//    public Category(Long id, String name, String description, String image, List<Product> productList) {
//        this.id = id;
//        this.name = name;
//        this.description = description;
//        this.image = image;
//        this.productList = productList;
//    }
//
//    public Category(Long id, String name, String description, String image) {
//        this.id = id;
//        this.name = name;
//        this.description = description;
//        this.image = image;
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
//    public String getImage() {
//        return image;
//    }
//
//    public void setImage(String image) {
//        this.image = image;
//    }
//
//    public List<Product> getProductList() {
//        return productList;
//    }
//
//    public void setProductList(List<Product> productList) {
//        this.productList = productList;
//    }
//
//    @Override
//    public String toString() {
//        return "Category{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", description='" + description + '\'' +
//                ", image='" + image + '\'' +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Category category)) return false;
//        return Objects.equals(getName(), category.getName()) && Objects.equals(getDescription(), category.getDescription()) && Objects.equals(getImage(), category.getImage());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getName(), getDescription(), getImage());
//    }
//}
