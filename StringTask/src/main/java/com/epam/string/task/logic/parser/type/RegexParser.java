package com.epam.string.task.logic.parser.type;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexParser implements StringParser {
    private static final String REGEX_RULE = "[^\\W\\d]*";
    private static final String SEPARATOR = "\\s{2,}";
    private static final String WHITESPACE = " ";

    public String changeStringByRule(String data) {
        Pattern p = Pattern.compile(REGEX_RULE);
        Matcher m = p.matcher(data);
        StringBuilder builder = new StringBuilder();
        while (m.find()) {
            builder.append(m.group()).append(WHITESPACE);
        }
        String result = builder.toString();
        String resultWithoutWasteWhitespaces = result.replaceAll(SEPARATOR, WHITESPACE);
        return resultWithoutWasteWhitespaces.trim();
    }
}
