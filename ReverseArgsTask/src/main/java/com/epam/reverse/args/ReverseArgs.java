package com.epam.reverse.args;


import com.epam.reverse.args.data.DataReceiverFactory;
import com.epam.reverse.args.data.DataReceivingFactoryImpl;
import com.epam.reverse.args.data.receiver.type.DataReceiver;
import com.epam.reverse.args.logic.Calculator;
import com.epam.reverse.args.view.PrinterFactory;
import com.epam.reverse.args.view.PrinterFactoryImpl;
import com.epam.reverse.args.view.type.Printer;

import java.util.List;

public class ReverseArgs {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        DataReceiverFactory dataReceiverFactory = new DataReceivingFactoryImpl();
        DataReceiver dataReceiver = dataReceiverFactory.getDataReceiver();

        dataReceiver.receivingData(args);
        List<String> receivingList = dataReceiver.getReceivingData();
        List<String> answer = calculator.reverseArgs(receivingList);

        PrinterFactory printerFactory = new PrinterFactoryImpl();
        Printer printer = printerFactory.getPrinter();
        printer.printAnswer(answer);
    }
}
