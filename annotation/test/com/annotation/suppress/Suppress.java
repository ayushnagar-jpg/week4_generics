package annotation.suppress;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class Suppress {
	@Test
	public void testSize() {
		SuppressUncheckedWarning suw = new SuppressUncheckedWarning();
		ArrayList ar = suw.addElement();
		assertEquals(3,ar.size());
	}
	
	@Test
	public void testContains() {
		SuppressUncheckedWarning suw = new SuppressUncheckedWarning();
		ArrayList ar = suw.addElement();
		assertTrue("Hello",ar.contains("Hello"));
		assertTrue("23",ar.contains(23));
		assertTrue("2.2",ar.contains(2.2));
	}
	
	@Test
	public void testType() {
		SuppressUncheckedWarning suw = new SuppressUncheckedWarning();
		ArrayList ar = suw.addElement();
		
		assertEquals(String.class,ar.get(0).getClass());
		assertEquals(Integer.class,ar.get(1).getClass());
		assertEquals(Double.class,ar.get(2).getClass());
	}
	
}
