package org.turkovaleksey.webfood.repository.model;

public class DishProduct {
    private Integer id;
    private Integer dish_id;
    private Integer product_id;
    private Double procent;

    public DishProduct(Integer id, Integer dish_id, Integer product_id, Double procent) {
        this.id = id;
        this.dish_id = dish_id;
        this.product_id = product_id;
        this.procent = procent;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDish_id() {
        return dish_id;
    }

    public void setDish_id(Integer dish_id) {
        this.dish_id = dish_id;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Double getProcent() {
        return procent;
    }

    public void setProcent(Double procent) {
        this.procent = procent;
    }

    @Override
    public String toString() {
        return "DishProduct{" +
                "id=" + id +
                ", dish_id=" + dish_id +
                ", product_id=" + product_id +
                ", weight=" + procent +
                '}';
    }
}
