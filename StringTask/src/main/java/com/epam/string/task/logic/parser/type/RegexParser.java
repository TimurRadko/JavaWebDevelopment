package com.epam.string.task.logic.parser.type;

public class RegexParser implements StringParser {
    private static final String REGEX_RULE = "[\\d\\W]+";
    private static final String WHITESPACE = " ";

    public String changeStringByRule(String data) {
        String replacingAllWasteCharacter = data.replaceAll(REGEX_RULE, WHITESPACE);
        return replacingAllWasteCharacter.trim();
    }
}
