package org.turkovaleksey.webfood.repository.model;

public class ProductInfo {
    private Integer id;
    private Integer weight;
    private Unit unit;
    private Double cleanWeight;
    private Double pricePerUnit;
    private Double pricePerKg;

    enum Unit {
//        ÿ“, ÃÀ, √–
    }

}
