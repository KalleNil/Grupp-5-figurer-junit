/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author denej
 */
public class TriangelTest {
    
    public TriangelTest() {
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
     * Test of area method, of class Triangel.
     */
    @Test
    public void testArea() {
        System.out.println("area");
        double len = 0.0;
        double height = 0.0;
        Triangel instance = null;
        double expResult = 0.0;
        double result = instance.area(len, height);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of omkrets method, of class Triangel.
     */
    @Test
    public void testOmkrets() {
        System.out.println("omkrets");
        double len = 0.0;
        double height = 0.0;
        Triangel instance = null;
        double expResult = 0.0;
        double result = instance.omkrets(len, height);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
