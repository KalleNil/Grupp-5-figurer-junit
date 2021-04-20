/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 *
 * @author denej
 */
public class ParalellogramTest {
    
    
    /**
     * Test of area method, of class Paralellogram.
     */
    @Test
    public void testArea() {
        Paralellogram testogram = new Paralellogram(2,1);
        double expected = 2;
        double result = testogram.area(2, 1);
        assertEquals(expected, result, 0);
    }

    /**
     * Test of omkrets method, of class Paralellogram.
     */
    @Test
    public void testOmkrets() {
    	Paralellogram testogram = new Paralellogram(2,1);
        double expected = 6;
        double result = testogram.omkrets(2, 1);
        assertEquals(expected, result, 0);
    }
}
