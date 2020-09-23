package com.epam.reverse.args.data.receiver.type;

import java.util.List;

public interface DataReceiver {
    void receivingData(String[] args);
    List<String> getReceivingData();
}
