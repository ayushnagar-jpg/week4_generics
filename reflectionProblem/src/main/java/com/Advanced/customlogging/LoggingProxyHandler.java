package com.Advanced.customlogging;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LoggingProxyHandler implements InvocationHandler {
    private final Object target;

    public LoggingProxyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // ✅ Log the method name before execution
        System.out.println("📌 Method called: " + method.getName());

        // ✅ Execute the actual method
        Object result = method.invoke(target, args);

        // ✅ Log the return value (optional)
        System.out.println("✅ Method executed successfully. Result: " + result);

        return result;
    }

    // ✅ Factory Method to Create Proxy Instance
    public static <T> T createProxy(T target, Class<T> interfaceType) {
        return (T) Proxy.newProxyInstance(
                interfaceType.getClassLoader(),
                new Class<?>[]{interfaceType},
                new LoggingProxyHandler(target)
        );
    }
}
