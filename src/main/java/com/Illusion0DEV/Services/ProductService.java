package com.Illusion0DEV.Services;

import com.Illusion0DEV.Entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> productAll();
    Product created(Product product);
    Product update(Product product);
    void delete(Long id);



}
