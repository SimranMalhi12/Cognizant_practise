package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class AAAPatternTest {

    private List<String> namesList;

    @Before
    public void setUp() {
        System.out.println("@Before - setUp(): Initializing namesList");
        namesList = new ArrayList<>();
        namesList.add("Alice");
        namesList.add("Bob");
        namesList.add("Ayush");
    }

    @After
    public void tearDown() {
        System.out.println("@After - tearDown(): Clearing namesList");
        namesList.clear();
        namesList = null;
    }

    @Test
    public void testListSize() {
        int size = namesList.size();
        assertEquals("List should contain 3 names", 3, size);
    }

    @Test
    public void testAddElement() {
        String newName = "Diana";
        namesList.add(newName);
        assertEquals("List size should be 4 after adding", 4, namesList.size());
        assertTrue("List should contain Diana", namesList.contains("Diana"));
    }

    @Test
    public void testRemoveElement() {
        String nameToRemove = "Bob";
        boolean removed = namesList.remove(nameToRemove);
        assertTrue("remove() should return true", removed);
        assertEquals("List size should be 2 after removal", 2, namesList.size());
        assertFalse("List should no longer contain Bob", namesList.contains("Bob"));
    }

    @Test
    public void testGetElement() {
        int index = 0;
        String name = namesList.get(index);
        assertEquals("First element should be Alice", "Alice", name);
    }

    @Test
    public void testContainsElement() {
        String searchName = "Ayush";
        boolean found = namesList.contains(searchName);
        assertTrue("List should contain Ayush", found);
    }
}
