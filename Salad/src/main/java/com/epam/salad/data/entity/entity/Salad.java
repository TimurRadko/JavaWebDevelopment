package com.epam.salad.data.entity.entity;

import java.util.List;

public class Salad {
    private final List<Vegetable> salad;

    public Salad(List<Vegetable> salad) {
        this.salad = salad;
    }

    public List<Vegetable> getSalad() {
        return salad;
    }
}
