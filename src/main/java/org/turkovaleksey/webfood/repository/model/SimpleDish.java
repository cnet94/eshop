package org.turkovaleksey.webfood.repository.model;

public class SimpleDish {
    private Integer id;
    private String dishName;
    private Double loss;
    private String description;

    public SimpleDish(Integer id, String dishName, Double loss, String description) {
        this.id = id;
        this.dishName = dishName;
        this.loss = loss;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public Double getLoss() {
        return loss;
    }

    public void setLoss(Double loss) {
        this.loss = loss;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "SimpleDish{" +
                "id=" + id +
                ", dishName='" + dishName + '\'' +
                ", loss=" + loss +
                ", description='" + description + '\'' +
                '}';
    }
}
