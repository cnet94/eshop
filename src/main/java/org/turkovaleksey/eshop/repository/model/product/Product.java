package org.turkovaleksey.eshop.repository.model.product;

import lombok.*;
import org.turkovaleksey.eshop.repository.model.photo.Photo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer id;
    @Column(name = "shop_id")
    private Integer shopId;
    @Column(name = "category")
    private String category;
    @Column(name = "title")
    private String title;
    @Column(name = "url_img")
    private String urlImg;
    @Column(name = "price")
    private Double price;
    @Column(name = "description")
    private String description;
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Photo> photos = new ArrayList<>();
}
