package com.epam.string.task.logic.parser.type;

import java.util.ArrayList;
import java.util.List;

public class StringMethodsParser implements StringParser {
    private static final String SEPARATOR = "\\s";
    private static final String REGEX_RULE = "[\\d\\W]+";
    private static final String WHITESPACE = " ";

    @Override
    public String changeStringByRule(String data) {
        String[] stringsArray = data.split(SEPARATOR);
        List<String> stringsList = new ArrayList<>();
        for (String value : stringsArray) {
            String removingWasteCharacters = value.replaceAll(REGEX_RULE, WHITESPACE);
            stringsList.add(removingWasteCharacters);
        }
        String resultString = stringCreate(stringsList);
        return resultString.trim();
    }

    private String stringCreate(List<String> list) {
        StringBuilder builder = new StringBuilder();
        for (String value : list) {
            builder.append(value).append(WHITESPACE);
        }
        return builder.toString();
    }
}
