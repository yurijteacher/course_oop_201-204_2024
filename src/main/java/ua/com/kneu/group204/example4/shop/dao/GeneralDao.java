package ua.com.kneu.group204.example4.shop.dao;

import java.util.List;


// Crud
public interface GeneralDao<T> {

    List<T> findAll();
    T findById(Long id);
    void save(T obj);
    void update(T obj);
    void deleteById(T obj);
    void deleteAll();

}
