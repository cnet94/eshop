package org.turkovaleksey.eshop.repository.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.turkovaleksey.eshop.repository.model.shop.Shop;

@Repository
public interface ShopRepository extends JpaRepository<Shop, Integer> {
}
