package annotation.json_field;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//custom annotation for json field serialization
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonField {
	String name();
}
