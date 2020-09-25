package com.epam.salad.data.entity.entity;

public enum VegetableType {
    BLACK_OLIVE("Black Olive", 175),
    CUCUMBER ("Cucumber", 15),
    GARLIC ("Garlic", 143),
    ONION ("Onion", 40),
    TOMATO ("Tomato", 20);

    private final String name;
    private final int calorific;

    VegetableType(String name, int calorific) {
        this.name = name;
        this.calorific = calorific;
    }

    public String getName() {
        return name;
    }

    public int getCalorific() {
        return calorific;
    }
}
