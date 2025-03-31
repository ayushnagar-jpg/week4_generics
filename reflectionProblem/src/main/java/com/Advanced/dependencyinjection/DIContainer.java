package com.Advanced.dependencyinjection;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class DIContainer {
    private final Map<Class<?>, Object> dependencies = new HashMap<>();

    // ✅ Register a dependency instance in the container
    public void register(Class<?> interfaceType, Object implementation) {
        dependencies.put(interfaceType, implementation);
    }

    // ✅ Inject dependencies into an object
    public void injectDependencies(Object target) {
        Class<?> clazz = target.getClass();

        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {
                Class<?> fieldType = field.getType();
                Object dependency = dependencies.get(fieldType);

                if (dependency != null) {
                    field.setAccessible(true);
                    try {
                        field.set(target, dependency);
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException("Failed to inject dependency: " + fieldType.getName(), e);
                    }
                }
            }
        }
    }
}
