package com.epam.salad.view.printer.type;

import com.epam.salad.data.entity.entity.Vegetable;
import com.epam.salad.data.entity.entity.VegetableType;
import com.epam.salad.logic.CaloriesCalculator;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

public class SaladPrinterConsoleTest {
    private static final String EXPECTED_ANSWER = "Chosen salad have 75 calories";

    @Test
    public void testPrintSaladCalorificShouldPrintCorrectAnswer() {
        CaloriesCalculator calculator = new CaloriesCalculator();
        List<Vegetable> simplySalad = Arrays.asList(
                new Vegetable(VegetableType.CUCUMBER),
                new Vegetable(VegetableType.TOMATO),
                new Vegetable(VegetableType.ONION));
        int actualAnswer = calculator.calculateCalories(simplySalad);
        String actualAnswerString = getTestingConsoleOutput(actualAnswer);
        Assert.assertEquals(EXPECTED_ANSWER, actualAnswerString);
    }

    private String getTestingConsoleOutput(int expectedAnswer) {
        SaladPrinter printer = new SaladPrinterConsole();
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        printer.printSaladCalorific(expectedAnswer);
        System.setOut(consoleStream);
        String resultString = outputStream.toString();
        return resultString.trim();
    }
}
