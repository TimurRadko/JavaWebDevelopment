import com.epam.reverse.args.data.DataReceiverFactory;
import com.epam.reverse.args.data.DataReceivingFactoryImpl;
import com.epam.reverse.args.data.receiver.type.ConsoleReceiver;
import com.epam.reverse.args.logic.Calculator;
import com.epam.reverse.args.view.PrinterFactory;
import com.epam.reverse.args.view.PrinterFactoryImpl;
import com.epam.reverse.args.view.type.Printer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArgsTest {
    private final String[] expectedData = {"1", "2", "3", "4"};
    private final String[] reverseExpectedData = {"4", "3", "2", "1"};
    private final List<String> expectedEmptyData = new ArrayList<>(0);
    private DataReceiverFactory dataReceiverFactory;
    private PrinterFactory printerFactory;
    private final static String EMPTY_CONSOLE_MESSAGE = "Console args is empty";

    @Before
    public void createFactories() {
        dataReceiverFactory = new DataReceivingFactoryImpl();
        printerFactory = new PrinterFactoryImpl();
    }

    @Test
    public void shouldCorrectAddingDataUsingReceivingConsoleDataMethod() {
        ConsoleReceiver consoleReceiver = dataReceiverFactory.getDataReceiver();
        String[] actualData = {"1", "2", "3", "4"};
        consoleReceiver.receivingConsoleData(actualData);
        Assert.assertArrayEquals(expectedData, consoleReceiver.getReceivingList().toArray());
    }

    @Test
    public void shouldReturnReverseDataFromReverseArgsMethod() {
        Calculator calculator = new Calculator();
        List<String> arrayAsList = Arrays.asList(expectedData);
        List<String> reverseList = calculator.reverseArgs(arrayAsList);
        String[] actualReverseArray = reverseList.toArray(new String[0]);
        Assert.assertArrayEquals(reverseExpectedData, actualReverseArray);
    }

    @Test
    public void shouldPrintCorrectAnswerWithEmptyConsoleLine() {
        Assert.assertEquals(EMPTY_CONSOLE_MESSAGE, getTestingConsoleOutput(expectedEmptyData));
    }

    @Test
    public void shouldPrintCorrectAnswerWithFilledConsoleLine() {
        List<String> actualDataList = Arrays.asList(expectedData);
        String expectedStringData = Arrays.toString(expectedData);
        Assert.assertEquals(expectedStringData, getTestingConsoleOutput(actualDataList));
    }

    private String getTestingConsoleOutput(List<String> expectedData) {
        Printer printer = printerFactory.getPrinter();
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        printer.printAnswer(expectedData);
        System.setOut(consoleStream);
        String resultString = outputStream.toString();
        int endTrim = (outputStream.toString().length() - 2);
        return resultString.substring(0, endTrim);
    }
}
