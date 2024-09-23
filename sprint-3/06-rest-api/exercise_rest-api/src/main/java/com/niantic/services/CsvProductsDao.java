package com.niantic.services;

import com.niantic.models.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

public class CsvProductsDao implements ProductDao
{

    @Override
    public List<Product> getProducts() {
        return List.of();
    }

    @Override
    public Product getProduct(int id)
    {
        return null;
    }

    @Override
    public Product addProduct(Product Category)
    {
        return null;
    }

    @Override
    public void updateProduct(int id, Product Category)
    {

    }

    @Override
    public void deleteProduct(int id)
    {

    }
}
