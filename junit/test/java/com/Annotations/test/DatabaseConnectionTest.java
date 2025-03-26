package com.Annotations.test;

//import com.db.DatabaseConnection;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseConnectionTest {
    private com.Annotations.DatabaseConnection dbConnection;

    // ✅ Runs before each test method
    @BeforeEach
    void setUp() {
        dbConnection = new com.Annotations.DatabaseConnection();
        dbConnection.connect();  // Initialize connection before each test
    }

    // ✅ Runs after each test method
    @AfterEach
    void tearDown() {
        dbConnection.disconnect();  // Close connection after each test
    }

    // ✅ Test if connection is established correctly
    @Test
    void testConnectionIsEstablished() {
        assertTrue(dbConnection.isConnected(), "Database should be connected");
    }

    // ✅ Test if connection is closed correctly
    @Test
    void testConnectionIsClosed() {
        dbConnection.disconnect();
        assertFalse(dbConnection.isConnected(), "Database should be disconnected");
    }
}
