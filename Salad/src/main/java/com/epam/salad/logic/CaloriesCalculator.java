package com.epam.salad.logic;

import com.epam.salad.data.entity.entity.Vegetable;

import java.util.List;

public class CaloriesCalculator {
    private int countCalories;

    public int calculateCalories(List<Vegetable> salad) {
        for (Vegetable vegetable : salad) {
            countCalories += vegetable.getCalories();
        }
        return countCalories;
    }
}
