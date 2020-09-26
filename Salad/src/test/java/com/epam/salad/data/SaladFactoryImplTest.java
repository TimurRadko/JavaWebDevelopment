package com.epam.salad.data;

import com.epam.salad.data.entity.entity.Salad;
import com.epam.salad.data.entity.entity.SaladType;
import org.junit.Assert;
import org.junit.Test;

public class SaladFactoryImplTest {

    @Test
    public void testCreateSaladShouldReturnList() {
        SaladFactory saladFactory = new SaladFactoryImpl();
        Salad actualVegetableList = saladFactory.createSalad(SaladType.SIMPLY);
        Assert.assertNotNull(actualVegetableList);
    }
}
