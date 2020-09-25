package com.epam.salad.data.entity;

import com.epam.salad.data.entity.entity.Vegetable;
import com.epam.salad.data.entity.entity.VegetableType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VegetableTest {
    private static final String EXPECTED_ENTITY_TYPE = "garlic";
    private static final int EXPECTED_CALORIES_VALUE = 143;
    private Vegetable vegetable;

    @Before
    public void createVegetable() {
        vegetable = new Vegetable(VegetableType.GARLIC);
    }

    @Test
    public void testConstructorShouldCreateCorrectEntityType() {
        String actualEntityType = vegetable.toString();
        Assert.assertEquals(EXPECTED_ENTITY_TYPE, actualEntityType.toLowerCase());
    }

    @Test
    public void testGetCaloriesShouldReturnCorrectCaloriesValue() {
        int actualCaloriesValue = vegetable.getCalories();
        Assert.assertEquals(EXPECTED_CALORIES_VALUE, actualCaloriesValue);
    }
}
