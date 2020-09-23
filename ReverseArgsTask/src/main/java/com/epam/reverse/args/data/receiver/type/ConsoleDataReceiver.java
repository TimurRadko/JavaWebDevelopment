package com.epam.reverse.args.data.receiver.type;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConsoleDataReceiver implements DataReceiver {
    private final List<String> receivingList = new ArrayList<>();

    @Override
    public void receivingData(String[] args) {
        Collections.addAll(receivingList, args);
    }

    @Override
    public List<String> getReceivingData() {
        return receivingList;
    }
}
