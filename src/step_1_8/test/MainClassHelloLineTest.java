package step_1_8.test;

import org.junit.Test;
import step_1_8.main.MainClassHelloLine;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MainClassHelloLineTest {
    @Test
    public void test_MainClassHelloLine_1() {
        final ByteArrayOutputStream sink = new ByteArrayOutputStream();
        PrintStream controlledOut = new PrintStream(sink);
        PrintStream defaultOut = System.out;
        System.setOut(controlledOut);
        MainClassHelloLine.main(new String[]{});
        controlledOut.flush();
        assertEquals("Привет, Люк Скайуокер", sink.toString().trim());

        System.setOut(defaultOut);
    }
}
