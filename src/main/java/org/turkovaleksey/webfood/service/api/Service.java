package org.turkovaleksey.webfood.service.api;

import java.util.List;

public interface Service<T, K>{
    List<T> getAll();
    T getById(K id);
    void saveOrUpdate(T entity);
    void deleteById(K id);
}
