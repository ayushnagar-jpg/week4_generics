package annotation.repeatable_annotaion;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Container annotation to hold multiple BugReport annotations
@Retention(RetentionPolicy.RUNTIME)
public @interface BugReports {
    BugReport[] value();
}

