package com.Intermediate.Annotations;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// Custom annotation
@Retention(RetentionPolicy.RUNTIME) // Available at runtime
@Target(ElementType.TYPE) // Can only be applied to classes
public @interface Author {
    String name();
}
