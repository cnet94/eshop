package org.turkovaleksey.eshop.controller.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.turkovaleksey.eshop.controller.api._IController;
import org.turkovaleksey.eshop.repository.model.categories.phone.Phone;
import org.turkovaleksey.eshop.repository.model.categories.phone.PhoneWithProductProjection;
import org.turkovaleksey.eshop.repository.model.product.Product;
import org.turkovaleksey.eshop.service.impl.ServicePhoneImpl;

import java.util.List;

import static org.turkovaleksey.eshop.Constants.PAGE_CARD_PHONE;
import static org.turkovaleksey.eshop.Constants.PAGE_CATALOG_PHONES;

@Controller
@RequestMapping("/catalog/phones")
public class PhonesController implements _IController<Phone, Integer> {

    private ServicePhoneImpl servicePhone;

    @Autowired
    public void setServicePhone(ServicePhoneImpl servicePhone) {
        this.servicePhone = servicePhone;
    }

    @Override
    @GetMapping("/")
    public ModelAndView showAll() {
        return new ModelAndView();
    }

    @GetMapping("/phonesWithPeoduct")
    public ModelAndView showAllPhonesWithProducts() {
        ModelAndView modelAndView = new ModelAndView(PAGE_CATALOG_PHONES);
        List<Phone> allPhones = servicePhone.getAllPhonesWithProducts();
        modelAndView.addObject("phonesList", allPhones);
        return modelAndView;
    }

    @GetMapping("/phonesWithProductProjection")
    public ModelAndView showAllPhonesWithProductsProjection() {
        ModelAndView modelAndView = new ModelAndView(PAGE_CATALOG_PHONES);
        List<PhoneWithProductProjection> allPhones = servicePhone.getAllPhonesWithProductsProjection();
        modelAndView.addObject("phonesList", allPhones);
        return modelAndView;
    }

    @Override
    @GetMapping("/{id}")
    public ModelAndView showById(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView(PAGE_CARD_PHONE);
        Phone phone = servicePhone.getById(id);
        modelAndView.addObject("phone", phone);
        return modelAndView;
    }

    @Override
    @PostMapping("/save")
    public String saveOrUpdate(@ModelAttribute Phone phone) {
        servicePhone.saveOrUpdate(new Product(),phone);
        return "redirect:" + PAGE_CATALOG_PHONES;
    }

    @Override
    @DeleteMapping("/delete")
    public String deleteById(@RequestParam Integer id) {
        servicePhone.deleteById(id);
        return "redirect:" + PAGE_CATALOG_PHONES;
    }

    @GetMapping("/showUpdateForm")
    public ModelAndView showUpdateForm(@RequestParam Integer id) {
        ModelAndView modelAndView = new ModelAndView("add-product-form");
//        Product currentProduct = serviceProduct.getById(id);
//        modelAndView.addObject("product", currentProduct);
        return modelAndView;
    }

    @PostMapping("/addEntityForm")
    public ModelAndView addEntityForm() {
        ModelAndView modelAndView = new ModelAndView("add-product-form");
        modelAndView.addObject("product", new Product());
        return modelAndView;
    }


}
