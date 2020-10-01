package com.epam.string.task.logic.parser.type;

import com.epam.string.task.logic.parser.StringParser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexParser implements StringParser {
    private static final String REGEX_RULE = "[^\\W\\d]*";
    private static final String DELIMITER = "\\s{2,}";

    public String changeStringByRule(String data) {
        Pattern p = Pattern.compile(REGEX_RULE);
        Matcher m = p.matcher(data);
        StringBuilder builder = new StringBuilder();
        while (m.find()) {
            builder.append(m.group()).append(" ");
        }
        String result = builder.toString();
        return result.replaceAll(DELIMITER, " ");
    }
}
