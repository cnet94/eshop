package org.turkovaleksey.eshop.controller.api;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

public interface _IController<T, K>{
    ModelAndView showAll();
    ModelAndView showById(@PathVariable K id);
    String saveOrUpdate(@ModelAttribute T entity);
    String deleteById(@RequestParam K id);
}
