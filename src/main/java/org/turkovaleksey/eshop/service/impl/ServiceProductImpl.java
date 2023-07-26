package org.turkovaleksey.eshop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.turkovaleksey.eshop.repository.api.ProductRepository;
import org.turkovaleksey.eshop.repository.model.product.Product;
import org.turkovaleksey.eshop.service.api._IService;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceProductImpl implements _IService<Product,Integer> {

    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Product getById(Integer id) {
        Optional<Product> product = productRepository.findById(id);
        if (product.isPresent()) {
            return product.get();
        }
        try {
            throw new RuntimeException("Product with id - " + id + " not found");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void saveOrUpdate(Product entity) {
        productRepository.save(entity);
    }

    @Override
    public void deleteById(Integer id) {
        productRepository.deleteById(id);
    }
}
