package ua.com.kneu.group204.lab5.dao;

import java.util.List;

public interface GeneralDao<T> {

    List<T> findAll();
    T findByName(String name);
    T findById(Long id);
    void save(T t);
    void update(T t);
    void delete(T t);
    void deleteAll();

}
