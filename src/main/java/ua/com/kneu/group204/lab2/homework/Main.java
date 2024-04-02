package ua.com.kneu.group204.lab2.homework;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Authors author1 = new Authors(1L, "Vasya", "Pypkin",new Date(2001,02,11),"ewer ew rew r ew"," wer ewr e wrw");
        Authors author2 = new Authors(2L, "Ivan", "Pypkin",new Date(2002,03,19),"ewwee ew rew r ew"," wwe ewr e wrw");

        List<Authors> authorsList = new ArrayList<>();
        authorsList.add(author1);
        authorsList.add(author2);

        Publisher publisher = new Publisher();
        publisher.setId(1L);
        publisher.setName("Abababababa");
        publisher.setDescription("sdfdsf dsf ds f ds");
        publisher.setAddress("Ukraine dsf dsf");

        Genre genre = new Genre();
        genre.setId(1L);
        genre.setName("Роман");
        genre.setDescription("sdf dsf ds fds f sdf");

        Books book = new Books();
        book.setId(1L);
        book.setName("War");
        book.setAuthors(authorsList);
        book.setPublisher(publisher);
        book.setGenre(genre);
        book.setDatePublication(new Date());

        System.out.println(book);
    }


}
