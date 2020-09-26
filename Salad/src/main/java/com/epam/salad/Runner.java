package com.epam.salad;

import com.epam.salad.data.SaladFactory;
import com.epam.salad.data.SaladFactoryImpl;
import com.epam.salad.data.entity.entity.Salad;
import com.epam.salad.data.entity.entity.SaladType;
import com.epam.salad.logic.CaloriesCalculator;
import com.epam.salad.view.SaladPrinterFactory;
import com.epam.salad.view.SaladPrinterFactoryImpl;
import com.epam.salad.view.printer.type.SaladPrinter;


public class Runner {
    public static void main(String[] args) {
        SaladFactory saladFactory = new SaladFactoryImpl();
        Salad simplySalad = saladFactory.createSalad(SaladType.SIMPLY);

        CaloriesCalculator calculator = new CaloriesCalculator();
        int countCalories = calculator.calculateCalories(simplySalad.getSalad());

        SaladPrinterFactory saladPrinterFactory = new SaladPrinterFactoryImpl();
        SaladPrinter saladPrinter = saladPrinterFactory.create();
        saladPrinter.printSaladCalorific(countCalories);

        Salad fantasySalad = saladFactory.createSalad(SaladType.FANTASY_SALAD);
        countCalories = calculator.calculateCalories(fantasySalad.getSalad());
        saladPrinter.printSaladCalorific(countCalories);

        Salad heavySalad = saladFactory.createSalad(SaladType.HEAVY_SALAD);
        countCalories = calculator.calculateCalories(heavySalad.getSalad());
        saladPrinter.printSaladCalorific(countCalories);
    }
}
