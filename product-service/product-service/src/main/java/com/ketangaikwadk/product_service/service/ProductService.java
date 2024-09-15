package com.ketangaikwadk.product_service.service;

import com.ketangaikwadk.product_service.dto.ProductRequest;
import com.ketangaikwadk.product_service.model.Product;
import com.ketangaikwadk.product_service.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void createProduct(ProductRequest productRequest) {

        Product product = Product.builder()
                .name(productRequest.getName())
                .price(productRequest.getPrice())
                .description(productRequest.getDescription())
                .build();

        productRepository.save(product);
    }
}
