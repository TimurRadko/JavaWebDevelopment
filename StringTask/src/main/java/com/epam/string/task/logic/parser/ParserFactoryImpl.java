package com.epam.string.task.logic.parser;

import com.epam.string.task.logic.parser.type.*;

public class ParserFactoryImpl implements ParserFactory {

    public StringParser create(ParserType parserType) {
        switch(parserType) {
            case CHAR_METHODS:
                return new CharMethodsParser();
            case STRING_METHODS:
                return new StringMethodsParser();
            case REGEX:
                return new RegexParser();
            default:
                throw new IllegalArgumentException("Type of the parser not found");
        }
    }
}
