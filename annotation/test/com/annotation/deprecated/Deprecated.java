package annotation.deprecated;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import org.junit.Test;

public class Deprecated {
	
	@Test
	public void testOldMethod() {
		LegacyAPI legacyapi = new LegacyAPI();
		assertDoesNotThrow(() -> legacyapi.oldMethod(),"old method do not throw any exception");
	}
	
	@Test
	public void testNewMethod() {
		LegacyAPI legacyapi = new LegacyAPI();
		assertDoesNotThrow (()-> legacyapi.newMethod(),"new method do not throw any excetpion");
	}
	
	@Test
	public void testDeprecatedMethod() {
		  try {
	            // Get the specific method named "oldMethod" from the LegacyAPI class
	            Method method = LegacyAPI.class.getMethod("oldMethod");

	            // Check if the @Deprecated annotation is present using getAnnotation()
	            boolean isDeprecated = method.isAnnotationPresent(java.lang.Deprecated.class);

	            assertTrue( "old method should be deprecated with @Deprecated",isDeprecated);
	        } catch (NoSuchMethodException e) {
	            throw new AssertionError("Method oldMethod not found in LegacyAPI class.", e);
	        }
	}
}
