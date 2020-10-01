package com.epam.string.task.logic.parser;

import com.epam.string.task.logic.parser.type.ParserType;

public interface ParserFactory {
    StringParser create(ParserType parserType);
}
