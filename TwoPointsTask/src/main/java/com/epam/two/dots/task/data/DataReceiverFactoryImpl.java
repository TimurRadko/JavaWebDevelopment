package com.epam.two.dots.task.data;

import com.epam.two.dots.task.data.receiver.type.DataReceiver;
import com.epam.two.dots.task.data.receiver.type.DataReceiverEntity;

public class DataReceiverFactoryImpl implements DataReceiverFactory {

    @Override
    public DataReceiver create() {
        return new DataReceiverEntity();
    }
}