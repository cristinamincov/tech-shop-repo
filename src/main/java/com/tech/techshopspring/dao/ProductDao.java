package com.tech.techshopspring.dao;

import com.tech.techshopspring.model.Product;
import com.tech.techshopspring.model.ProductCategory;
import com.tech.techshopspring.model.Supplier;

import java.util.List;

public interface ProductDao {

    void add(Product product);
    Product find(int id);
    void remove(int id);

    List<Product> getAll();
    List<Product> getBy(Supplier supplier);
    List<Product> getBy(ProductCategory productCategory);

}
