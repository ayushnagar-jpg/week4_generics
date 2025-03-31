package annotation.json_field;

import java.lang.reflect.Field;

public class JsonSerializer {

    public static String serialize(Object obj) throws IllegalAccessException {
        StringBuilder json = new StringBuilder("{");
        Class<?> objClass = obj.getClass();

        for (Field field : objClass.getDeclaredFields()) {
            if (field.isAnnotationPresent(JsonField.class)) {
                field.setAccessible(true);
                JsonField annotation = field.getAnnotation(JsonField.class);
                String jsonKey = annotation.name();
                Object value = field.get(obj);

                json.append("\"").append(jsonKey).append("\":");

                if (value == null) {
                    json.append("null");
                } else if (value instanceof Number) {
                    json.append("\"").append(value.toString()).append("\"");
                } else {
                    json.append("\"").append(value).append("\"");
                }
                json.append(", ");
            }
        }

        if (json.length() > 1) {
            json.delete(json.length() - 2, json.length()); // Remove trailing comma and space
        }
        json.append("}");
        return json.toString();
    }
}
