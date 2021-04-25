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
        double expSlantHeight = 6.708203932499369;
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
        double expVolume = 56.52;
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
        double expSurfaceArea = 91.45128104414405;
        System.out.println("Förväntad basyta: " + expSurfaceArea);
        double result = kon.surfaceArea();
        System.out.println("Faktisk basytan: " + result);
        assertEquals(expSurfaceArea, result, 0.0);
        
    }
    
    @Test
    public void testSlantHeight1() {
        System.out.println("\nslantHeight");
        kon = new Kon(6, 8);
        double expSlantHeight = 10.0;
        System.out.println("Förväntad slanthöjd: " + expSlantHeight);
        double resultSlantHeight = kon.slantHeight();
        System.out.println("Faktisk slanthöjd: " + resultSlantHeight);
        assertEquals(expSlantHeight, resultSlantHeight, 0.0);
        
        
    }

    /**
     * Test of volume method, of class Kon.
     */
    @Test
    public void testVolume1() {
        System.out.println("\nvolume");
        kon  = new Kon(6, 8);
        double expVolume = 301.44;
        System.out.println("Förväntad volym: " + expVolume);
        double resultVolume = kon.volume();
        System.out.println("Faktiskt volym: " + resultVolume);
        assertEquals(expVolume, resultVolume, 0.0);
        
        
    }

    /**
     * Test of surfaceArea method, of class Kon.
     */
    @Test
    public void testSurfaceArea1() {
        System.out.println("\nsurfaceArea");
        kon = new Kon(6, 8);
        double expSurfaceArea = 301.44;
        System.out.println("Förväntad basyta: " + expSurfaceArea);
        double result = kon.surfaceArea();
        System.out.println("Faktisk basytan: " + result);
        assertEquals(expSurfaceArea, result, 0.0);
        
    }
    
    
}
