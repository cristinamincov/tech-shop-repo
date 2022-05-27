package com.tech.techshopspring.service;

import com.tech.techshopspring.dao.ProductCategoryDao;
import com.tech.techshopspring.dao.ProductDao;
import com.tech.techshopspring.model.Product;
import com.tech.techshopspring.model.ProductCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductService{
    private ProductDao productDao;
    private ProductCategoryDao productCategoryDao;

    @Autowired
    public ProductService(ProductDao productDao, ProductCategoryDao productCategoryDao) {
        this.productDao = productDao;
        this.productCategoryDao = productCategoryDao;
    }

    public ProductCategory getProductCategory(int categoryId){
        return productCategoryDao.find(categoryId);
    }

    public List<Product> getProductsForCategory(int categoryId){
        var category = productCategoryDao.find(categoryId);
        return productDao.getBy(category);
    }


}
