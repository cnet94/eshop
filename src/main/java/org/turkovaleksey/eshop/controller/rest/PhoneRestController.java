package org.turkovaleksey.eshop.controller.rest;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.turkovaleksey.eshop.repository.api.PhoneRepository;
import org.turkovaleksey.eshop.repository.api.PhotoRepository;
import org.turkovaleksey.eshop.repository.model.categories.phone.Phone;
import org.turkovaleksey.eshop.repository.model.categories.phone.PhoneWithProductProjection;
import org.turkovaleksey.eshop.repository.model.photo.Photo;

import java.util.List;

import static org.turkovaleksey.eshop.Constants.PAGE_CARD_PHONE;

@RestController
@RequestMapping("/api/phones")
public class PhoneRestController {
    @Autowired
    private PhoneRepository repository;

    @Autowired
    private PhotoRepository photoRepository;

    @GetMapping("/")
    public List<Phone> getAll(){
        return repository.findAllPhonesWithProducts();
    }

    @GetMapping("/a")
    public List<PhoneWithProductProjection> getAllField(){
        return repository.findAllPhonesWithProductsSelectedFields();
    }

    @GetMapping("/photos/")
    public List<Photo> getPhotoById() {
        return photoRepository.findAll();
    }

}
