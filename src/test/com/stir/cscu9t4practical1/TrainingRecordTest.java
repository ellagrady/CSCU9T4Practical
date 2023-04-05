package com.stir.cscu9t4practical1;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.*;

/**
 * This code implements tests for the TrainingRecord class
 *
 * @author saemundur
 * @StudentNumber 3122142
 * @date April 5, 2023
 */
public class TrainingRecordTest {
    public TrainingRecordTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of addEntry method, of class TrainingRecord.
     * You might want to extend this test when you implement the other
     * Entry types
     */
    @Test
    public void testAddEntry() {
        System.out.println("addEntry(Entry e)");
        Entry a = new Entry("Alice", 1, 2, 2003, 0, 16, 7, 3);
        TrainingRecord instance = new TrainingRecord();
        instance.addEntry(a);
        Assertions.assertEquals(instance.getNumberOfEntries(), 1);

        System.out.println("addEntry(SwimEntry e)");
        SwimEntry swim = new SwimEntry("Alice", 1, 3, 2003, 0, 15, 12, 5, "pool", 1, 5, "sprints");
        instance.addEntry(swim);
        Assertions.assertEquals(instance.getNumberOfEntries(), 2);

        System.out.println("addEntry(CycleEntry e)");
        CycleEntry cycle = new CycleEntry("Alice", 1, 4, 2003, 0, 16, 7, 3, "asphalt", "moderate");
        instance.addEntry(cycle);
        Assertions.assertEquals(instance.getNumberOfEntries(), 3);

        System.out.println("addEntry(SprintEntry e)");
        SprintEntry sprint = new SprintEntry("Alice", 1, 5, 2003, 0, 16, 7, 300, 4, "sprints", 2);
        instance.addEntry(sprint);
        Assertions.assertEquals(instance.getNumberOfEntries(), 4);
    }

