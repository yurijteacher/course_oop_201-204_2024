package ua.com.kneu.group201.example5.shop.repository;

import ua.com.kneu.group201.example5.shop.config.ConnectionToDb;
import ua.com.kneu.group201.example5.shop.dao.CategoryDao;
import ua.com.kneu.group201.example5.shop.entity.Category;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CategoryRepository extends ConnectionToDb implements CategoryDao {

    Connection connection;

    public CategoryRepository() {
        connection = super.getConnection();
    }

    /*
Statement
PreparedStatement
CallableStatement
 */
    @Override
    public List<Category> findAll() {

        List<Category> categories = new ArrayList<>();

        String sql = "select * from `category`";

        Statement st = null;
        ResultSet rs = null;
        try {
            st = connection.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()){
                Long id = rs.getLong("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                String link = rs.getString("link");


                categories.add(new Category(id, name, description, link));

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                rs.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                st.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        return categories;
    }

    @Override
    public Category findById(Long id) {

        Category category = new Category();

        String sql = "select * from `category` where `id`="+id;

        Statement st = null;
        ResultSet rs = null;
        try {
            st = connection.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()){
                Long _id = rs.getLong("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                String link = rs.getString("link");

                category = new Category(_id, name, description, link);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                rs.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                st.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        return category;

    }

    @Override
    public Category findByName(String name) {

        Category category = new Category();

        String sql = "select * from `category` where `name`="+name;

        Statement st = null;
        ResultSet rs = null;
        try {
            st = connection.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()){
                Long _id = rs.getLong("id");
                String _name = rs.getString("name");
                String description = rs.getString("description");
                String link = rs.getString("link");

                category = new Category(_id, _name, description, link);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                rs.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                st.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        return category;
    }

    @Override
    public void save(Category category) {

        String sql = "INSERT INTO `category` (`name`, `description`,`link`) " +
                "VALUES ('"+category.getName()+"', '"+category.getDescription()+"','"+category.getLink()+"')";

        Statement statement = null;

        try {
            statement = connection.createStatement();
            statement.execute(sql);

            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(statement!=null){
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
        String sql = "UPDATE `category` SET `name` = '"+obj.getName()+"', `description` = '"+obj.getDescription()+"', `link` = '"+obj.getLink()+"' WHERE `id` = '"+obj.getId()+"';";

        Statement statement = null;

        try {
            statement = connection.createStatement();
            statement.executeUpdate(sql);

            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    @Override
    public void deleteByObj(Category obj) {
        String sql = "DELETE FROM `category` WHERE `id` = '"+obj.getId()+"';";

        Statement statement = null;

        try {
            statement = connection.createStatement();
            statement.executeUpdate(sql);

            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(statement!=null){
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
        String sql = "DELETE FROM `category`;";

        Statement statement = null;

        try {
            statement = connection.createStatement();
            statement.executeUpdate(sql);

            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(statement!=null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
