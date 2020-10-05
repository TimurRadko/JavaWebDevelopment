package com.epam.string.task.data.factory;

import com.epam.string.task.data.ConsoleDataAcquirer;
import com.epam.string.task.data.DataAcquirer;

public class ConsoleDataAcquirerFactory implements DataAcquirerFactory {

    @Override
    public DataAcquirer create() {
        return new ConsoleDataAcquirer();
    }
}
