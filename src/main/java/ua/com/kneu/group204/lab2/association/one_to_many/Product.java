package ua.com.kneu.group204.lab2.association.one_to_many;

import java.math.BigDecimal;

public class Product {
    private Category category;

    private Long id;
    private String name;
    private String description;
    private BigDecimal price;

    public Product() {
    }

    public Product(Category category, Long id, String name, String description, BigDecimal price) {
        this.category = category;
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "category=" + category +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
