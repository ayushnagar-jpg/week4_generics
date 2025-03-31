package annotation.repeatable_annotaion;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Repeatable annotation definition
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(BugReports.class)  // Making the annotation repeatable
public @interface BugReport {
    String description();
}
