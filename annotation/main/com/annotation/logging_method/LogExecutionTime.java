package annotation.logging_method;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)  // Keep annotation at runtime for reflection
public @interface LogExecutionTime {
}
