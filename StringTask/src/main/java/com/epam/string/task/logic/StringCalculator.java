package com.epam.string.task.logic;

import com.epam.string.task.logic.parser.type.StringParser;

public class StringCalculator {
    private final StringParser parser;

    public StringCalculator(StringParser parser) {
        this.parser = parser;
    }

    public String changeReceivingString(String data) {
        return parser.changeStringByRule(data);
    }
}
