package com.Illusion0DEV.Services;

import com.Illusion0DEV.Entity.Product;
import com.Illusion0DEV.Repository.ProductRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public List<Product> productAll(){
        return productRepository.findAll();
    }

    @Override
    public Product created(Product product){
        if(product.getId() != null){
            throw  new RuntimeException("To create a record, you cannot have an Id");
        }
        return productRepository.save(product);
    }

    @Override
    public  Product update(Product product){
        if(product.getId() == null){
            throw  new RuntimeException("To create a record, you must have an Id");
        }
        return productRepository.save(product);
    }

    @Override
    public void delete(Long id){
        productRepository.deleteById(id);
    }
}
