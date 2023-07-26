package org.turkovaleksey.eshop.repository.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.turkovaleksey.eshop.repository.model.categories.phone.Phone;
import org.turkovaleksey.eshop.repository.model.categories.phone.PhoneWithProductProjection;

import java.util.List;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Integer> {

    @Query("SELECT p FROM Phone p JOIN FETCH p.product")
    List<Phone> findAllPhonesWithProducts();

    @Query("SELECT p.id as id, p.brand as brand, p.model as model, p.product as product FROM Phone p")
    List<PhoneWithProductProjection> findAllPhonesWithSelectedFields();

}
