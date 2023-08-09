package org.turkovaleksey.eshop.repository.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.turkovaleksey.eshop.repository.model.categories.television.Television;

import java.util.List;

@Repository
public interface TelevisionRepository extends JpaRepository<Television, Integer> {
    @Query("SELECT t FROM Television t JOIN FETCH t.product")
    List<Television> findAllTVsWithProducts();
}
