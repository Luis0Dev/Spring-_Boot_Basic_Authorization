package com.Illusion0DEV.Controller;

import com.Illusion0DEV.Entity.Product;
import com.Illusion0DEV.Services.ProductService;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PreAuthorize("hasRole('PRODUCT_SELECT')")
    @GetMapping
    public List<Product> productAll(){
        return productService.productAll();
    }

    @PreAuthorize("hasRole('PRPODUCT_INSERT')")
    @PostMapping
    public Product created(@RequestBody Product product){
        return  productService.created(product);
    }

    @PreAuthorize("hasRole('PRPODUCT_UPDATE')")
    @PutMapping
    public Product update(@RequestBody Product product){
        return productService.update(product);
    }

    @PreAuthorize("hasRole('PRPODUCT_DELETE')")
    @DeleteMapping
    public void delete(@RequestParam Long id){
        productService.delete(id);
    }
}
