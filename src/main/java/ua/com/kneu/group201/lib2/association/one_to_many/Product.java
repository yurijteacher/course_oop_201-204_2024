package ua.com.kneu.group201.lib2.association.one_to_many;

import java.math.BigDecimal;

public class Product {

    private Long id;
    private String name;
    private String discription;
    private String linkImage;
    private BigDecimal price;  // ,**
    private Category category;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", discription='" + discription + '\'' +
                ", linkImage='" + linkImage + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }

    public Product() {
    }

    public Product(Long id, String name, String discription, String linkImage, BigDecimal price, Category category) {
        this.id = id;
        this.name = name;
        this.discription = discription;
        this.linkImage = linkImage;
        this.price = price;
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

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getLinkImage() {
        return linkImage;
    }

    public void setLinkImage(String linkImage) {
        this.linkImage = linkImage;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
