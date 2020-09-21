package com.epam.reverse.args.data;

import com.epam.reverse.args.data.receiver.type.ConsoleDataReceiver;
import com.epam.reverse.args.data.receiver.type.ConsoleReceiver;

public class DataReceivingFactoryImpl implements DataReceiverFactory{

    @Override
    public ConsoleReceiver getDataReceiver() {
        return new ConsoleDataReceiver();
    }
}
