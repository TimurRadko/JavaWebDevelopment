package com.epam.reverse.args;


import com.epam.reverse.args.data.DataReceiverFactory;
import com.epam.reverse.args.data.DataReceivingFactoryImpl;
import com.epam.reverse.args.data.entity.DataReceiver;
import com.epam.reverse.args.logic.Calculator;
import com.epam.reverse.args.view.PrinterFactory;
import com.epam.reverse.args.view.PrinterFactoryImpl;
import com.epam.reverse.args.view.entity.Printer;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        DataReceiverFactory dataReceiverFactory = new DataReceivingFactoryImpl();
        DataReceiver dataReceiver = dataReceiverFactory.create();
        dataReceiver.receiveData(args);
        
        List<String> receivingList = dataReceiver.getReceiveData();
        List<String> reversingList = calculator.reverseData(receivingList);

        PrinterFactory printerFactory = new PrinterFactoryImpl();
        Printer printer = printerFactory.create();
        printer.printAnswer(reversingList);
    }
}
