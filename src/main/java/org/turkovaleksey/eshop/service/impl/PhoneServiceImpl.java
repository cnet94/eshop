package org.turkovaleksey.eshop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.turkovaleksey.eshop.repository.api.PhoneRepository;
import org.turkovaleksey.eshop.repository.api.ProductRepository;
import org.turkovaleksey.eshop.repository.model.categories.phone.InfoPhone;
import org.turkovaleksey.eshop.repository.model.categories.phone.Phone;
import org.turkovaleksey.eshop.repository.model.categories.phone.PhoneWithProductProjection;
import org.turkovaleksey.eshop.repository.model.product.Product;
import org.turkovaleksey.eshop.service.api._IService;
import org.turkovaleksey.eshop.service.exceptions.PhoneServiceException;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class PhoneServiceImpl implements _IService<Phone, Integer> {

    private final ProductRepository productRepository;
    private final PhoneRepository phoneRepository;

    @Autowired
    public PhoneServiceImpl(ProductRepository productRepository, PhoneRepository phoneRepository) {
        this.productRepository = productRepository;
        this.phoneRepository = phoneRepository;
    }

    @Override
    public List<Phone> getAll() {
        return phoneRepository.findAll();
    }

    public List<Phone> getAllPhonesWithProducts() {
        return phoneRepository.findAllPhonesWithProducts();
    }

    public List<PhoneWithProductProjection> getAllPhonesWithProductsProjection() {
        return phoneRepository.findAllPhonesWithProductsSelectedFields();
    }

    @Override
    public Phone getById(Integer id) {
        Optional<Phone> phone = phoneRepository.findById(id);
        if (phone.isPresent()) {
            return phone.get();
        }
        try {
            throw new RuntimeException("Phone with id - " + id + " not found");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    @Transactional
    public String saveOrUpdate(Phone phone) {
        try {
            Product prodcut = phone.getProduct();
            productRepository.save(prodcut);
            phoneRepository.save(phone);
        } catch (RuntimeException e) {
            throw new PhoneServiceException("Error save phone");
        }
        return null;
    }

    @Override
    public String deleteById(Integer id) {
        phoneRepository.deleteById(id);
        return null;
    }

    public InfoPhone getMinInfo(){
        Integer count = phoneRepository.countAllBy();
        return new InfoPhone(count);
    }
}
