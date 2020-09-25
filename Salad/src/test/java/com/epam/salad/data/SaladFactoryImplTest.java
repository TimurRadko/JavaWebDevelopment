package com.epam.salad.data;

import com.epam.salad.data.entity.entity.SaladType;
import com.epam.salad.data.entity.entity.Vegetable;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SaladFactoryImplTest {

    @Test
    public void testCreateSaladShouldReturnList() {
        SaladFactory saladFactory = new SaladFactoryImpl();
        List<Vegetable> actualVegetableList = saladFactory.createSalad(SaladType.SIMPLY);
        Assert.assertNotNull(actualVegetableList);
    }
}
