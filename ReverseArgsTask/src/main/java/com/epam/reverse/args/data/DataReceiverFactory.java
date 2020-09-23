package com.epam.reverse.args.data;

import com.epam.reverse.args.data.receiver.type.DataReceiver;

public interface DataReceiverFactory {
    DataReceiver getDataReceiver();
}
