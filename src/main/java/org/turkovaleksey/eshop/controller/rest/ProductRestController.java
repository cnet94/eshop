package org.turkovaleksey.eshop.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.AccessType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.turkovaleksey.eshop.repository.api.ProductRepository;
import org.turkovaleksey.eshop.repository.model.product.Product;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductRestController {

    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/")
    public List<Product> getAll() {
        return productRepository.findAll();
    }
}
