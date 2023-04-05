package com.stir.cscu9t4practical1;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.*;

/**
 * @author saemundur
 */
public class SwimEntryTest {

    public SwimEntryTest() {
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
     * Test of getName method, of class SwimEntry.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Entry instance = new com.stir.cscu9t4practical1.SwimEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "outdoors", 0, 9, "distance");
        String expResult = "Alice";
        String result = instance.getName();
        Assertions.assertEquals(expResult, result);
    }

    /**
     * Test of getDay method, of class SwimEntry.
     */
    @Test
    public void testGetDay() {
        System.out.println("getDay");
        Entry instance = new com.stir.cscu9t4practical1.SwimEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "pool", 4, 6, "distance");
        int expResult = 1;
        int result = instance.getDay();
        Assertions.assertEquals(expResult, result);
    }

    /**
     * Test of getMonth method, of class SwimEntry.
     */
    @Test
    public void testGetMonth() {
        System.out.println("getMonth");
        Entry instance = new com.stir.cscu9t4practical1.SwimEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "outdoors", 0, 3, "sprints");
        int expResult = 2;
        int result = instance.getMonth();
        Assertions.assertEquals(expResult, result);
    }

    /**
     * Test of getYear method, of class SwimEntry.
     */
    @Test
    public void testGetYear() {
        System.out.println("getYear");
        Entry instance = new com.stir.cscu9t4practical1.SwimEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "pool", 4, 2, "sprints");
        int expResult = 2003;
        int result = instance.getYear();
        Assertions.assertEquals(expResult, result);
    }

    /**
     * Test of getHour method, of class SwimEntry.
     */
    @Test
    public void testGetHour() {
        System.out.println("getHour");
        Entry instance = new com.stir.cscu9t4practical1.SwimEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "pool", 3, 12, "sprints");
        int expResult = 0;
        int result = instance.getHour();
        Assertions.assertEquals(expResult, result);
    }

    /**
     * Test of getMin method, of class SwimEntry.
     */
    @Test
    public void testGetMin() {
        System.out.println("getMin");
        Entry instance = new com.stir.cscu9t4practical1.SwimEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "pool", 4, 10, "distance");
        int expResult = 16;
        int result = instance.getMin();
        Assertions.assertEquals(expResult, result);
    }

    /**
     * Test of getSec method, of class SwimEntry.
     */
    @Test
    public void testGetSec() {
        System.out.println("getSec");
        Entry instance = new com.stir.cscu9t4practical1.SwimEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "pool", 4, 2, "distance");
        int expResult = 7;
        int result = instance.getSec();
        Assertions.assertEquals(expResult, result);
    }

    /**
     * Test of getDistance method, of class SwimEntry.
     */
    @Test
    public void testGetDistance() {
        System.out.println("getDistance");
        Entry instance = new com.stir.cscu9t4practical1.SwimEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "pool", 4, 8, "sprints");
        float expResult = 3.0F;
        float result = instance.getDistance();
        Assertions.assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getWhere method, of class SwimEntry
     */
    @Test
    public void testGetWhere() {
        System.out.println("getWhere");
        SwimEntry instanceA = new com.stir.cscu9t4practical1.SwimEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "outdoors", 0, 4, "distance");
        String expResultA = "outdoors";
        String result = (instanceA).getWhere();
        Assertions.assertEquals(expResultA, result);

        SwimEntry instanceB = new com.stir.cscu9t4practical1.SwimEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "pool", 4, 8, "sprints");
        String expResultB = "pool";
        String result1 = (instanceB).getWhere();
        Assertions.assertEquals(expResultB, result1);
    }

    /**
     * Test of getEntry method, of class SwimEntry.
     */
    @Test
    public void testGetEntry() {
        System.out.println("getEntry");
        SwimEntry instance = new com.stir.cscu9t4practical1.SwimEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "outdoors", 0, 0, "distance");
        String expResult = "Alice swam 3.0 km distance outdoors in 0:16:7 on 1/2/2003\n";
        String result = instance.getEntry();
        Assertions.assertEquals(expResult, result);

        System.out.println("getEntry");
        SwimEntry instance2 = new SwimEntry("Alice", 1, 3, 2003, 0, 15, 12, 5, "pool", 1, 5, "sprints");
        String expResult2 = "Alice swam 5.0 km sprints (with 1 minutes recovery between) across 5 laps in 0:15:12 on 1/3/2003\n ";
        String result2 = instance2.getEntry();
        Assertions.assertEquals(expResult2, result2);
    }

    /**
     * Test of getLaps method, of class SwimEntry.
     */
    @Test
    public void testGetLaps() {
        System.out.println("getLaps");
        SwimEntry instance = new SwimEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "outdoors", 0, 0, "distance");
        int expResult = 0;
        int result = instance.getLaps();
        Assertions.assertEquals(expResult, result);
    }

    /**
     * Test of getRecoveryTime method, of class SwimEntry.
     */
    @Test
    public void testGetRecoveryTime() {
        System.out.println("getRecoveryTime");
        SwimEntry instance = new SwimEntry("Alice", 1, 3, 2003, 0, 15, 12, 5, "pool", 1, 5, "sprints");
        int expResult = 1;
        int result = instance.getRecoveryTime();
        Assertions.assertEquals(expResult, result);
    }

    /**
     * Test of isSprintsVSDistance method, of class SwimEntry.
     */
    @Test
    public void testSprintsVSDistance() {
        System.out.println("isSprintsVSDistance");
        SwimEntry instance = new SwimEntry("Alice", 1, 3, 2003, 0, 15, 12, 5, "pool", 1, 5, "sprints");
        String expResult = "sprints";
        String result = instance.isSprintsVSDistance();
        Assertions.assertEquals(expResult, result);
    }

}
