package com.epam.reverse.args.logic;

import java.util.Collections;
import java.util.List;

public class Calculator {
    public List<String> reverseData(List<String> receivingData) {
        Collections.reverse(receivingData);
        return receivingData;
    }
}
