package org.turkovaleksey.webfood.repository.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer id;
    @Column(name = "title")
    private String title;
    @Column(name = "prots")
    private Double prots;
    @Column(name = "fats")
    private Double fats;
    @Column(name = "carbos")
    private Double carbos;
    @Column(name = "kcal")
    private Integer kcal;
    @Column(name = "weight")
    private Integer weight;

    public Product() {
    }

    public Product(Integer id, String title, Double prots, Double fats, Double carbos, Integer kcal) {
        this.id = id;
        this.title = title;
        this.prots = prots;
        this.fats = fats;
        this.carbos = carbos;
        this.kcal = kcal;
    }

    public Product(Integer id, String title, Double prots, Double fats, Double carbos, Integer kcal, Integer weight) {
        this.id = id;
        this.title = title;
        this.prots = prots;
        this.fats = fats;
        this.carbos = carbos;
        this.kcal = kcal;
        this.weight = weight;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public Double getProts() {
        return prots;
    }

    public void setProts(Double prots) {
        this.prots = prots;
    }

    public Double getFats() {
        return fats;
    }

    public void setFats(Double fats) {
        this.fats = fats;
    }

    public Double getCarbos() {
        return carbos;
    }

    public void setCarbos(Double carbos) {
        this.carbos = carbos;
    }

    public Integer getKcal() {
        return kcal;
    }

    public void setKcal(Integer kcal) {
        this.kcal = kcal;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + title + '\'' +
                ", prots=" + prots +
                ", fats=" + fats +
                ", carbos=" + carbos +
                ", kcal=" + kcal +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id.equals(product.id) && title.equals(product.title) && prots.equals(product.prots) && fats.equals(product.fats) && carbos.equals(product.carbos) && kcal.equals(product.kcal) && weight.equals(product.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, prots, fats, carbos, kcal, weight);
    }
}
