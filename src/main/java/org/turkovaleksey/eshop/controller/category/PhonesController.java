package org.turkovaleksey.eshop.controller.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.turkovaleksey.eshop.controller.api._IController;
import org.turkovaleksey.eshop.repository.model.categories.phone.Phone;
import org.turkovaleksey.eshop.repository.model.categories.phone.PhoneWithProductProjection;
import org.turkovaleksey.eshop.repository.model.product.Photo;
import org.turkovaleksey.eshop.repository.model.product.Product;
import org.turkovaleksey.eshop.service.impl.PhoneServiceImpl;
import org.turkovaleksey.eshop.service.impl.PhotoServiceImpl;
import org.turkovaleksey.eshop.service.impl.ProductServiceImpl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.Random;

import static org.turkovaleksey.eshop.controller.Constants.*;

@Controller
@RequestMapping("/catalog/phones")
public class PhonesController implements _IController<Phone, Integer> {
    private PhoneServiceImpl phoneService;

    @Autowired
    public void setService(PhoneServiceImpl phoneService) {
        this.phoneService = phoneService;
    }

    @Autowired
    public void setPhoneService(PhoneServiceImpl phoneService) {
        this.phoneService = phoneService;
    }

    @Override
    @GetMapping("/")
    public ModelAndView showAll() {
        ModelAndView modelAndView = new ModelAndView(PAGE_CATALOG_PHONES);
        List<Phone> allPhones = phoneService.getAllPhonesWithProducts();
        modelAndView.addObject("phonesList", allPhones);
        return modelAndView;
    }

    @GetMapping("/projection")
    public ModelAndView showAllProjection() {
        ModelAndView modelAndView = new ModelAndView(PAGE_CATALOG_PHONES);
        List<PhoneWithProductProjection> allPhones = phoneService.getAllPhonesWithProductsProjection();
        modelAndView.addObject("phonesList", allPhones);
        return modelAndView;
    }

    @Override
    @GetMapping("/{id}")
    public ModelAndView showById(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView(PAGE_CARD_PHONE);
        Phone phone = phoneService.getById(id);
        modelAndView.addObject("phone", phone);
        return modelAndView;
    }

    @Override
    @PostMapping("/save")
    public String saveOrUpdate(@ModelAttribute("phone") Phone phone) {
        phoneService.saveOrUpdate(phone);
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
        product.setUrlImg("http://test.com/" + temp);
        product.setDescription("Somthing test " + temp);
        Phone phone = new Phone();
        phone.setBrand("Brand " + temp);
        phone.setModel("Model " + temp);
        phone.setProduct(product);
        phone.setMemory(temp);
        phone.setRam(temp);
        phone.setSystem("OS");
        phone.setDisplaySize(55);
        phoneService.saveOrUpdate(phone);
        return "redirect:/catalog/phones/";
    }

    @Override
    @GetMapping("/delete")
    public String deleteById(@RequestParam Integer id) {
        phoneService.deleteById(id);
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
