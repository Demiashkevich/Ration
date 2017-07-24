package com.epam.ration.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@javax.persistence.Entity
@Table(name = ("ration"))
public class Ration extends Entity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = ("ration_id"), unique = true, nullable = false)
    private long rationId;

    @Column(name = ("description"), nullable = false)
    private String description;

    @Column(name = ("rating"))
    private double rating;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = ("rations"))
    private Set<Recipe> recipes = new HashSet<Recipe>();

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = ("ration"))
    private Set<RationComment> rationComments = new HashSet<RationComment>();

    public long getRationId() {
        return rationId;
    }

    public void setRationId(long rationId) {
        this.rationId = rationId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Set<RationComment> getRationComments() {
        return rationComments;
    }

    public Set<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(Set<Recipe> recipes) {
        this.recipes = recipes;
    }

    public void setRationComments(Set<RationComment> rationComments) {
        this.rationComments = rationComments;
    }

}