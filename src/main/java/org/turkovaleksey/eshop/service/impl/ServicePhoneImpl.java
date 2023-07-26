package org.turkovaleksey.eshop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.turkovaleksey.eshop.repository.api.PhoneRepository;
import org.turkovaleksey.eshop.repository.model.categories.phone.Phone;
import org.turkovaleksey.eshop.repository.model.categories.phone.PhoneWithProductProjection;
import org.turkovaleksey.eshop.service.api._IService;

import java.util.List;

@Service
public class ServicePhoneImpl implements _IService<Phone, Integer> {

    private PhoneRepository phoneRepository;

    @Autowired
    public void setPhoneRepository(PhoneRepository phoneRepository) {
        this.phoneRepository = phoneRepository;
    }

    public List<PhoneWithProductProjection> getAllByFilds() {
        return phoneRepository.findAllPhonesWithSelectedFields();
    }

    @Override
    public List<Phone> getAll() {
        return phoneRepository.findAllPhonesWithProducts();
    }

    @Override
    public Phone getById(Integer id) {
        return phoneRepository.getById(id);
    }

    @Override
    public void saveOrUpdate(Phone entity) {

    }

    @Override
    public void deleteById(Integer id) {

    }
}
