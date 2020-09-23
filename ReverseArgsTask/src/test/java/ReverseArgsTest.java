import com.epam.reverse.args.data.receiver.type.ConsoleDataReceiver;
import com.epam.reverse.args.data.receiver.type.ConsoleReceiver;
import com.epam.reverse.args.logic.Calculator;
import com.epam.reverse.args.view.type.ConsolePrinter;
import com.epam.reverse.args.view.type.Printer;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArgsTest {
    private final String[] expectedData = {"1", "2", "3", "4"};
    private final String[] actualData = {"1", "2", "3", "4"};
    private final List<String> expectedDataList = Arrays.asList(expectedData);
    private final String[] reverseExpectedData = {"4", "3", "2", "1"};
    private final List<String> expectedEmptyDataList = new ArrayList<>(0);
    private final static String EMPTY_CONSOLE_MESSAGE = "Console args is empty";
    private final static String EXPECTED_STRING_DATA = "1 2 3 4";

    @Test
    public void shouldCorrectAddingDataUsingReceivingConsoleDataMethod() {
        ConsoleReceiver consoleReceiver = new ConsoleDataReceiver();
        consoleReceiver.receivingConsoleData(actualData);
        List<String> actualDataList = consoleReceiver.getReceivingList();
        Assert.assertArrayEquals(expectedData, actualDataList.toArray());
    }

    @Test
    public void shouldReturnReverseDataFromReverseArgsMethod() {
        Calculator calculator = new Calculator();
        List<String> reverseList = calculator.reverseArgs(expectedDataList);
        String[] actualReverseArray = reverseList.toArray(new String[0]);
        Assert.assertArrayEquals(reverseExpectedData, actualReverseArray);
    }

    @Test
    public void shouldPrintCorrectAnswerWithEmptyConsoleLine() {
        Assert.assertEquals(EMPTY_CONSOLE_MESSAGE, getTestingConsoleOutput(expectedEmptyDataList));
    }

    @Test
    public void shouldPrintCorrectAnswerWithFilledConsoleLine() {
        List<String> actualDataList = Arrays.asList(expectedData);
        Assert.assertEquals(EXPECTED_STRING_DATA, getTestingConsoleOutput(actualDataList));
    }

    private String getTestingConsoleOutput(List<String> expectedData) {
        Printer printer = new ConsolePrinter();
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        printer.printAnswer(expectedData);
        System.setOut(consoleStream);
        String resultString = outputStream.toString();
        return resultString.trim();
    }
}
