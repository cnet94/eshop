package org.turkovaleksey.eshop.repository.model.categories;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.turkovaleksey.eshop.repository.model.Product;

import javax.persistence.*;

@Entity
@Table(name = "cat_tvs")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Television {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cat_tv_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private Double diagonal;

    @Column(name = "smart_tv")
    private Boolean smartTV;

}
