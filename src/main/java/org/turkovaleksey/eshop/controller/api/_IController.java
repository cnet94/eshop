package org.turkovaleksey.eshop.controller.api;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.turkovaleksey.eshop.repository.model.product.Product;

public interface _IController<T, K>{
    ModelAndView showAll();
    ModelAndView showById(K id);
    String saveOrUpdate(T entity);
    String deleteById(K id);
}
