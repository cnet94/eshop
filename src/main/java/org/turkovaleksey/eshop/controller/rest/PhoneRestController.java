package org.turkovaleksey.eshop.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.turkovaleksey.eshop.repository.api.PhoneRepository;
import org.turkovaleksey.eshop.repository.model.categories.phone.Phone;
import org.turkovaleksey.eshop.repository.model.categories.phone.PhoneWithProductProjection;

import java.util.List;

@RestController
@RequestMapping("/api/phones")
public class PhoneRestController {
    @Autowired
    private PhoneRepository repository;

    @GetMapping("/")
    public List<Phone> getAll(){
        return repository.findAllPhonesWithProducts();
    }

    @GetMapping("/a")
    public List<PhoneWithProductProjection> getAllField(){
        return repository.findAllPhonesWithProductsSelectedFields();
    }

}
