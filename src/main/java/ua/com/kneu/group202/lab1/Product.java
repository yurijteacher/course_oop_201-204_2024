package ua.com.kneu.group202.lab1;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Product {

    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private String linkImage;
    private byte[] image;
    private List<Image> images;
    private Category category;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", linkImage='" + linkImage + '\'' +
                ", image=" + Arrays.toString(image) +
                ", images=" + images +
                ", category=" + category +
                '}';
    }

    public Product() {
    }

    public Product(Long id, String name, String description, BigDecimal price, String linkImage, byte[] image, List<Image> images, Category category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.linkImage = linkImage;
        this.image = image;
        this.images = images;
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

    public String getLinkImage() {
        return linkImage;
    }

    public void setLinkImage(String linkImage) {
        this.linkImage = linkImage;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
