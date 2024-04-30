package ua.com.kneu.group201.example5.shop.dao;

import java.util.List;

public interface GeneralDao<T> {
    List<T> findAll();
    T findById(Long id);
    T findByName(String name);
    void save(T obj);
    void update(T obj);
    void  deleteByObj(T obj);
    void deleteAll();

}
