package ua.com.kneu.group202.example3.shop.repository;

import ua.com.kneu.group202.example3.shop.config.ConnectionToDb;
import ua.com.kneu.group202.example3.shop.dao.ProductDao;
import ua.com.kneu.group202.example3.shop.entity.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository extends ConnectionToDb implements ProductDao {

    Connection connection;

    public ProductRepository() {
        connection = getConnection();
    }

    @Override
    public List<Product> findAll() {

        List<Product> products = new ArrayList<>();

        String sql = "select * from `product`";
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()){
                Product product = new Product();


                product.setId(rs.getLong("id"));
                product.setName(rs.getString("name"));
                product.setDescription(rs.getString("description"));
                product.setLink(rs.getString("link"));
                product.setPrice(rs.getDouble("price"));
                product.setCategory(new CategoryRepository().findById(rs.getLong("category_id")));

                products.add(product);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                rs.close();
                ps.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        return products;
    }

    @Override
    public Product findById(Long id) {

        Product product = new Product();

        String sql = "select * from `product` WHERE `id`=?";
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = connection.prepareStatement(sql);
            ps.setLong(1, id);

            rs = ps.executeQuery();

            while (rs.next()){

                product.setId(rs.getLong("id"));
                product.setName(rs.getString("name"));
                product.setDescription(rs.getString("description"));
                product.setLink(rs.getString("link"));
                product.setPrice(rs.getDouble("price"));
                product.setCategory(new CategoryRepository().findById(rs.getLong("category_id")));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                rs.close();
                ps.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        return product;
    }

    @Override
    public void save(Product product) {

        String sql = "INSERT INTO `product` (`name`, `description`, `price`, `link`, `category_id`) VALUES (?, ?, ?, ?, ?);";

        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, product.getName());
            ps.setString(2, product.getDescription());
            ps.setDouble(3, product.getPrice());
            ps.setString(4,product.getLink());
            ps.setLong(5, product.getCategory().getId());

            ps.execute();

            ps.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(ps!=null){
                try {
                    ps.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }




    }

    @Override
    public void update(Product product) {



        String sql = "UPDATE `product` SET `name` = ?, `description` = ?, `price` = ?, `link` = ?, `category_id` = ? WHERE `id` = ?;";

        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, product.getName());
            ps.setString(2, product.getDescription());
            ps.setDouble(3, product.getPrice());
            ps.setString(4,product.getLink());
            ps.setLong(5, product.getCategory().getId());
            ps.setLong(6, product.getId());

            ps.executeUpdate();

            ps.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(ps!=null){
                try {
                    ps.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

    @Override
    public void delete(Product product) {

        String sql = "DELETE FROM `product` WHERE `id` = ?;";

        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sql);
            ps.setLong(1, product.getId());

            ps.executeUpdate();

            ps.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(ps!=null){
                try {
                    ps.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    @Override
    public void deleteAll() {
        String sql = "DELETE FROM `product`";

        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sql);
            ps.executeUpdate();

            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(ps!=null){
                try {
                    ps.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
