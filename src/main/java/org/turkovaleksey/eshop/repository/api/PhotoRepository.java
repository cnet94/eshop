package org.turkovaleksey.eshop.repository.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.turkovaleksey.eshop.repository.model.photo.Photo;

import java.util.List;

public interface PhotoRepository extends JpaRepository<Photo, Integer> {
}
