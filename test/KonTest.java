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
    Kon kon;
    
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
        System.out.println("\nslantHeight");
        kon = new Kon(3, 6);
        double expSlantHeight = 7.0;
        System.out.println("Förväntad slanthöjd: " + expSlantHeight);
        double resultSlantHeight = kon.slantHeight();
        System.out.println("Faktisk slanthöjd: " + resultSlantHeight);
        assertEquals(expSlantHeight, resultSlantHeight, 0.0);
        
        
    }

    /**
     * Test of volume method, of class Kon.
     */
    @Test
    public void testVolume() {
        System.out.println("\nvolume");
        kon  = new Kon(3, 6);
        double expVolume = 55.56;
        System.out.println("Förväntad volym: " + expVolume);
        double resultVolume = kon.volume();
        System.out.println("Faktiskt volym: " + resultVolume);
        assertEquals(expVolume, resultVolume, 0.0);
        
        
    }

    /**
     * Test of surfaceArea method, of class Kon.
     */
    @Test
    public void testSurfaceArea() {
        System.out.println("\nsurfaceArea");
        kon = new Kon(3, 6);
        double expSurfaceArea = 90.90;
        System.out.println("Förväntad slanthöjd: " + expSurfaceArea);
        double result = kon.surfaceArea();
        System.out.println("Faktisk basytan: " + result);
        assertEquals(expSurfaceArea, result, 0.0);
        
    }
    
}
