package com.epam.reverse.args.data.receiver.type;

import java.util.List;

public interface ConsoleReceiver {
    void receivingConsoleData(String[] args);
    List<String> getReceivingList();
}
