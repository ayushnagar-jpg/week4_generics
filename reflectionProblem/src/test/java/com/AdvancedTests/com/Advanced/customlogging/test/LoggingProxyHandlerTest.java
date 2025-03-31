package com.AdvancedTests.com.Advanced.customlogging.test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.Advanced.customlogging.Greeting;
import com.Advanced.customlogging.GreetingImpl;
import com.Advanced.customlogging.LoggingProxyHandler;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class LoggingProxyHandlerTest {

    @Test
    public void testProxyLoggingAndMethodExecution() {
        // ✅ Capture console output for logging verification
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // ✅ Create the real object
        Greeting greeting = new GreetingImpl();

        // ✅ Create proxy with logging functionality
        Greeting proxy = LoggingProxyHandler.createProxy(greeting, Greeting.class);

        // ✅ Call the method
        String result = proxy.sayHello("Ayush");

        // ✅ Verify correct method output
        assertEquals("Hello, Ayush!", result);

        // ✅ Verify logging output
        String consoleOutput = outContent.toString().trim();
        String expectedLog = "📌 Method called: sayHello\n✅ Method executed successfully. Result: Hello, Ayush!";
        assertEquals(expectedLog, consoleOutput);

        // ✅ Reset System.out
        System.setOut(System.out);
    }
}
