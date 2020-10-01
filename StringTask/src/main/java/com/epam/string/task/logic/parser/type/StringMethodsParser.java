package com.epam.string.task.logic.parser.type;

import com.epam.string.task.logic.parser.StringParser;

public class StringMethodsParser implements StringParser {
    private static final String DELIMITER = "\\s{2,}";

    public String changeStringByRule(String data) {
        return removeNonAlphabeticCharacters(data);
    }

    private String removeNonAlphabeticCharacters(String data) {
        char[] charArray = data.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (char character : charArray) {
            if ((character >= 65 && character <= 90) || (character >= 97 && character <= 122)) {
                builder.append(character);
            } else {
                builder.append(" ");
            }
        }
        String result = builder.toString();
        return result.replaceAll(DELIMITER, " ");
    }
}
