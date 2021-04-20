/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author preec
 */
public class KonTest {
    
    public KonTest() {
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
     * Test of slantHeight method, of class Kon.
     */
    @Test
    public void testSlantHeight() {
        System.out.println("slantHeight");
        Kon instance = null;
        double expResult = 0.0;
        double result = instance.slantHeight();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of volume method, of class Kon.
     */
    @Test
    public void testVolume() {
        System.out.println("volume");
        Kon instance = null;
        double expResult = 0.0;
        double result = instance.volume();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of surfaceArea method, of class Kon.
     */
    @Test
    public void testSurfaceArea() {
        System.out.println("surfaceArea");
        Kon instance = null;
        double expResult = 0.0;
        double result = instance.surfaceArea();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
