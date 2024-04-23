package ua.com.kneu.group203.example4.shop.repository;

import ua.com.kneu.group203.example4.shop.config.ConnectionToDb;
import ua.com.kneu.group203.example4.shop.dao.CategoryDao;
import ua.com.kneu.group203.example4.shop.entity.Category;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepository extends ConnectionToDb implements CategoryDao {

    Connection connection;

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

            rs = statement.executeQuery("SELECT * FROM `category`");

            while (rs.next()){
                Long id = rs.getLong("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                String image = rs.getString("image");

                categories.add(new Category(id, name, description,image));
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(rs!=null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
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

            rs = statement.executeQuery("SELECT * FROM `category` WHERE id='"+id+"'");

            while (rs.next()){
                Long _id = rs.getLong("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                String image = rs.getString("image");

                category = new Category(id, name, description,image);
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(rs!=null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }


        return category;
    }

    @Override
    public void save(Category category) {

        // Statement
        // PreparedStatement
        // CallableStatement

        Statement statement = null;

        try {
            statement = connection.createStatement();

            String sql = "INSERT INTO `category` (`name`, `description`, `image`) VALUES ('"+category.getName()+"', '"+category.getDescription()+"', '"+category.getImage()+"');";

            statement.execute(sql);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(statement!=null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

    @Override
    public void update(Category obj) {

        Statement statement = null;

        try {
            statement = connection.createStatement();

            String sql = "UPDATE `category` SET `name` = '"+obj.getName()+"', `description` = '"+obj.getDescription()+"', `image`='"+obj.getImage()+"'   WHERE `id` = '"+obj.getId()+"';";

            statement.executeUpdate(sql);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(statement!=null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

    @Override
    public void delete(Category category) {
        Statement statement = null;

        try {
            statement = connection.createStatement();

            String sql = "DELETE FROM `category`  WHERE `id` = '"+category.getId()+"';";

            statement.executeUpdate(sql);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(statement!=null) {
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
            statement = connection.createStatement();

            String sql = "DELETE FROM `category`";

            statement.executeUpdate(sql);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(statement!=null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
