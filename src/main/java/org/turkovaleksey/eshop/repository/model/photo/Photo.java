package org.turkovaleksey.eshop.repository.model.photo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.turkovaleksey.eshop.repository.model.product.Product;

import javax.persistence.*;

@Entity
@Table(name = "photos")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "photo_id")
    private Long id;
    private String filename;
    @Column(name = "file_path")
    private String filePath;
//    @ManyToOne
//    @JoinColumn(name = "product_id")
//    private Product product;
}
