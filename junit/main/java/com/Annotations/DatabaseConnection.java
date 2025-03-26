package com.Annotations;
public class DatabaseConnection {
    private boolean isConnected = false;

    // Method to establish a connection
    public void connect() {
        isConnected = true;
        System.out.println("Database connected");
    }

    // Method to close the connection
    public void disconnect() {
        isConnected = false;
        System.out.println("Database disconnected");
    }

    // Method to check if the connection is active
    public boolean isConnected() {
        return isConnected;
    }
}
