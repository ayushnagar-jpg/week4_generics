package annotation.role_allowed;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Define a class-level annotation
@Retention(RetentionPolicy.RUNTIME)
public @interface RoleAllowed {
    String[] value();  // Array of allowed roles
}

