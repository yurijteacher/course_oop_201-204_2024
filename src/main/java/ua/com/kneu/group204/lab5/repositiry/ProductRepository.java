package ua.com.kneu.group204.lab5.repositiry;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import ua.com.kneu.group204.lab5.dao.ProductDao;
import ua.com.kneu.group204.lab5.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements ProductDao {

    private final EntityManagerFactory session;

    public ProductRepository(EntityManagerFactory session) {
        this.session =session;
    }

    @Override
    public List<Product> findAll() {

        List<Product> products = new ArrayList<>();

        EntityManager em = session.createEntityManager();
        em.getTransaction().begin();

        // HQL
        products = em.createQuery("SELECT p FROM Product as p", Product.class).getResultList();
        em.getTransaction().commit();
        em.close();

        return products;
    }

    @Override
    public Product findByName(String name) {

        Product product = new Product();

        EntityManager em = session.createEntityManager();
        em.getTransaction().begin();

        // HQL
        product = em.createQuery("SELECT p FROM Product as p where p.name=:name", Product.class)
                .setParameter("name",name)
                .getSingleResult();

        em.getTransaction().commit();
        em.close();

        return product;

    }

    @Override
    public Product findById(Long id) {

       Product product = new Product();

        EntityManager em = session.createEntityManager();
        em.getTransaction().begin();

        // HQL
        product = em.createQuery("SELECT p FROM Product as p where p.id=:id", Product.class)
                .setParameter("id",id)
        .getSingleResult();

        em.getTransaction().commit();
        em.close();

        return product;
    }

    @Override
    public void save(Product product) {

        EntityManager em = session.createEntityManager();
        em.getTransaction().begin();
        em.persist(product);
        em.getTransaction().commit();
        em.close();

    }

    @Override
    public void update(Product product) {

        EntityManager em = session.createEntityManager();
        em.getTransaction().begin();
        em.merge(product);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void delete(Product product) {
        EntityManager em = session.createEntityManager();
        em.getTransaction().begin();
        em.createNativeQuery("delete from `products` where id=" + product.getId()).executeUpdate();
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void deleteAll() {
        EntityManager em = session.createEntityManager();
        em.getTransaction().begin();
        em.createNativeQuery("delete from `products`").executeUpdate();
        em.getTransaction().commit();
        em.close();
    }
}
