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
   

    /**
     * Test of volume method, of class Kon.
     */
    @Test
    public void testVolume() {
        System.out.println("testVolum");
        Kon testKon = new Kon(2, 4);
        float expResult = 16.75514793395996F;
        float result = testKon.volume();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of slantHeight method, of class Kon.
     */
    @Test
    public void testSlantHeight() {
        System.out.println("slantHeight");
        Kon testKon = new Kon(2, 4);
        float expResult = 4.4721360206604F;
        float result = testKon.slantHeight();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of surfaceArea method, of class Kon.
     */
    @Test
    public void testSurfaceArea() {
        System.out.println("surfaceArea");
        Kon testkon = new Kon(2, 4);
        float expResult = 40.66559600830078F;
        float result = testkon.surfaceArea();
        assertEquals(expResult, result, 0.0);
        
    }

    
}
