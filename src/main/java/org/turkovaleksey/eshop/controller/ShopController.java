package org.turkovaleksey.eshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.turkovaleksey.eshop.repository.api.ShopRepository;
import org.turkovaleksey.eshop.repository.model.shop.Shop;

import java.util.List;

@RestController
@RequestMapping("/api/shop")
public class ShopController {

    private ShopRepository shopRepository;

    @Autowired
    public void setShopRepository(ShopRepository shopRepository) {
        this.shopRepository = shopRepository;
    }

    @GetMapping("/")
    public List<Shop> getShops(){
        return shopRepository.findAll();
    }
}
