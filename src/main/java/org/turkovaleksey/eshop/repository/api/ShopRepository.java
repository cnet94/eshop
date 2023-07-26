package org.turkovaleksey.eshop.repository.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.turkovaleksey.eshop.repository.model.shop.Shop;

public interface ShopRepository extends JpaRepository<Shop, Integer> {
}
