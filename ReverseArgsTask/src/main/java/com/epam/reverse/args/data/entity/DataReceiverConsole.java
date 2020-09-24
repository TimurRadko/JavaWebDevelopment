package com.epam.reverse.args.data.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataReceiverConsole implements DataReceiver {
    private final List<String> receivingList = new ArrayList<>();

    @Override
    public void receiveData(String[] args) {
        Collections.addAll(receivingList, args);
    }

    @Override
    public List<String> getReceiveData() {
        return receivingList;
    }
}
