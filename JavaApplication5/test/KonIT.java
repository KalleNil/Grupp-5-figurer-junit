/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import src.Kon;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author preec
 */
public class KonIT {
    
    public KonIT() {
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
        float radius = 0.0F;
        float height = 0.0F;
        float slant_height = 0.0F;
        float pi = 0.0F;
        float expResult = 0.0F;
        float result = Kon.slantHeight(radius, height, slant_height, pi);
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
        float radius = 0.0F;
        float height = 0.0F;
        float slant_height = 0.0F;
        float expResult = 0.0F;
        float result = Kon.volume(radius, height, slant_height);
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
        float radius = 0.0F;
        float height = 0.0F;
        float slant_height = 0.0F;
        float pi = 0.0F;
        float expResult = 0.0F;
        float result = Kon.surfaceArea(radius, height, slant_height, pi);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
