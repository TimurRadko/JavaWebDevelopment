package com.epam.string.task.logic.parser;

import com.epam.string.task.logic.parser.type.ParserType;
import com.epam.string.task.logic.parser.type.RegexParser;
import com.epam.string.task.logic.parser.type.StringMethodsParser;
import com.epam.string.task.logic.parser.type.StringParser;

public class ParserFactoryImpl implements ParserFactory {

    public StringParser create(ParserType parserType) {
        switch(parserType) {
            case STRING_METHODS:
                return new StringMethodsParser();
            case REGEX:
                return new RegexParser();
            default:
                throw new IllegalArgumentException("Type of the parser not found");
        }
    }
}
