package com.epam.ration.entity;

import javax.persistence.*;
import java.io.Serializable;

@javax.persistence.Entity
@Table(name = ("ration_comment"))
public class RationComment extends Entity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = ("ration_comment_id"), unique = true, nullable = false)
    private long rationCommentId;

    @Column(name = ("name"), nullable = false)
    private String name;

    @Column(name = ("description"), nullable = false)
    private String description;

    @Column(name = ("mark"), nullable = false)
    private double mark;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = ("ration_id"), nullable = false)
    private Ration ration;

    public long getRationCommentId() {
        return rationCommentId;
    }

    public void setRationCommentId(long rationCommentId) {
        this.rationCommentId = rationCommentId;
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

    public Ration getRation() {
        return ration;
    }

    public void setRation(Ration ration) {
        this.ration = ration;
    }

}