package ua.com.kneu.group204.lab2.homework;

import java.util.List;

public class Genre {

    private Long id;
    private String name;
    private String description;
    private String linkImage;

    private List<Books> booksList;

    public List<Books> getBooksList() {
        return booksList;
    }

    public void setBooksList(List<Books> booksList) {
        this.booksList = booksList;
    }


    public Genre() {
    }

    public Genre(Long id, String name, String description, String linkImage) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.linkImage = linkImage;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", linkImage='" + linkImage + '\'' +
                '}';
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

    public String getLinkImage() {
        return linkImage;
    }

    public void setLinkImage(String linkImage) {
        this.linkImage = linkImage;
    }
}
