package com.epam.salad.view.printer.type;

public class SaladPrinterConsole implements SaladPrinter {

    public void printSaladCalorific(int countCalories) {
        System.out.printf("Chosen salad have %d calories", countCalories);
        System.out.println();
    }
}
