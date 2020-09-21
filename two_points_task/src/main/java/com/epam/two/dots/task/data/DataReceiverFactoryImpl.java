package com.epam.two.dots.task.data;

import com.epam.two.dots.task.data.receiver.type.DataReceiver;
import com.epam.two.dots.task.data.receiver.type.EntityDataReceiver;

public class DataReceiverFactoryImpl implements DataReceiverFactory {

    @Override
    public DataReceiver createDataReceiver() {
        return new EntityDataReceiver();
    }
}