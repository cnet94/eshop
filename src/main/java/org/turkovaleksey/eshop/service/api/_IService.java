package org.turkovaleksey.eshop.service.api;

import org.turkovaleksey.eshop.repository.model.product.Product;

import java.util.List;

public interface _IService<T, K>{
    List<T> getAll();
    T getById(K id);
    String saveOrUpdate(T entity);
    String deleteById(K id);
}
