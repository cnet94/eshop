package org.turkovaleksey.eshop.repository.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.turkovaleksey.eshop.repository.model.product.Photo;

@Repository
public interface PhotoRepository extends JpaRepository<Photo, Long> {
}
