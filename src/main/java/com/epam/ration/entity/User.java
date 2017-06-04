package com.epam.ration.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@javax.persistence.Entity
@Table(name = ("user"))
public class User extends Entity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = ("user_id"), unique = true, nullable = false)
    private long userId;

    @Column(name = ("first_name"), nullable = false)
    private String firstName;

    @Column(name = ("last_name"), nullable = false)
    private String lastName;

    @Column(name = ("password"), nullable = false)
    private String password;

    @Column(name = ("email"), unique = true, nullable = false)
    private String email;

    @Column(name = ("height"), nullable = false)
    private double height;

    @Column(name = ("weight"), nullable = false)
    private short weight;

    @Column(name = ("age"), nullable = false)
    private short age;

    @Column(name = ("role"), nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Role role;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = ("ration"))
    private Set<RationComment> rationComments = new HashSet<RationComment>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = ("recipe"))
    private Set<RecipeComment> recipeComments = new HashSet<RecipeComment>();

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public short getWeight() {
        return weight;
    }

    public void setWeight(short weight) {
        this.weight = weight;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public Set<RationComment> getRationComments() {
        return rationComments;
    }

    public void setRationComments(Set<RationComment> rationComments) {
        this.rationComments = rationComments;
    }

    public Set<RecipeComment> getRecipeComments() {
        return recipeComments;
    }

    public void setRecipeComments(Set<RecipeComment> recipeComments) {
        this.recipeComments = recipeComments;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

}
