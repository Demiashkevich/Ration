package com.epam.ration.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@javax.persistence.Entity
@Table(name = ("recipe"))
public class Recipe extends Entity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = ("recipe_id"), unique = true, nullable = false)
    private long recipeId;

    @Column(name = ("name"), nullable = true)
    private String name;

    @Column(name = ("description"), nullable = true)
    private String description;

    @Column(name = ("rating"))
    private double rating;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = ("recipe_ration"),
            joinColumns = {@JoinColumn(name = ("recipe_id"), nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = ("ration_id"), nullable = false, updatable = false)}
    )
    private Set<Ration> rations = new HashSet<Ration>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = ("recipe"))
    private Set<RecipeComment> recipeComments = new HashSet<RecipeComment>();

    public long getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(long recipeId) {
        this.recipeId = recipeId;
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

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Set<Ration> getRations() {
        return rations;
    }

    public void setRations(Set<Ration> rations) {
        this.rations = rations;
    }

    public Set<RecipeComment> getRecipeComments() {
        return recipeComments;
    }

    public void setRecipeComments(Set<RecipeComment> recipeComments) {
        this.recipeComments = recipeComments;
    }
}
