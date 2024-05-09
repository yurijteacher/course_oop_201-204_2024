package ua.com.kneu.group204.lab5.repositiry;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import ua.com.kneu.group204.lab5.dao.CategoryDao;
import ua.com.kneu.group204.lab5.entity.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryRepository implements CategoryDao {

    private EntityManagerFactory session;

    public CategoryRepository(EntityManagerFactory session) {
        this.session = session;
    }

    @Override
    public List<Category> findAll() {

        List<Category> categories = new ArrayList<>();

        EntityManager em = session.createEntityManager();
        em.getTransaction().begin();

        // HQL -> SQL
//        categories = em.createQuery("select c from Category c", Category.class).getResultList();

        // SQL
        categories = em.createNativeQuery("select * from `category`", Category.class).getResultList();

        em.getTransaction().commit();
        em.close();

        return categories;
    }

    @Override
    public Category findByName(String name) {

        Category category = new Category();

        EntityManager em = session.createEntityManager();
        em.getTransaction().begin();

        // HQL
//        category = em.createQuery("select c from Category c WHERE c.id=:id", Category.class)
//                .setParameter("id", id)
//                .getSingleResult();

        // SQL
        category = (Category) em.createNativeQuery("select * from `category` where name=?", Category.class)
                .setParameter(1, name)
                .getSingleResult();

        return category;
    }



    @Override
    public Category findById(Long id) {

        Category category = new Category();

        EntityManager em = session.createEntityManager();
        em.getTransaction().begin();

        // HQL
//        category = em.createQuery("select c from Category c WHERE c.id=:id", Category.class)
//                .setParameter("id", id)
//                .getSingleResult();

        // SQL
        category = (Category) em.createNativeQuery("select * from `category` where id=?", Category.class)
                .setParameter(1, id)
                .getSingleResult();

        em.getTransaction().commit();
        em.close();

        return category;

    }

    @Override
    public void save(Category category) {

        EntityManager em = session.createEntityManager();
        em.getTransaction().begin();
        em.persist(category);
        em.getTransaction().commit();
        em.close();

    }

    @Override
    public void update(Category category) {

        EntityManager entityManager = session.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(category);
        entityManager.getTransaction().commit();
        entityManager.close();

    }

    @Override
    public void delete(Category category) {

        EntityManager entityManager = session.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.createNativeQuery("delete from category where id = " + category.getId()).
                executeUpdate();
        entityManager.getTransaction().commit();
        entityManager.close();

    }

    @Override
    public void deleteAll() {
        EntityManager entityManager = session.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.createNativeQuery("delete from category").
                executeUpdate();
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
