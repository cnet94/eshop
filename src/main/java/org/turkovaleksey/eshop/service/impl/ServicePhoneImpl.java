package org.turkovaleksey.eshop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.turkovaleksey.eshop.repository.api.PhoneRepository;
import org.turkovaleksey.eshop.repository.api.ProductRepository;
import org.turkovaleksey.eshop.repository.model.categories.phone.Phone;
import org.turkovaleksey.eshop.repository.model.categories.phone.PhoneWithProductProjection;
import org.turkovaleksey.eshop.repository.model.product.Product;
import org.turkovaleksey.eshop.service.api._IService;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ServicePhoneImpl implements _IService<Phone, Integer> {

    private final ProductRepository productRepository;
    private final PhoneRepository phoneRepository;

    @Autowired
    public ServicePhoneImpl(ProductRepository productRepository, PhoneRepository phoneRepository) {
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
        return phoneRepository.getById(id);
    }

    @Override
    @Transactional
    public void saveOrUpdate(Phone phone) {
        Product prodcut = phone.getProduct();
        productRepository.save(prodcut);
        phoneRepository.save(phone);
    }

    @Override
    public void deleteById(Integer id) {
        phoneRepository.deleteById(id);
    }
}
