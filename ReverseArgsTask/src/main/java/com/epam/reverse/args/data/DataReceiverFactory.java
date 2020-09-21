package com.epam.reverse.args.data;

import com.epam.reverse.args.data.receiver.type.ConsoleReceiver;

public interface DataReceiverFactory {
    ConsoleReceiver getDataReceiver();
}