    /**
     * Test of addEntry with a repeat
     * Adding another entry for the same person on the same day should fail
     */
    @Test
    public void testAddEntryUnique() {
        System.out.println("addEntry -- fail");
        SwimEntry a = new SwimEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "pool", 1, 8, "sprints");
        CycleEntry b = new CycleEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "asphalt", "slow");
        TrainingRecord instance = new TrainingRecord();
        instance.addEntry(a);
        instance.addEntry(b);
        Assertions.assertEquals(instance.getNumberOfEntries(), 1);
        // You might also consider using assertThrows() and let
        // TrainingRecord instance take care of when you're trying to add
        // a none-unique entry
    }

    /**
     * Test of lookupEntry method, of class TrainingRecord.
     */
    @Test
    public void testLookupEntry() {
        System.out.println("lookupEntry");
        com.stir.cscu9t4practical1.TrainingRecord instance = new com.stir.cscu9t4practical1.TrainingRecord();
        String expResult = "No entries found";
        Entry a = new Entry("Alice", 1, 2, 2003, 0, 16, 7, 3);
        Entry b = new Entry("Bob", 1, 2, 2003, 0, 14, 15, 3);
        Entry c1 = new Entry("Claire", 7, 3, 2010, 0, 26, 20, 7);
        Entry c2 = new Entry("Claire", 11, 3, 2010, 0, 24, 55, 7);
        instance.addEntry(a);
        instance.addEntry(b);
        instance.addEntry(c1);
        instance.addEntry(c2);
        int d = 7;
        int m = 3;
        int y = 2010;
        String result = instance.lookupEntry(d, m, y);
        Assertions.assertNotEquals(expResult, result, "expecting to find the entry");
        result = instance.lookupEntry(1, 2, 1999);
        Assertions.assertEquals(expResult, result, "expecting to not find the entry");
    }

    /**
     * Test of getNumberOfEntries, of class TrainingRecord
     */
    @Test
    public void testGetNumberOfEntries() {
        System.out.println("GetNumberOfEntries");
        com.stir.cscu9t4practical1.TrainingRecord instance = new com.stir.cscu9t4practical1.TrainingRecord();
        Entry a = new Entry("Alice", 1, 2, 2003, 0, 16, 7, 3);
        Entry b = new Entry("Bob", 1, 2, 2003, 0, 14, 15, 3);
        Entry c1 = new Entry("Claire", 7, 3, 2010, 0, 26, 20, 7);
        Entry c2 = new Entry("Claire", 11, 3, 2010, 0, 24, 55, 7);
        Assertions.assertEquals(instance.getNumberOfEntries(), 0);
        instance.addEntry(a);
        Assertions.assertEquals(instance.getNumberOfEntries(), 1);
        instance.addEntry(b);
        Assertions.assertEquals(instance.getNumberOfEntries(), 2);
        instance.addEntry(c1);
        Assertions.assertEquals(instance.getNumberOfEntries(), 3);
        instance.addEntry(c2);
        Assertions.assertEquals(instance.getNumberOfEntries(), 4);
    }

    /**
     * Test of yet to be implemented findAllbyDate, of class TrainingRecord
     * Implement the method and then remove the "fail" line below and
     * un-comment call to the method and the assertion line
     */
    @Test
    public void testFindAllbyDate() {
        System.out.println("findAllbyDate");
        String expectResultsNone = "";
        String expectResults = "Alice ran 3.0 km in 0:16:7 on 1/2/2003\n" +
                "Bob ran 3.0 km in 0:14:15 on 1/2/2003\n";
        TrainingRecord instance = new TrainingRecord();
        Entry a = new Entry("Alice", 1, 2, 2003, 0, 16, 7, 3);
        Entry b = new Entry("Bob", 1, 2, 2003, 0, 14, 15, 3);
        instance.addEntry(a);
        instance.addEntry(b);
        // Assertions.fail("This method cannot be tested as it does not exist yet");
        int d = 1;
        int m = 2;
        int y = 2003;
        // un-comment the lines below when you've implemented the method
        String resultSuccess = instance.findAllbyDate(d, m, y);
        String resultNone = instance.findAllbyDate(d, m, 1999);
        Assertions.assertEquals(expectResultsNone, resultNone);
        Assertions.assertEquals(expectResults, resultSuccess);
    }

    /**
     * Test of searchByName method, of TrainingRecord class.
     */
    @Test
    public void testSearchbyName() {
        System.out.println("searchByName");
        String expectResults = "Alice cycled 3.0 km in 0:16:7 on 1/2/2003 on asphalt at moderate tempo\n";
        String expectNone = "";
        CycleEntry cycle = new CycleEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "asphalt", "moderate");
        TrainingRecord instance = new TrainingRecord();
        instance.addEntry(cycle);
        SprintEntry sprint = new SprintEntry("John", 1, 3, 2003, 1, 5, 13, 8, 1, "distance", 0);
        String expResult2 = "John ran a 1 * 8 km run in 1:5:13 on 1/3/2003\n";
        instance.addEntry(sprint);
        String alice = "Alice";
        String bob = "Bob";
        String resultSuccess = instance.searchByName(alice);
        String resultNone = instance.searchByName(bob);
        Assertions.assertEquals(expectNone, resultNone);
        Assertions.assertEquals(expectResults, resultSuccess);
    }

    /**
     * Test of removeEntry method, of class TrainingRecord
     */
    @Test
    public void testRemoveEntry() {
        System.out.println("removeEntry");
        int expectedLength = 1;
        CycleEntry cycle = new CycleEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "asphalt", "moderate");
        TrainingRecord instance = new TrainingRecord();
        instance.addEntry(cycle);
        SprintEntry sprint = new SprintEntry("John", 1, 3, 2003, 1, 5, 13, 8, 1, "distance", 0);
        instance.addEntry(sprint);
        instance.removeEntry("Alice", 1, 2, 2003);
        int newLength = instance.getNumberOfEntries();
        Assertions.assertEquals(expectedLength, newLength);
    }

    /**
     * Test of clearAllEntries method, of class TrainingRecord
     */
    @Test
    public void testClearAll() {
        System.out.println("clearAllEntries");
        int expectedLength = 0;
        CycleEntry cycle = new CycleEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "asphalt", "moderate");
        TrainingRecord instance = new TrainingRecord();
        instance.addEntry(cycle);
        SprintEntry sprint = new SprintEntry("John", 1, 3, 2003, 1, 5, 13, 8, 1, "distance", 0);
        instance.addEntry(sprint);
        instance.clearAllEntries();
        int newLength = instance.getNumberOfEntries();
        Assertions.assertEquals(expectedLength, newLength);
    }

}
