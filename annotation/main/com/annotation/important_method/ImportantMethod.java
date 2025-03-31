package annotation.important_method;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)  // Retain at runtime for reflection
public @interface ImportantMethod {
    String level() default "HIGH";   // Optional level parameter, default to "HIGH"
}

