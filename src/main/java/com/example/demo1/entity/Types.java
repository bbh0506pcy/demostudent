package com.example.demo1.entity;
import java.io.Serializable;
public class Types implements Serializable {
    private Integer id;
    private String type;

    public Types() {
        // Default constructor
    }

    public Types(Integer id, String type) {
        this.id = id;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Types{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
