package com.example.project;

public class RecyclerItem {
    private String name;
    private String color;
    private String weight;

    public RecyclerItem(String name, String color, String weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getWeight() {
        return weight;
    }
}
