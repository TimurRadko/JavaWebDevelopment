package com.epam.string.task.logic.parser.type;

public class StringMethodsParser implements StringParser {
    private static final String RECEIVED_SEPARATOR = "\\s{2,}";
    private static final String WHITESPACE = " ";
    private static final int MIN_VALUE_OF_LOWERCASE_LATER = 65;
    private static final int MAX_VALUE_OF_LOWERCASE_LATER = 90;
    private static final int MIN_VALUE_OF_UPPERCASE_LATER = 97;
    private static final int MAX_VALUE_OF_UPPERCASE_LATER = 122;

    public String changeStringByRule(String data) {
        return removeNonAlphabeticCharacters(data);
    }

    private String removeNonAlphabeticCharacters(String data) {
        char[] charArray = data.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (char character : charArray) {
            if (isLetter(character)) {
                builder.append(character);
            } else {
                builder.append(WHITESPACE);
            }
        }
        String result = builder.toString();
        String resultWithoutWasteWhitespaces = result.replaceAll(RECEIVED_SEPARATOR, WHITESPACE);
        return resultWithoutWasteWhitespaces.trim();
    }

    private boolean isLetter(char character) {
        return ((character >= MIN_VALUE_OF_LOWERCASE_LATER &&
                character <= MAX_VALUE_OF_LOWERCASE_LATER) ||
                (character >= MIN_VALUE_OF_UPPERCASE_LATER &&
                        character <= MAX_VALUE_OF_UPPERCASE_LATER));
    }
}
