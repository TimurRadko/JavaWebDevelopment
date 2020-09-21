package com.epam.reverse.args.data.receiver.type;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConsoleDataReceiver implements ConsoleReceiver {
    private final List<String> receivingList = new ArrayList<>();

    public void receivingConsoleData(String[] args) {
        Collections.addAll(receivingList, args);
    }

    @Override
    public List<String> getReceivingList() {
        return receivingList;
    }
}
