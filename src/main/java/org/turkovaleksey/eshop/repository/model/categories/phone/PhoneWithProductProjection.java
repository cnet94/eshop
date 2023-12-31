package org.turkovaleksey.eshop.repository.model.categories.phone;

import org.turkovaleksey.eshop.repository.model.product.ProductProjection;

public interface PhoneWithProductProjection {
    Integer getId();

    String getBrand();

    String getModel();

    ProductProjection getProduct();

}