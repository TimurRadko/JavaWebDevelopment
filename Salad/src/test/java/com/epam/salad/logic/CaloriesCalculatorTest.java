package com.epam.salad.logic;

import com.epam.salad.data.entity.entity.Vegetable;
import com.epam.salad.data.entity.entity.VegetableType;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CaloriesCalculatorTest {
    private static final int EXPECTED_ANSWER = 75;

    @Test
    public void testCalculateCaloriesShouldReturnCorrectAnswer() {
        List<Vegetable> simplySalad = Arrays.asList(
                new Vegetable(VegetableType.CUCUMBER),
                new Vegetable(VegetableType.TOMATO),
                new Vegetable(VegetableType.ONION));
        CaloriesCalculator calculator = new CaloriesCalculator();
        int actualAnswer = calculator.calculateCalories(simplySalad);
        Assert.assertEquals(EXPECTED_ANSWER, actualAnswer);
    }
}
