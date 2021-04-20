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
public class CirkelTest {
    
    public CirkelTest() {
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
     * Test of area method, of class Cirkel.
     */
    @Test
    public void testArea() {
        System.out.println("area");
        Cirkel cirkelOmkrets = new Cirkel(4);
        double expResult = 0.0;
        double result = cirkelOmkrets.area();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of omkrets method, of class Cirkel.
     */
    @Test
    public void testOmkrets() {
        System.out.println("omkrets");
        Cirkel cirkelOmkrets = new Cirkel(4);
        double expResult = 0.0;
        double result = cirkelOmkrets.omkrets();
        assertEquals(expResult, result, 0.0);
        
    }
    
}
