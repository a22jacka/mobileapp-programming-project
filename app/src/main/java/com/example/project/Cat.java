package com.example.project;

import com.google.gson.annotations.SerializedName;

public class Cat {
    private String name;
    @SerializedName("Size")
    private String weight;
    @SerializedName("Category")
    private String Color;

    public Cat(String name, String weight, String color) {
        this.name = name;
        this.weight = weight;
        Color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
}