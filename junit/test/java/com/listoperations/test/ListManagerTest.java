package com.listoperations.test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.listoperations.ListManager;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;


class ListManagerTest {
    public ListManager listManager;
    private List<Integer> list;

    @BeforeEach
    void setUp() {
        listManager = new ListManager();
        list = new ArrayList<>(); // Initialize a new list before each test
    }

    // Test adding an element
    @Test
    void testAddElement() {
        listManager.addElement(list, 10);
        assertTrue(list.contains(10), "Element should be added to the list");
    }

    // Test removing an element
    @Test
    void testRemoveElement() {
        list.add(20);
        boolean result = listManager.removeElement(list, 20);
        assertTrue(result, "Element should be removed successfully");
        assertFalse(list.contains(20), "List should no longer contain the removed element");
    }

    //  Test getting list size
    @Test
    void testGetSize() {
        listManager.addElement(list, 5);
        listManager.addElement(list, 15);
        assertEquals(2, listManager.getSize(list), "Size should be 2 after adding two elements");
        
        listManager.removeElement(list, 5);
        assertEquals(1, listManager.getSize(list), "Size should be 1 after removing one element");
    }
}
