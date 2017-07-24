package com.epam.ration.entity;

import javax.persistence.*;
import java.io.Serializable;

@javax.persistence.Entity
@Table(name = ("recipe_comment"))
public class RecipeComment extends Entity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = ("recipe_comment_id"), unique = true, nullable = false)
    private long recipeCommentId;

    @Column(name = ("name"), nullable = false)
    private String name;

    @Column(name = ("description"), nullable = false)
    private String description;

    @Column(name = ("mark"), nullable = false)
    private double mark;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = ("recipe_id"), nullable = false)
    private Recipe recipe;

    public long getRecipeCommentId() {
        return recipeCommentId;
    }

    public void setRecipeCommentId(long recipeCommentId) {
        this.recipeCommentId = recipeCommentId;
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

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}