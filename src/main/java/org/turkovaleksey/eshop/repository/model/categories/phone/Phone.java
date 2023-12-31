package org.turkovaleksey.eshop.repository.model.categories.phone;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.turkovaleksey.eshop.repository.model.product.Product;

import javax.persistence.*;

@Entity
@Table(name = "cat_phones")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cat_phone_id")
    private Integer id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id")
    private Product product;
    @Column(name = "brand")
    private String brand;
    @Column(name = "model")
    private String model;
    @Column(name = "system")
    private String system;
    @Column(name = "ram")
    private Integer ram;
    @Column(name = "memory")
    private Integer memory;
    @Column(name = "display_size")
    private Integer displaySize;
}
