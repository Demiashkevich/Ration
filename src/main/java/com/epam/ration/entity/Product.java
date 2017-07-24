package com.epam.ration.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@javax.persistence.Entity
@Table(name = ("product"))
public class Product extends Entity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = ("product_id"), unique = true, nullable = false)
    private long productId;

    @Column(name = ("name"), nullable = false)
    private String name;

    @Column(name = ("description"), nullable = false)
    private String description;

    @Column(name = ("protein"), nullable = false)
    private double protein;

    @Column(name = ("carbohydrate"), nullable = false)
    private double carbohydrate;

    @Column(name = ("fat"), nullable = false)
    private double fat;

    @Column(name = ("vitamin"), nullable = false)
    private double vitamin;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
            name = ("product_recipe"),
            joinColumns = {@JoinColumn(name = ("product_id"), nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = ("recipe_id"), nullable = false, updatable = false)}
    )
    private Set<Recipe> recipes = new HashSet<Recipe>();

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

    public Set<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(Set<Recipe> recipes) {
        this.recipes = recipes;
    }

}