package org.turkovaleksey.eshop.controller.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.turkovaleksey.eshop.repository.model.product.Product;
import org.turkovaleksey.eshop.repository.model.categories.phone.PhoneWithProductProjection;
import org.turkovaleksey.eshop.service.impl.ServicePhoneImpl;

import java.util.List;

@Controller
@RequestMapping("/catalog/phones")
public class PhonesController {

    private ServicePhoneImpl servicePhone;

    @Autowired
    public void setServicePhone(ServicePhoneImpl servicePhone) {
        this.servicePhone = servicePhone;
    }

    @GetMapping("/")
    public ModelAndView showPhones() {
        ModelAndView modelAndView = new ModelAndView("categories/phones");
        List<PhoneWithProductProjection> allPhones = servicePhone.getAllByFilds();
//        List<Phone> allPhones = servicePhone.getAll();
//        List<Product> allProducts = serviceProduct.getAll();
        modelAndView.addObject("phones", allPhones);
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
//        serviceProduct.saveOrUpdate(product);
        return "redirect:/products/";
    }

    @GetMapping("/showUpdateForm")
    public ModelAndView showUpdateForm(@RequestParam Integer id) {
        ModelAndView modelAndView = new ModelAndView("add-product-form");
//        Product currentProduct = serviceProduct.getById(id);
//        modelAndView.addObject("product", currentProduct);
        return modelAndView;
    }

    @GetMapping("/deleteEntity")
    public String deleteEntity(@RequestParam Integer id) {
//        serviceProduct.deleteById(id);
        return "redirect:/products/";
    }

//    @GetMapping("/{id}")
//    public String getPhoneById(@PathVariable Long id, Model model) {
//        Phone phone = phoneService.getPhoneById(id);
//        model.addAttribute("phone", phone);
//        return "phone-details"; // Возвращает имя представления для отображения деталей телефона
//    }


}
