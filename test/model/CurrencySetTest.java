/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author chusados
 */
public class CurrencySetTest {
    
    public CurrencySetTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class CurrencySet.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Currency currency = null;
        CurrencySet instance = new CurrencySet();
        boolean expResult = false;
        boolean result = instance.add(currency);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class CurrencySet.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int index = 0;
        CurrencySet instance = new CurrencySet();
        Currency expResult = null;
        Currency result = instance.get(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toArray method, of class CurrencySet.
     */
    @Test
    public void testToArray() {
        System.out.println("toArray");
        CurrencySet instance = new CurrencySet();
        Currency[] expResult = null;
        Currency[] result = instance.toArray();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
