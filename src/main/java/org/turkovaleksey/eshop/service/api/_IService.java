package org.turkovaleksey.eshop.service.api;

import java.util.List;

public interface _IService<T, K>{
    List<T> getAll();
    T getById(K id);
    void saveOrUpdate(T entity);
    void deleteById(K id);
}
