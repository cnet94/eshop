package org.turkovaleksey.eshop.repository.model.shop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.turkovaleksey.eshop.repository.model.company.Company;

import javax.persistence.*;

@Entity
@Table(name = "shops")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shop_id")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;
    private String name;
    private String address;
}
