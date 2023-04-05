package com.stir.cscu9t4practical1;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This code implements tests for the SprintEntry class
 *
 * @author saemundur
 * @StudentNumber 3122142
 * @date April 5, 2023
 */
public class SprintEntryTest {

    public SprintEntryTest() {
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
     * Test of getName method, of class SprintEntry.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        SprintEntry instance = new SprintEntry("Alice", 1, 2, 2003, 0, 16, 7, 300, 4, "sprints", 2);
        String expResult = "Alice";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDay method, of class SprintEntry.
     */
    @Test
    public void testGetDay() {
        System.out.println("getDay");
        SprintEntry instance = new SprintEntry("Alice", 1, 2, 2003, 0, 16, 7, 300, 4, "sprints", 2);
        int expResult = 1;
        int result = instance.getDay();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMonth method, of class SprintEntry.
     */
    @Test
    public void testGetMonth() {
        System.out.println("getMonth");
        SprintEntry instance = new SprintEntry("Alice", 1, 2, 2003, 0, 16, 7, 300, 4, "sprints", 2);
        int expResult = 2;
        int result = instance.getMonth();
        assertEquals(expResult, result);
    }

    /**
     * Test of getYear method, of class SprintEntry.
     */
    @Test
    public void testGetYear() {
        System.out.println("getYear");
        SprintEntry instance = new SprintEntry("Alice", 1, 2, 2003, 0, 16, 7, 300, 4, "sprints", 2);
        int expResult = 2003;
        int result = instance.getYear();
        assertEquals(expResult, result);
    }

    /**
     * Test of getHour method, of class SprintEntry.
     */
    @Test
    public void testGetHour() {
        System.out.println("getHour");
        SprintEntry instance = new SprintEntry("Alice", 1, 2, 2003, 0, 16, 7, 300, 4, "sprints", 2);
        int expResult = 0;
        int result = instance.getHour();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMin method, of class SprintEntry.
     */
    @Test
    public void testGetMin() {
        System.out.println("getMin");
        SprintEntry instance = new SprintEntry("Alice", 1, 2, 2003, 0, 16, 7, 300, 4, "sprints", 2);
        int expResult = 16;
        int result = instance.getMin();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSec method, of class SprintEntry.
     */
    @Test
    public void testGetSec() {
        System.out.println("getSec");
        SprintEntry instance = new SprintEntry("Alice", 1, 2, 2003, 0, 16, 7, 300, 4, "sprints", 2);
        int expResult = 7;
        int result = instance.getSec();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDistance method, of class SprintEntry.
     */
    @Test
    public void testGetDistance() {
        System.out.println("getDistance");
        SprintEntry instance = new SprintEntry("Alice", 1, 2, 2003, 0, 16, 7, 3.0F, 4, "sprints", 2);
        float expResult = 3.0F;
        float result = instance.getDistance();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getRepetitions method of class SprintEntry
     */
    @Test
    public void testGetRepetitions() {
        System.out.println("getRepetitions");
        SprintEntry instance = new SprintEntry("Alice", 1, 2, 2003, 0, 16, 7, 300, 4, "sprints", 2);
        int expected = 4;
        int result = instance.getReps();
        assertEquals(expected, result);
    }

    /**
     * Test of getRecovery method of class SprintEntry
     */
    @Test
    public void testGetRecovery() {
        System.out.println("getRepetitions");
        SprintEntry instance = new SprintEntry("Alice", 1, 2, 2003, 0, 16, 7, 300, 4, "sprints", 2);
        int expResult = 2;
        int result = instance.getRecoveryTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSprintVSRun method, of class Sprint Entry
     */
    @Test
    public void testGetSprintvsRun() {
        System.out.println("getSprintsVSRun");
        SprintEntry instance = new SprintEntry("Alice", 1, 2, 2003, 0, 16, 7, 300, 4, "sprints", 2);
        String expResult = "sprints";
        String result = instance.getSprintVSRun();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEntry method, of class SprintEntry.
     */
    @Test
    public void testGetEntry() {
        System.out.println("getEntry");
        SprintEntry instance = new SprintEntry("Alice", 1, 2, 2003, 0, 16, 7, 0.5F, 4, "sprints", 2);
        String expResult = "Alice ran 4 * 0.5 km sprints (with 2 minutes recovery between) in 0:16:7 on 1/2/2003\n";
        String result = instance.getEntry();
        assertEquals(expResult, result);

        System.out.println("getEntry");
        SprintEntry instance2 = new SprintEntry("Alice", 1, 3, 2003, 1, 5, 13, 8, 1, "distance", 0);
        String expResult2 = "Alice ran a 1 * 8.0km run in 1:5:13 on 1/3/2003\n";
        String result2 = instance2.getEntry();
        assertEquals(expResult2, result2);


    }

}
