package com.epam.salad.data;

import com.epam.salad.data.entity.entity.SaladType;
import com.epam.salad.data.entity.entity.Vegetable;

import java.util.List;

public interface SaladFactory {
    List<Vegetable> createSalad(SaladType saladType);
}
