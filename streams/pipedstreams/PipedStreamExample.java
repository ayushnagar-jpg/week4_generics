package streams.pipedstreams;

import java.io.*;

class WriterThread extends Thread {
    private PipedOutputStream pos;

    public WriterThread(PipedOutputStream pos) {
        this.pos = pos;
    }

    @Override
    public void run() {
        try {
            String message = "Hello from WriterThread!";
            pos.write(message.getBytes()); // Writing data to the pipe
            pos.close(); // Close the stream after writing
        } catch (IOException e) {
            System.out.println("WriterThread Error: " + e.getMessage());
        }
    }
}

class ReaderThread extends Thread {
    private PipedInputStream pis;

    public ReaderThread(PipedInputStream pis) {
        this.pis = pis;
    }

    @Override
    public void run() {
        try {
            int data;
            System.out.print("ReaderThread Received: ");
            while ((data = pis.read()) != -1) { // Reading data from the pipe
                System.out.print((char) data);
            }
            System.out.println(); // Move to the next line
            pis.close(); // Close the stream after reading
        } catch (IOException e) {
            System.out.println("ReaderThread Error: " + e.getMessage());
        }
    }
}

public class PipedStreamExample {
    public static void main(String[] args) {
        try {
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos); // Connect input and output streams
            
            // Creating threads
            WriterThread writer = new WriterThread(pos);
            ReaderThread reader = new ReaderThread(pis);

            writer.start(); // Start writer thread
            reader.start(); // Start reader thread

            // Wait for both threads to complete
            writer.join();
            reader.join();
        } catch (IOException | InterruptedException e) {
            System.out.println("Main Thread Error: " + e.getMessage());
        }
    }
}
