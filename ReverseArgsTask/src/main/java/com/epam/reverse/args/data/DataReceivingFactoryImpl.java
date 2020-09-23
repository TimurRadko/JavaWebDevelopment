package com.epam.reverse.args.data;

import com.epam.reverse.args.data.receiver.type.ConsoleDataReceiver;
import com.epam.reverse.args.data.receiver.type.DataReceiver;

public class DataReceivingFactoryImpl implements DataReceiverFactory{

    @Override
    public DataReceiver getDataReceiver() {
        return new ConsoleDataReceiver();
    }
}
