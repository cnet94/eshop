package org.turkovaleksey.eshop.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.turkovaleksey.eshop.repository.api.PhotoRepository;
import org.turkovaleksey.eshop.repository.api.ProductRepository;
import org.turkovaleksey.eshop.repository.model.product.Photo;
import org.turkovaleksey.eshop.repository.model.product.Product;

import java.util.List;

@RestController
@RequestMapping("/api/photos")
public class PhotoRestController {

    private PhotoRepository photoRepository;

    @Autowired
    public void setPhotoRepository(PhotoRepository photoRepository) {
        this.photoRepository = photoRepository;
    }

    @GetMapping("/")
    public List<Photo> getAll() {
        return photoRepository.findAll();
    }
}
