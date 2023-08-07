package org.turkovaleksey.eshop.controller.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.turkovaleksey.eshop.controller.api._IController;
import org.turkovaleksey.eshop.repository.model.categories.phone.Phone;
import org.turkovaleksey.eshop.repository.model.categories.phone.PhoneWithProductProjection;
import org.turkovaleksey.eshop.repository.model.product.Product;
import org.turkovaleksey.eshop.service.impl.ServicePhoneImpl;

import java.util.List;
import java.util.Random;

import static org.turkovaleksey.eshop.Constants.*;

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
        ModelAndView modelAndView = new ModelAndView(PAGE_CATALOG_PHONES);
        List<Phone> allPhones = servicePhone.getAllPhonesWithProducts();
        modelAndView.addObject("phonesList", allPhones);
        return modelAndView;
    }

    @GetMapping("/projection")
    public ModelAndView showAllProjection() {
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
    public String saveOrUpdate(@ModelAttribute("phone") Phone phone) {
        servicePhone.saveOrUpdate(phone);
        return "redirect:" + PAGE_CATALOG_PHONES;
    }

    @GetMapping("/quickSave")
    public String quickSave() {
        Random random = new Random();
        Integer temp = random.nextInt();
        Product product = new Product();
        product.setShopId(1);
        product.setCategory("phones");
        product.setTitle("Title " + temp);
        product.setPrice(999.12);
        product.setUrlImg("http://test.com/"+temp);
        product.setDescription("Somthing test " + temp);
        Phone phone = new Phone();
        phone.setBrand("Brand " + temp);
        phone.setModel("Model " + temp);
        phone.setProduct(product);
        phone.setMemory(temp);
        phone.setRam(temp);
        phone.setSystem("OS");
        phone.setDisplaySize(55);
        servicePhone.saveOrUpdate(phone);
        return "redirect:/catalog/phones/";
    }

    @Override
    @GetMapping("/delete")
    public String deleteById(@RequestParam Integer id) {
        servicePhone.deleteById(id);
        return "redirect:/catalog/phones/";
    }

    @GetMapping("/newEntityForm")
    public ModelAndView newEntityForm() {
        ModelAndView modelAndView = new ModelAndView(PAGE_PHONES_FORM);
        modelAndView.addObject("product", new Product());
        modelAndView.addObject("phone", new Phone());
        return modelAndView;
    }

    @GetMapping("/showUpdateForm")
    public ModelAndView showUpdateForm(@RequestParam Integer id) {
        ModelAndView modelAndView = new ModelAndView(PAGE_PHONES_FORM);
//        Product currentProduct = serviceProduct.getById(id);
//        modelAndView.addObject("product", currentProduct);
        return modelAndView;
    }


}
