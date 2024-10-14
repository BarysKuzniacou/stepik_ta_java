package step_1_8_first_progs.test;

import org.junit.Test;
import step_1_8_first_progs.main.MainClass;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class MainClassTest {
    @Test
    public void test_MainClass_1() {
        final ByteArrayOutputStream sink = new ByteArrayOutputStream();
        PrintStream controlledOut = new PrintStream(sink);
        PrintStream defaultOut = System.out;
        System.setOut(controlledOut);
        MainClass.main(new String[]{});
        controlledOut.flush();
        assertEquals("Да пребудет с тобой сила, юный падаван!", sink.toString().trim());

        System.setOut(defaultOut);
    }

}
