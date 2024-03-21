package ua.com.kneu.group204.lab2.association.one_to_many;

import java.util.List;

public class Category {

    private int id;
    private String name;
    private String description;
    private String linkImage;
    private List<Product> products;

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", linkImage='" + linkImage + '\'' +
                ", products=" + products +
                '}';
    }

    public Category() {
    }

    public Category(int id, String name, String description, String linkImage, List<Product> products) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.linkImage = linkImage;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getLinkImage() {
        return linkImage;
    }

    public void setLinkImage(String linkImage) {
        this.linkImage = linkImage;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
