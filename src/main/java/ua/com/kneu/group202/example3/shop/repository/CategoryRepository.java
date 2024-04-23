package ua.com.kneu.group202.example3.shop.repository;

import com.mysql.cj.jdbc.CallableStatement;
import ua.com.kneu.group202.example3.shop.config.ConnectionToDb;
import ua.com.kneu.group202.example3.shop.dao.CategoryDao;
import ua.com.kneu.group202.example3.shop.entity.Category;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepository extends ConnectionToDb implements CategoryDao {

    Connection connection;

    /*
    Statement
    PreparedStatement
    CallableStatement
     */




    public CategoryRepository() {
        this.connection = getConnection();
    }

    @Override
    public List<Category> findAll() {

        List<Category> categories = new ArrayList<>();

        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = connection.createStatement();

            String sql = "SELECT * FROM `category`";

            rs = statement.executeQuery(sql);

            while (rs.next()){

                Long id = rs.getLong("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                String link = rs.getString("link");

                categories.add(new Category(id, name, description, link));

            }

            rs.close();
            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                rs.close();
                statement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        return categories;
    }

    @Override
    public Category findById(Long id) {

        Category category = new Category();

        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = connection.createStatement();

            String sql = "SELECT * FROM `category` WHERE id='"+id+"'";

            rs = statement.executeQuery(sql);

            while (rs.next()){

                Long _id = rs.getLong("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                String link = rs.getString("link");

                category = new Category(_id, name, description, link);

            }

            rs.close();
            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                rs.close();
                statement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        return category;
    }

    @Override
    public void save(Category category) {

        Statement statement = null;

        try {
            statement = connection.createStatement();

            String sql ="INSERT INTO `category` (`name`, `description`, `link`) VALUES ('"
                    +category.getName()+"', '"+category.getDescription()+"', '"+category.getLink()+"');";

            statement.execute(sql);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }



    }

    @Override
    public void update(Category category) {

        Statement statement = null;

        try {
            statement = connection.createStatement();

            String sql ="UPDATE `category` SET `name` = '"+category.getName()+
                    "', `description` = '"+category.getDescription()+"', `link` = '"+category.getLink()+"' WHERE `id` = '"+category.getId()+"';";
            statement.executeUpdate(sql);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }

    @Override
    public void delete(Category category) {
        Statement statement = null;

        try {
            statement = connection.createStatement();

            String sql ="DELETE FROM `category` WHERE `id` = '" + category.getId() + "';";
            statement.executeUpdate(sql);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void deleteAll() {
        Statement statement = null;

        try {
            statement = connection.createStatement();

            String sql ="DELETE FROM `category`;";
            statement.executeUpdate(sql);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
