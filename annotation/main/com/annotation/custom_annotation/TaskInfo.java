package annotation.custom_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Define a custom annotation
@Retention(RetentionPolicy.RUNTIME)  // Retained at runtime
@Target(ElementType.METHOD)  // Can be applied to methods
public @interface TaskInfo {
	String priority();
	String assignTo();
}
