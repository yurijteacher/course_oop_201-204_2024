package ua.com.kneu.group202.example3.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Category {
    private Long id;
    private String name;
    private String description;
    private String link;

    private List<Product> productList;

    public Category(Long id, String name, String description, String link) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.link = link;
    }
}



//    public Category() {
//    }
//
//    public Category(Long id, String name, String description, String link) {
//        this.id = id;
//        this.name = name;
//        this.description = description;
//        this.link = link;
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
//    public String getLink() {
//        return link;
//    }
//
//    public void setLink(String link) {
//        this.link = link;
//    }
//
//    @Override
//    public String toString() {
//        return "Category{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", description='" + description + '\'' +
//                ", link='" + link + '\'' +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Category category)) return false;
//        return Objects.equals(getId(), category.getId()) && Objects.equals(getName(), category.getName()) && Objects.equals(getDescription(), category.getDescription()) && Objects.equals(getLink(), category.getLink());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getId(), getName(), getDescription(), getLink());
//    }

