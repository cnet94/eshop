package org.turkovaleksey.eshop.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.turkovaleksey.eshop.repository.api.PhoneRepository;
import org.turkovaleksey.eshop.repository.api.PhotoRepository;
import org.turkovaleksey.eshop.repository.model.categories.phone.Phone;
import org.turkovaleksey.eshop.repository.model.categories.phone.PhoneWithProductProjection;
import org.turkovaleksey.eshop.repository.model.photo.Photo;

import java.util.List;

@RestController
@RequestMapping("/api/phone")
public class PhoneRestController {
    private PhoneRepository phoneRepository;
    private PhotoRepository photoRepository;

    @Autowired
    public void setPhoneRepository(PhoneRepository phoneRepository, PhotoRepository photoRepository) {
        this.phoneRepository = phoneRepository;
        this.photoRepository = photoRepository;
    }

    @GetMapping("/")
    public List<Phone> getAll(){
        return phoneRepository.findAllPhonesWithProducts();
    }

    @GetMapping("/a")
    public List<PhoneWithProductProjection> getAllField(){
        return phoneRepository.findAllPhonesWithProductsSelectedFields();
    }

    @GetMapping("/photos/")
    public List<Photo> getPhotoById() {
        return photoRepository.findAll();
    }

}
