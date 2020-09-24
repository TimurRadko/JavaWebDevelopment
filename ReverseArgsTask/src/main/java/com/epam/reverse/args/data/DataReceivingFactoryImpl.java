package com.epam.reverse.args.data;

import com.epam.reverse.args.data.entity.DataReceiverConsole;
import com.epam.reverse.args.data.entity.DataReceiver;

public class DataReceivingFactoryImpl implements DataReceiverFactory{

    @Override
    public DataReceiver create() {
        return new DataReceiverConsole();
    }
}
