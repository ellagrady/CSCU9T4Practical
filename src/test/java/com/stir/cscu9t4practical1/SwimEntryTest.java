/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stir.cscu9t4practical1;

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
        Entry instance = new SwimEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "outdoors", 0, false);
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
        Entry instance = new SwimEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "pool", 4, true);
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
        Entry instance = new SwimEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "outdoors", 0, false);
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
        Entry instance = new SwimEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "pool", 4, true);
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
        Entry instance = new SwimEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "pool");
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
        Entry instance = new SwimEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "pool", 4, true);
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
        Entry instance = new SwimEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "pool", , 4, true);
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
        Entry instance = new SwimEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "pool", 4, true);
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
        Entry instanceA = new SwimEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "outdoors", 0, false);
        String expResultA = "outdoors";
        String result = instanceA.getWhere();
        Assertions.assertEquals(expResultA, result);

        Entry instanceB = new SwimEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "pool", 4, true);
        String expResultB = "in a pool";
        String result = instanceB.getWhere();
        Assertions.assertEquals(expResultB, result);
    }

    /**
     * Test of getEntry method, of class SwimEntry.
     */
    @Test
    public void testGetEntry() {
        System.out.println("getEntry");
        Entry instance = new SwimEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "outdoors", 0, false);
        String expResult = "Alice swam 3.0 km outdoors in 0:16:7 on 1/2/2003\n";
        String result = instance.getEntry();
        Assertions.assertEquals(expResult, result);
    }

}
