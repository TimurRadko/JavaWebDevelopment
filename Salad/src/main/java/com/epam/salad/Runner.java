package com.epam.salad;

import com.epam.salad.data.SaladFactory;
import com.epam.salad.data.SaladFactoryImpl;
import com.epam.salad.data.entity.entity.SaladType;
import com.epam.salad.data.entity.entity.Vegetable;
import com.epam.salad.logic.CaloriesCalculator;
import com.epam.salad.view.SaladPrinterFactory;
import com.epam.salad.view.SaladPrinterFactoryImpl;
import com.epam.salad.view.printer.type.SaladPrinter;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        SaladFactory saladFactory = new SaladFactoryImpl();
        List<Vegetable> simplySalad = saladFactory.createSalad(SaladType.SIMPLY);

        CaloriesCalculator calculator = new CaloriesCalculator();
        int countCalories = calculator.calculateCalories(simplySalad);

        SaladPrinterFactory saladPrinterFactory = new SaladPrinterFactoryImpl();
        SaladPrinter saladPrinter = saladPrinterFactory.create();
        saladPrinter.printSaladCalorific(countCalories);

        List<Vegetable> fantasySalad = saladFactory.createSalad(SaladType.FANTASY_SALAD);
        countCalories = calculator.calculateCalories(fantasySalad);
        saladPrinter.printSaladCalorific(countCalories);

        List<Vegetable> heavySalad = saladFactory.createSalad(SaladType.HEAVY_SALAD);
        countCalories = calculator.calculateCalories(heavySalad);
        saladPrinter.printSaladCalorific(countCalories);
    }
}
