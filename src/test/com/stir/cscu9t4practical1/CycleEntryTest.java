package com.stir.cscu9t4practical1;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.*;

/**
 * This code tests the methods contained within CycleEntry class
 *
 * @author saemundur
 * @StudentNumber 3122142
 * @date April 5, 2023
 */
public class CycleEntryTest {

    public CycleEntryTest() {
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
     * Test of getName method, of class CycleEntry.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Entry instance = new CycleEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "asphalt", "moderate");
        String expResult = "Alice";
        String result = instance.getName();
        Assertions.assertEquals(expResult, result);
    }

    /**
     * Test of getDay method, of class CycleEntry.
     */
    @Test
    public void testGetDay() {
        System.out.println("getDay");
        Entry instance = new CycleEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "gravel", "moderate");
        int expResult = 1;
        int result = instance.getDay();
        Assertions.assertEquals(expResult, result);
    }

    /**
     * Test of getMonth method, of class CycleEntry.
     */
    @Test
    public void testGetMonth() {
        System.out.println("getMonth");
        Entry instance = new CycleEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "mountain", "fast");
        int expResult = 2;
        int result = instance.getMonth();
        Assertions.assertEquals(expResult, result);
    }

    /**
     * Test of getYear method, of class CycleEntry.
     */
    @Test
    public void testGetYear() {
        System.out.println("getYear");
        Entry instance = new CycleEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "gravel", "slow");
        int expResult = 2003;
        int result = instance.getYear();
        Assertions.assertEquals(expResult, result);
    }

    /**
     * Test of getHour method, of class CycleEntry.
     */
    @Test
    public void testGetHour() {
        System.out.println("getHour");
        Entry instance = new CycleEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "asphalt", "fast");
        int expResult = 0;
        int result = instance.getHour();
        Assertions.assertEquals(expResult, result);
    }

    /**
     * Test of getMin method, of class CycleEntry.
     */
    @Test
    public void testGetMin() {
        System.out.println("getMin");
        Entry instance = new CycleEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "asphalt", "moderate");
        int expResult = 16;
        int result = instance.getMin();
        Assertions.assertEquals(expResult, result);
    }

    /**
     * Test of getSec method, of class CycleEntry.
     */
    @Test
    public void testGetSec() {
        System.out.println("getSec");
        Entry instance = new CycleEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "asphalt", "moderate");
        int expResult = 7;
        int result = instance.getSec();
        Assertions.assertEquals(expResult, result);
    }

    /**
     * Test of getDistance method, of class CycleEntry.
     */
    @Test
    public void testGetDistance() {
        System.out.println("getDistance");
        Entry instance = new CycleEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "asphalt", "moderate");
        float expResult = 3.0F;
        float result = instance.getDistance();
        Assertions.assertEquals(expResult, result);
    }

    /**
     * Test of getTerrain method, of class CycleEntry.
     */
    @Test
    public void testGetTerrain() {
        System.out.println("getTerrain");
        CycleEntry instance = new CycleEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "asphalt", "moderate");
        String expResult = "asphalt";
        String result = instance.getTerrain();
        Assertions.assertEquals(expResult, result);
    }

    /**
     * Test of getTempo method, of class CycleEntry.
     */
    @Test
    public void testGetTempo() {
        System.out.println("getTempo");
        CycleEntry instance = new CycleEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "asphalt", "moderate");
        String expResult = "moderate";
        String result = instance.getTempo();
        Assertions.assertEquals(expResult, result);
    }

    /**
     * Test of getEntry method, of class CycleEntry.
     */
    @Test
    public void testGetEntry() {
        System.out.println("getEntry");
        Entry instance = new CycleEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "asphalt", "moderate");
        String expResult = "Alice cycled 3.0 km in 0:16:7 on 1/2/2003 on asphalt at moderate tempo\n";
        String result = instance.getEntry();
        Assertions.assertEquals(expResult, result);
    }

}
