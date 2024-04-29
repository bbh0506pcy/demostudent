package com.example.demo1.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Films  implements Serializable {

    private Integer id;
    private String name;
    private String director;
    private String actor;
    private String type;
    private String country;
    private String language;
    private Double score;
    private String photo;
    private String href;
    private String description;


    public Films(Integer id, String name, String director, String actor, String type, String country, String language, Double score, String photo, String href, String description) {
        this.id = id;
        this.name = name;
        this.director = director;
        this.actor = actor;
        this.type = type;
        this.country = country;
        this.language = language;
        this.score = score;
        this.photo = photo;
        this.href = href;
        this.description = description;
    }

    public Films() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Films{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", actor='" + actor + '\'' +
                ", type='" + type + '\'' +
                ", country='" + country + '\'' +
                ", language='" + language + '\'' +
                ", score=" + score +
                ", photo='" + photo + '\'' +
                ", href='" + href + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
