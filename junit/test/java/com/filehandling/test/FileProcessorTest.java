package com.filehandling.test;
import com.filehandling.FileProcessor;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

class FileProcessorTest {
    private static final String TEST_FILE = "testfile.txt";

    // Test writing and reading from a file
    @Test
    void testWriteAndReadFromFile() throws IOException {
        String content = "Hello, JUnit!";
        
        // Write to file
        FileProcessor.writeToFile(TEST_FILE, content);
        
        // Read from file
        String readContent = FileProcessor.readFromFile(TEST_FILE);
        
        // Assert content is written and read correctly
        assertEquals(content, readContent, "File content should match.");
    }

    // Test if file exists after writing
    @Test
    void testFileExistsAfterWriting() throws IOException {
        FileProcessor.writeToFile(TEST_FILE, "Sample Content");

        File file = new File(TEST_FILE);
        assertTrue(file.exists(), "File should exist after writing.");
    }

    // ✅ Test handling of IOException when reading a non-existent file
    @Test
    void testReadFromNonExistentFile() {
        assertThrows(IOException.class, () -> FileProcessor.readFromFile("nonexistent.txt"), 
                     "Reading a non-existent file should throw IOException.");
    }
}
