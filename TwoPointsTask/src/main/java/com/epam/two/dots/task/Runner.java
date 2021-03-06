package com.epam.two.dots.task;

import com.epam.two.dots.task.data.DataReceiverFactory;
import com.epam.two.dots.task.data.DataReceiverFactoryImpl;
import com.epam.two.dots.task.data.receiver.type.DataReceiver;
import com.epam.two.dots.task.data.entity.Point;
import com.epam.two.dots.task.data.entity.PointFactory;
import com.epam.two.dots.task.logic.Calculator;
import com.epam.two.dots.task.view.PrinterFactory;
import com.epam.two.dots.task.view.PrinterFactoryImpl;
import com.epam.two.dots.task.view.type.Printer;

public class Runner {
    public static void main(String[] args) {
        DataReceiverFactory dataReceiverFactory = new DataReceiverFactoryImpl();
        DataReceiver dataReceiver = dataReceiverFactory.create();

        PointFactory pointFactory = dataReceiver.getPointFactory();

        Point firstPoint = pointFactory.create();
        dataReceiver.receivePoint(firstPoint);

        Point secondPoint = pointFactory.create();
        dataReceiver.receivePoint(secondPoint);

        Calculator calculator = new Calculator();
        Point closerPoint = calculator.findCloserToOrigin(dataReceiver.getPoints());

        PrinterFactory printerFactory = new PrinterFactoryImpl();
        Printer printer = printerFactory.create();
        printer.printAnswer(closerPoint);
    }
}
