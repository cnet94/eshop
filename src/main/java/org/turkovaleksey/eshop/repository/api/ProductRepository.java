package org.turkovaleksey.eshop.repository.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.turkovaleksey.eshop.repository.model.photo.Photo;
import org.turkovaleksey.eshop.repository.model.product.Product;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
