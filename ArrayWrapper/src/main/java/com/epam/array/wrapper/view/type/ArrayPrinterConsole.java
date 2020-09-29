package com.epam.array.wrapper.view.type;

import com.epam.array.wrapper.data.entity.ArrayWrapper;

public class ArrayPrinterConsole implements ArrayPrinter {

    public void print(ArrayWrapper arrayWrapper) {
        System.out.println(arrayWrapper);
    }
}
