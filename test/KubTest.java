/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author denej
 */
public class KubTest {
    
    public KubTest() {
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
     * Test of volym method, of class Kub.
     */
    @Test
    public void testVolym() {
        System.out.println("volym");
        double len = 0.0;
        double height = 0.0;
        double width = 0.0;
        Kub instance = null;
        double expResult = 0.0;
        double result = instance.volym(len, height, width);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mantelarea method, of class Kub.
     */
    @Test
    public void testMantelarea() {
        System.out.println("mantelarea");
        double len = 0.0;
        double height = 0.0;
        double width = 0.0;
        Kub instance = null;
        double expResult = 0.0;
        double result = instance.mantelarea(len, height, width);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
