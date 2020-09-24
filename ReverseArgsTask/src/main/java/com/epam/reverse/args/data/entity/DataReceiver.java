package com.epam.reverse.args.data.entity;

import java.util.List;

public interface DataReceiver {
    void receiveData(String[] args);
    List<String> getReceiveData();
}
