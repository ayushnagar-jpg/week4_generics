package com.Intermediate.staticfields;
public class Configuration {
    // Private static field
    private static String API_KEY = "DEFAULT_KEY";

    // Getter method to check the value
    public static String getApiKey() {
        return API_KEY;
    }
}
