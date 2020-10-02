package com.epam.string.task.logic.parser;

import com.epam.string.task.logic.parser.type.ParserType;
import com.epam.string.task.logic.parser.type.StringMethodsParser;
import com.epam.string.task.logic.parser.type.StringParser;
import org.junit.Assert;
import org.junit.Test;

public class ParserFactoryImplTest {
    private static final StringParser EXPECTED_PARSER = new StringMethodsParser();

    @Test
    public void testCreateShouldCreateEntity() {
        ParserFactory parserFactory = new ParserFactoryImpl();
        StringParser parser = parserFactory.create(ParserType.STRING_METHODS);
        Assert.assertNotNull(parser);
    }

    @Test
    public void testCreateShouldCreateCorrectTypeEntity() {
        ParserFactory parserFactory = new ParserFactoryImpl();
        StringParser parser = parserFactory.create(ParserType.STRING_METHODS);
        Assert.assertEquals(EXPECTED_PARSER.getClass(), parser.getClass());
    }
}
