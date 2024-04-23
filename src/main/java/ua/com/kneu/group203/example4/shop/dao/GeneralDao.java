package ua.com.kneu.group203.example4.shop.dao;

import java.util.List;

public interface GeneralDao<T> {
    List<T> findAll();
    T findById(Long id);
    void save(T obj);
    void  update(T obj);
    void delete(T obj);
    void deleteAll();
}
