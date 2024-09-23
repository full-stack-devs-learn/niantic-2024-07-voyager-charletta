package com.niantic.services;
import com.niantic.services.ProductDao;
import com.niantic.models.Product;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MySqlProductDao implements ProductDao
{


    private final JdbcTemplate jdbcTemplate;

    public MySqlProductDao()
    {
        String databaseUrl = "jdbc:mysql://localhost:3306/northwind";
        String userName = "root";
        String password = "P@ssw0rd";
        DataSource dataSource = new BasicDataSource(){{
            setUrl(databaseUrl);
            setUsername(userName);
            setPassword(password);
        }};

        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<Product> getProducts()
    {
        List<Product> products = new ArrayList<>();

        String sql = """
        SELECT product_id, product_name
        FROM products
        """;

        SqlRowSet row = jdbcTemplate.queryForRowSet(sql);

        while(row.next())
        {
            int productId = row.getInt("product_id");
            String productName = row.getString("product_name");


            Product product = new Product(productId, productName);

            products.add(product);
        }

        return products;
    }


    public Product getProduct(int productId)
    {
        Product id = null;

        String sql = """
                SELECT product_id, product_name
                FROM products
                WHERE product_id = ?
        """;

        SqlRowSet row = jdbcTemplate.queryForRowSet(sql, productId);

        Product product = new Product();
        if(row.next())
        {
            String productName = row.getString("product_name");


            product= new Product(productId, productName);

        }

        return product;
    }

    public Product addProduct(Product product)
    {
        String sql = """
                INSERT INTO Products (product_name)
                VALUES (?)
                """;


        // insert a new record and retrieve the generated id
        KeyHolder keyHolder = new GeneratedKeyHolder();

        jdbcTemplate.update(connection -> {
            // we have to define the PreparedStatement directly
            // Statement.RETURN_GENERATED_KEYS is only used for auto generated ids
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, product.getProductName());
            statement.setString(2, product.getProductId());
            return statement;
        }, keyHolder);

        int newId = keyHolder.getKey().intValue();

        return getProduct(newId);
    }


    public void updateProduct(int id, Product product)
    {
        String sql = """
                UPDATE products
                SET product_name = ?
                WHERE product_id = ?
                """;

        jdbcTemplate.update(sql
                , product.getProductName()
                , id);
    }


    public void deleteProduct(int productId)
    {
        String sql = """
                DELETE FROM products
                WHERE product_id = ?
                """;

        jdbcTemplate.update(sql, productId);
    }


}


