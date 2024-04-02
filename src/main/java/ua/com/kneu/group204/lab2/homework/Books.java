package ua.com.kneu.group204.lab2.homework;

import java.util.Date;
import java.util.List;

public class Books {

    private Long id;
    private String name;
    private List<Authors> authors;
    private Genre genre;
    private Publisher publisher;
    private Date datePublication;

    public Books() {
    }

    public Books(Long id, String name, List<Authors> authors, Genre genre, Publisher publisher, Date datePublication) {
        this.id = id;
        this.name = name;
        this.authors = authors;
        this.genre = genre;
        this.publisher = publisher;
        this.datePublication = datePublication;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", authors=" + authors +
                ", genre=" + genre +
                ", publisher=" + publisher +
                ", datePublication=" + datePublication +
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

    public List<Authors> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Authors> authors) {
        this.authors = authors;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Date getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(Date datePublication) {
        this.datePublication = datePublication;
    }
}
