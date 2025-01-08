package com.blog.blog.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Article")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titre", length = 255, nullable = false)
    private String title;

    @Column(name = "date_creation", nullable = false)
    private LocalDateTime create_date;

    @Column(name = "contenue", nullable = true)
    private StringBuilder cotent;

    /* getters */
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public StringBuilder getCotent() {
        return cotent;
    }

    public LocalDateTime getCreate_date() {
        return create_date;
    }

    /* Setters */
    public void setTitle(String title) {
        this.title = title;
    }

    public void setCotent(StringBuilder cotent) {
        this.cotent = cotent;
    }
}
