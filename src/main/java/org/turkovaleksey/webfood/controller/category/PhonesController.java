package org.turkovaleksey.webfood.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.turkovaleksey.webfood.repository.model.Product;
import org.turkovaleksey.webfood.service.api.ServiceProduct;

import java.util.List;

@Controller
@RequestMapping("/catalog/phones")
public class PhonesController {

    private ServiceProduct serviceProduct;

    @Autowired
    public void setServiceProduct(ServiceProduct serviceProduct) {
        this.serviceProduct = serviceProduct;
    }

    @GetMapping("/")
    public ModelAndView showProducts(){
        ModelAndView modelAndView = new ModelAndView("categories/phones");
        List<Product> allProducts = serviceProduct.getAll();
        modelAndView.addObject("products", allProducts);
        return modelAndView;
    }

    @GetMapping("/addEntityForm")
    public ModelAndView addEntityForm() {
        ModelAndView modelAndView = new ModelAndView("add-product-form");
        modelAndView.addObject("product", new Product());
        return modelAndView;
    }

    @PostMapping("/saveEntity")
    public String saveBrand(@ModelAttribute Product product) {
        serviceProduct.saveOrUpdate(product);
        return "redirect:/products/";
    }

    @GetMapping("/showUpdateForm")
    public ModelAndView showUpdateForm(@RequestParam Integer id) {
        ModelAndView modelAndView = new ModelAndView("add-product-form");
        Product currentProduct = serviceProduct.getById(id);
        modelAndView.addObject("product", currentProduct);
        return modelAndView;
    }

    @GetMapping("/deleteEntity")
    public String deleteEntity(@RequestParam Integer id){
        serviceProduct.deleteById(id);
        return "redirect:/products/";
    }



}
