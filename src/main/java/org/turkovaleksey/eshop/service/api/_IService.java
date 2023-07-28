package org.turkovaleksey.eshop.service.api;

import org.turkovaleksey.eshop.repository.model.product.Product;

import java.util.List;

public interface _IService<Product, T, K>{
    List<T> getAll();
    T getById(K id);
    void saveOrUpdate(Product product, T entity);
    void deleteById(K id);
}
