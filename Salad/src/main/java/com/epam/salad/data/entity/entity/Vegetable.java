package com.epam.salad.data.entity.entity;

public class Vegetable {
    private final VegetableType vegetableType;

    public Vegetable(VegetableType vegetableType) {
        this.vegetableType = vegetableType;
    }

    public int getCalories() {
        return vegetableType.getCalorific();
    }

    @Override
    public String toString() {
        return vegetableType.toString();
    }
}
