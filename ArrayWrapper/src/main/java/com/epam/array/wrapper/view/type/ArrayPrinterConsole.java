package com.epam.array.wrapper.view.type;

import com.epam.array.wrapper.model.entity.Wrapper;

public class ArrayPrinterConsole implements ArrayPrinter {

    public void print(Wrapper wrapper) {
        System.out.println(wrapper);
    }
}
