package ua.com.kneu.group204.example4.shop.repository;

import ua.com.kneu.group204.example4.shop.config.ConnectionToDb;
import ua.com.kneu.group204.example4.shop.dao.CategoryDao;
import ua.com.kneu.group204.example4.shop.entity.Category;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepository extends ConnectionToDb implements CategoryDao {

    private Connection connection;

    public CategoryRepository() {
        this.connection = getConnection();
    }

    @Override
    public List<Category> findAll() {

        List<Category> categories = new ArrayList<>();

        Statement statement = null;
        try {
            statement = connection.createStatement();

            String sql = "SELECT * FROM `category`";
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()){
                Long id = rs.getLong("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                String link = rs.getString("link");

                categories.add(new Category(id,name, description, link));
            }

            rs.close();
            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            //..
        }

        return categories;
    }

    @Override
    public Category findById(Long id) {

        Category category = new Category();

        Statement statement = null;
        try {
            statement = connection.createStatement();

            String sql = "SELECT * FROM `category`";
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()){
                Long _id = rs.getLong("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                String link = rs.getString("link");

                category = new Category(_id,name, description, link);
            }

            rs.close();
            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            //..
        }

        return category;
    }

    @Override
    public void save(Category obj) {

        try {
            String sql = "INSERT INTO `category` (`name`, `description`, `link`) VALUES ('"+obj.getName()+
                    "', '"+obj.getDescription()+
                    "', '"+obj.getLink()+"');";

            Statement statement = connection.createStatement();
            statement.execute(sql);

            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Category obj) {

        Statement statement  = null;

        try {
            String sql = "UPDATE `category` SET `name` = '"+obj.getName()+"', `description` = '"+obj.getDescription()+"', `link` = '"+obj.getLink()+"' WHERE `id` = '"+obj.getId()+"'";

            statement = connection.createStatement();
            statement.executeUpdate(sql);

            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(statement !=null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    @Override
    public void deleteById(Category obj) {

        Statement statement = null;

        try {

            String sql = "DELETE FROM `category` WHERE `id` = '"+obj.getId()+"'";

            statement = connection.createStatement();
            statement.executeUpdate(sql);

            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(statement !=null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

    @Override
    public void deleteAll() {
        Statement statement = null;

        try {

            String sql = "DELETE FROM `category`";

            statement = connection.createStatement();
            statement.executeUpdate(sql);

            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
