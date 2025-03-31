package com.Advanced.customlogging;

public class ProxyTest {
    public static void main(String[] args) {
        // ✅ Create the real object
        Greeting greeting = new GreetingImpl();

        // ✅ Create a proxy that logs method calls
        Greeting proxy = LoggingProxyHandler.createProxy(greeting, Greeting.class);

        // ✅ Invoke method through proxy
        String message = proxy.sayHello("Ayush");

        // ✅ Print result
        System.out.println("Final Output: " + message);
    }
}
