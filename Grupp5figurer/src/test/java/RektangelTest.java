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
public class RektangelTest {
    
   
    /**
     * Test of area method, of class Rektangel.
     */
    @Test
    public void testArea() {
        Rektangel testangel = new Rektangel(2, 1);
        double expected = 2;
        double result = testangel.area(2, 1);
        assertEquals(expected, result, 0);
    }

    /**
     * Test of omkrets method, of class Rektangel.
     */
    @Test
    public void testOmkrets() {
    	Rektangel testangel = new Rektangel(2, 1);
        double expected = 6;
        double result = testangel.omkrets(2, 1);
        assertEquals(expected, result, 0);
    }
    
}
