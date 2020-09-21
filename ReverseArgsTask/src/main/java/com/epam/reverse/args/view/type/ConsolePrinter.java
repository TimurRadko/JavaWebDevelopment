package com.epam.reverse.args.view.type;

import java.util.List;

public class ConsolePrinter implements Printer {

    @Override
    public void printAnswer(List<String> receivingList) {
        if (receivingList.size() > 0) {
            System.out.println(receivingList);
        } else {
            System.out.println("Console args is empty");
        }
    }
}
