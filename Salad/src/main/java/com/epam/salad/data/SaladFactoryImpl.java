package com.epam.salad.data;

import com.epam.salad.data.entity.exception.NotFoundSaladException;
import com.epam.salad.data.entity.entity.*;
import com.epam.salad.data.entity.entity.Vegetable;
import com.epam.salad.data.entity.entity.VegetableType;

import java.util.Arrays;

public class SaladFactoryImpl implements SaladFactory {

    @Override
    public Salad createSalad(SaladType saladType) {
        switch (saladType) {
            case SIMPLY:
                return new Salad(Arrays.asList(
                        new Vegetable(VegetableType.CUCUMBER),
                        new Vegetable(VegetableType.TOMATO),
                        new Vegetable(VegetableType.ONION)));
            case FANTASY_SALAD:
                return new Salad(Arrays.asList(
                        new Vegetable(VegetableType.GARLIC),
                        new Vegetable(VegetableType.BLACK_OLIVE),
                        new Vegetable(VegetableType.ONION)));
            case HEAVY_SALAD:
                return new Salad(Arrays.asList(
                        new Vegetable(VegetableType.BLACK_OLIVE),
                        new Vegetable(VegetableType.TOMATO),
                        new Vegetable(VegetableType.GARLIC)));
            default:
                throw new NotFoundSaladException("Salad type not found");
        }
    }
}
