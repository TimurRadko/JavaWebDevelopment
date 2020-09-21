package com.epam.two.dots.task.data;

import com.epam.two.dots.task.data.receiver.type.DataReceiver;

public interface DataReceiverFactory {
    DataReceiver createDataReceiver();
}
