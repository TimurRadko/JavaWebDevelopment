package com.epam.two.dots.task;

import com.epam.two.dots.task.data.DataReceiverFactory;
import com.epam.two.dots.task.data.DataReceiverFactoryImpl;
import com.epam.two.dots.task.data.receiver.type.DataReceiver;
import com.epam.two.dots.task.data.entity.Point;
import com.epam.two.dots.task.data.entity.PointFactory;
import com.epam.two.dots.task.logic.Calculator;
import com.epam.two.dots.task.view.PrinterFactory;
import com.epam.two.dots.task.view.PrinterFactoryImpl;
import com.epam.two.dots.task.view.type.ConsolePrinter;

public class TwoPointsCalculation {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        DataReceiverFactory dataReceiverFactory = new DataReceiverFactoryImpl();
        DataReceiver dataReceiver = dataReceiverFactory.createDataReceiver();

        PrinterFactory printerFactory = new PrinterFactoryImpl();
        ConsolePrinter consolePrinter = printerFactory.createConsolePrinter();

        PointFactory pointFactory = dataReceiver.getPointFactory();

        Point firstPoint = pointFactory.createPoint();
        dataReceiver.receivingPoint(firstPoint);
        Point secondPoint = pointFactory.createPoint();
        dataReceiver.receivingPoint(secondPoint);

        Point closerPoint = calculator.findingCloserToOriginPoint(dataReceiver.getPoints());
        consolePrinter.printAnswer(closerPoint);
    }
}
