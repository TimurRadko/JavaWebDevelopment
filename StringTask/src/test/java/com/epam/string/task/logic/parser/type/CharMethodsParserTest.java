package com.epam.string.task.logic.parser.type;

import org.junit.Assert;
import org.junit.Test;

public class CharMethodsParserTest {
    private static final String NOT_LETTER_IN_THE_START = "12345Hello";
    private static final String NOT_LETTER_IN_THE_END = "Hello12345";
    private static final String EXPECTED_STRING_FOR_ONE_WORD_TEST = "Hello";
    private static final String EXPECTED_STRING_FOR_SEVERAL_WORD_TEST = "Hello world";
    private static final String NOT_LETTER_IN_THE_START_SEVERAL_WORD = "12345Hello world";
    private static final String NOT_LETTER_IN_THE_END_SEVERAL_WORD = "Hello world12345";
    private static final String NOT_LETTER_IN_ANY_PLACE_SEVERAL_WORD = "2121Hello world12345";

    @Test
    public void testChangeStringByRuleShouldReturnCorrectStringWhenArrivedSingleWordNotLetterInTheStart() {
        CharMethodsParser parser = new CharMethodsParser();
        String actualData = parser.changeStringByRule(NOT_LETTER_IN_THE_START);
        Assert.assertEquals(EXPECTED_STRING_FOR_ONE_WORD_TEST, actualData);
    }

    @Test
    public void testChangeStringByRuleShouldReturnCorrectStringWhenArrivedSingleWordNotLetterInTheEnd() {
        CharMethodsParser parser = new CharMethodsParser();
        String actualData = parser.changeStringByRule(NOT_LETTER_IN_THE_END);
        Assert.assertEquals(EXPECTED_STRING_FOR_ONE_WORD_TEST, actualData);
    }

    @Test
    public void testChangeStringByRuleShouldReturnCorrectStringWhenArrivedSeveralWordsNotLetterInTheStart() {
        CharMethodsParser parser = new CharMethodsParser();
        String actualData = parser.changeStringByRule(NOT_LETTER_IN_THE_START_SEVERAL_WORD);
        Assert.assertEquals(EXPECTED_STRING_FOR_SEVERAL_WORD_TEST, actualData);
    }

    @Test
    public void testChangeStringByRuleShouldReturnCorrectStringWhenArrivedSeveralWordsNotLetterInTheEnd() {
        CharMethodsParser parser = new CharMethodsParser();
        String actualData = parser.changeStringByRule(NOT_LETTER_IN_THE_END_SEVERAL_WORD);
        Assert.assertEquals(EXPECTED_STRING_FOR_SEVERAL_WORD_TEST, actualData);
    }

    @Test
    public void testChangeStringByRuleShouldReturnCorrectStringWhenArrivedSeveralWordsNotLetterInAnyPlace() {
        CharMethodsParser parser = new CharMethodsParser();
        String actualData = parser.changeStringByRule(NOT_LETTER_IN_ANY_PLACE_SEVERAL_WORD);
        Assert.assertEquals(EXPECTED_STRING_FOR_SEVERAL_WORD_TEST, actualData);
    }
}
