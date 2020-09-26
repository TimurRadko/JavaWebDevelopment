package com.epam.salad.data;

import com.epam.salad.data.entity.entity.Salad;
import com.epam.salad.data.entity.entity.SaladType;

public interface SaladFactory {
    Salad createSalad(SaladType saladType);
}
