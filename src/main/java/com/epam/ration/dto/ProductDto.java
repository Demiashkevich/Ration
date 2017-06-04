package com.epam.ration.dto;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class ProductDto {

    private long productId;

    @NotNull
    @NotEmpty
    private String name;

    @NotNull
    @NotEmpty
    private String description;

    @Min(0)
    @Max(300)
    private double protein;
    @Min(0)
    @Max(300)
    private double carbohydrate;

    @Min(0)
    @Max(300)
    private double fat;

    @Min(0)
    @Max(300)
    private double vitamin;

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getCarbohydrate() {
        return carbohydrate;
    }

    public void setCarbohydrate(double carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getVitamin() {
        return vitamin;
    }

    public void setVitamin(double vitamin) {
        this.vitamin = vitamin;
    }
}
