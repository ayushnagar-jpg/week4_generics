package com.Advanced.dependencyinjection;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SystemOutCapture {
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    public void start() {
        System.setOut(new PrintStream(outputStream)); // Redirect System.out to ByteArrayOutputStream
    }

    public String stop() {
        System.setOut(originalOut); // Restore original System.out
        return outputStream.toString(); // Get captured output as a string
    }
}
