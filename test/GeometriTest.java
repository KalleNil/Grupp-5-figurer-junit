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
public class GeometriTest {
    
    public GeometriTest() {
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
     * Test of area method, of class Geometri.
     */
    @Test
    public void testArea() {
        System.out.println("area");
        Geometri instance = new GeometriImpl();
        double expResult = 0.0;
        double result = instance.area();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of omkrets method, of class Geometri.
     */
    @Test
    public void testOmkrets() {
        System.out.println("omkrets");
        Geometri instance = new GeometriImpl();
        double expResult = 0.0;
        double result = instance.omkrets();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class GeometriImpl implements Geometri {

        public double area() {
            return 0.0;
        }

        public double omkrets() {
            return 0.0;
        }
    }
    
}
