package com.epam.two.dots.task.view.type;

import com.epam.two.dots.task.data.entity.Point;

public class ConsolePrinterImpl implements ConsolePrinter {

    @Override
    public void printAnswer(Point point) {
        System.out.printf("This %s is closer than another to origin.%n", point);
    }
}
