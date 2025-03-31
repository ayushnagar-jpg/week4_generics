package annotation.field_validation;

import java.lang.reflect.Field;

public class User {

    @MaxLength(10)  // Set the maximum length for the username
    private String username;

    public User(String username) {
        // Validate the length before setting the value
        validateMaxLength(username);
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    // Validation method
    private void validateMaxLength(String value) {
        Field[] fields = this.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(MaxLength.class)) {
                MaxLength maxLength = field.getAnnotation(MaxLength.class);
                if (value != null && value.length() > maxLength.value()) {
                    throw new IllegalArgumentException(
                        "Field '" + field.getName() + "' exceeds maximum length of " + maxLength.value()
                    );
                }
            }
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println("Creating User with valid username...");
            User validUser = new User("JohnDoe");
            System.out.println("User created with username: " + validUser.getUsername());

            System.out.println("\nCreating User with long username...");
            User longUser = new User("ThisUsernameIsTooLong");
            System.out.println("User created with username: " + longUser.getUsername());

        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
