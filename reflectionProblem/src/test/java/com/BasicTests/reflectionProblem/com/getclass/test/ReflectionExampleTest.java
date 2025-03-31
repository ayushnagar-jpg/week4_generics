package com.BasicTests.reflectionProblem.com.getclass.test;
import static org.junit.Assert.*;
import org.junit.Test;

import com.Basic.reflectionProblem.com.getclass.ReflectionExample;

public class ReflectionExampleTest {

    @Test
    public void testGetClassInfoForExistingClass() {
        String result = ReflectionExample.getClassInfo("java.util.ArrayList"); // ✅ Corrected method call

        // Verify if expected details exist
        assertTrue(result.contains("Class Name: java.util.ArrayList"));
        assertTrue(result.contains("Constructors:"));
        assertTrue(result.contains("Fields:"));
        assertTrue(result.contains("Methods:"));
    }

    @Test
    public void testGetClassInfoForNonExistentClass() {
        String result = ReflectionExample.getClassInfo("com.nonexistent.FakeClass"); // ✅ Corrected method call
        assertEquals("Class not found! Please check the name and try again.", result);
    }

    @Test
    public void testGetClassInfoForPrimitiveType() {
        String result = ReflectionExample.getClassInfo("int"); // Primitives don't work with Class.forName()
        assertEquals("Class not found! Please check the name and try again.", result);
    }
}
