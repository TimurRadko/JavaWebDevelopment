package com.epam.two.dots.task.view.type;

import com.epam.two.dots.task.data.entity.Point;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PrinterConsoleTest {
    private final static String EXPECTED_STRING_ANSWER = "This point with coordinate(x=1, y=1) is closer than another to the origin.";
    private final Point closerPoint = new Point(1,1);

    @Test
    public void testCreatePrintAnswerShouldReturnCorrectAnswer() {
        Assert.assertEquals(EXPECTED_STRING_ANSWER, getTestingConsoleOutput(closerPoint));
    }

    private String getTestingConsoleOutput(Point point) {
        Printer printer = new PrinterConsole();
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        printer.printAnswer(point);
        System.setOut(consoleStream);
        String resultString = outputStream.toString();
        return resultString.trim();
    }
}
