package com.epam.string.task.logic.parser;

import com.epam.string.task.logic.parser.type.ParserType;
import com.epam.string.task.logic.parser.type.StringParser;

public interface ParserFactory {
    StringParser create(ParserType parserType);
}
