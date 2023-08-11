package org.turkovaleksey.eshop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.turkovaleksey.eshop.repository.api.PhotoRepository;
import org.turkovaleksey.eshop.repository.model.product.Photo;
import org.turkovaleksey.eshop.service.api._IService;

import java.util.List;
import java.util.Optional;

@Service
public class PhotoServiceImpl implements _IService<Photo, Long> {

    private PhotoRepository photoRepository;

    @Autowired
    public void setPhotoRepository(PhotoRepository photoRepository) {
        this.photoRepository = photoRepository;
    }

    @Override
    public List<Photo> getAll() {
        return photoRepository.findAll();
    }

    @Override
    public Photo getById(Long id) {
        Optional<Photo> photo = photoRepository.findById(id);
        if (photo.isPresent()) {
            return photo.get();
        }
        try {
            throw new RuntimeException("Photo with id - " + id + " not found");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String saveOrUpdate(Photo entity) {
        photoRepository.save(entity);
        return null;
    }

    @Override
    public String deleteById(Long id) {
        photoRepository.deleteById(id);
        return null;
    }
}
