package annotation.field_validation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// Annotation definition
@Retention(RetentionPolicy.RUNTIME)  // Available at runtime
@Target(ElementType.FIELD)           // Field-level annotation
public @interface MaxLength {
    int value();  // Maximum length parameter
}
