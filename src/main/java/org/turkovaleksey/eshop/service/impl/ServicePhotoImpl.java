package org.turkovaleksey.eshop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.turkovaleksey.eshop.repository.api.PhotoRepository;
import org.turkovaleksey.eshop.repository.api.ProductRepository;
import org.turkovaleksey.eshop.repository.model.photo.Photo;
import org.turkovaleksey.eshop.repository.model.product.Product;

import java.util.List;
import java.util.Optional;

@Service
public class ServicePhotoImpl {

    private PhotoRepository photoRepository;

    @Autowired
    public void setPhotoRepository(PhotoRepository photoRepository) {
        this.photoRepository = photoRepository;
    }

    public List<Photo> getAll() {
        return null;
    }

    public Photo getById(Long id) {
        return null;
    }

    public void saveOrUpdate(Photo entity) {
        photoRepository.save(entity);
    }
    public void deleteById(Long id) {
    }
}
