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
 * @author denej
 */
public class TestAvObjekt {
    Cirkel cirkel;
    Triangel triangel;
    Rektangel rektangel;
    Paralellogram paralellogram;
    Kub kub;
    Kon kon;
    
    
    public TestAvObjekt() {
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
     * Testar metoder för area och omkrets på en cirkel med radie 3.
     */
    @Test
    public void testCirkel3() {
        System.out.println("\nTestar cirkel med radie 3");
        cirkel = new Cirkel(3);
        double expArea = 28.26;
        System.out.println("Förväntad area: " + expArea);
        double resultArea = cirkel.area();
        System.out.println("Faktiskt area: " + resultArea);
        assertEquals(expArea, resultArea, 0.0);
        
        double expOmk = 18.84;
        System.out.println("Förväntad omkrets: " + expOmk);
        double resultOmk = cirkel.omkrets();
        System.out.println("Faktisk omkrets: " + resultOmk);
        assertEquals(expOmk, resultOmk, 0.0);
    }

    /**
     * Testar metoder för area och omkrets på en cirkel med radie 1
     */
    @Test
    public void testCirkel1() {
        System.out.println("\nTestar cirkel med radie 1");
        cirkel = new Cirkel(1);
        double expArea = 3.14;
        System.out.println("Förväntad area: " + expArea);
        double resultArea = cirkel.area();
        System.out.println("Faktiskt area: " + resultArea);        
        assertEquals(expArea, resultArea, 0.0);
        
        double expOmk = 6.28;
        System.out.println("Förväntad omkrets: " + expOmk);
        double resultOmk = cirkel.omkrets();
        System.out.println("Faktisk omkrets: " + resultOmk);
        assertEquals(expOmk, resultOmk, 0.0);
    }

    /**
     * Testar metoder för area och omkrets på en cirkel med radie 1
     */
    @Test
    public void testCirkel2() {
        System.out.println("\nTestar cirkel med radie 2");
        cirkel = new Cirkel(2);
        double expArea = 12.56;
        System.out.println("Förväntad area: " + expArea);
        double resultArea = cirkel.area();
        System.out.println("Faktiskt area: " + resultArea);        
        assertEquals(expArea, resultArea, 0.0);
        
        double expOmk = 12.56;
        System.out.println("Förväntad omkrets: " + expOmk);
        double resultOmk = cirkel.omkrets();
        System.out.println("Faktisk omkrets: " + resultOmk);
        assertEquals(expOmk, resultOmk, 0.0);
    }
    
    /**
     * Testar metoder för area och omkrets på en triangel med basen 3 och höjden 2, samt övriga två sidor 3 och 4-
     */
    @Test
    public void testTriangel() {
        System.out.println("\nTestar en triangel med basen 3 och höjden 2 och där övriga sidor är 3 respektive 4");
        triangel = new Triangel(3, 2, 4, 2);
        double expArea = 3;
        System.out.println("Förväntad area: " + expArea);
        double resultArea = triangel.area();
        System.out.println("Faktiskt area: " + resultArea);        
        assertEquals(expArea, resultArea, 0.0);
        
        double expOmk = 9;
        System.out.println("Förväntad omkrets: " + expOmk);
        double resultOmk = triangel.omkrets();
        System.out.println("Faktisk omkrets: " + resultOmk);
        assertEquals(expOmk, resultOmk, 0.0);
    }
    
    /**
     * Testar metoder för area och omkrets på en triangel med basen 3 och höjden 2, samt övriga två sidor 3 och 4-
     */
    @Test
    public void testTriangel1() {
        System.out.println("\nTestar en triangel med basen 4 och höjden 3 och där övriga sidor är 5 respektive 3");
        triangel = new Triangel(4, 3, 5, 3);
        double expArea = 6;
        System.out.println("Förväntad area: " + expArea);
        double resultArea = triangel.area();
        System.out.println("Faktiskt area: " + resultArea);        
        assertEquals(expArea, resultArea, 0.0);
        
        double expOmk = 12;
        System.out.println("Förväntad omkrets: " + expOmk);
        double resultOmk = triangel.omkrets();
        System.out.println("Faktisk omkrets: " + resultOmk);
        assertEquals(expOmk, resultOmk, 0.0);
    }
    
    /**
     * Testar metoder för area och omkrets på en rektangel med längden 3 och höjden 2
     */
    @Test
    public void testRektangel1() {
        System.out.println("\nTestar en rektangel med längden 3 och höjden 2");
        rektangel = new Rektangel(3, 2);
        double expArea = 6;
        System.out.println("Förväntad area: " + expArea);
        double resultArea = rektangel.area();
        System.out.println("Faktiskt area: " + resultArea);        
        assertEquals(expArea, resultArea, 0.0);
        
        double expOmk = 10;
        System.out.println("Förväntad omkrets: " + expOmk);
        double resultOmk = rektangel.omkrets();
        System.out.println("Faktisk omkrets: " + resultOmk);
        assertEquals(expOmk, resultOmk, 0.0);
    }
    /**
     * Testar metoder för area och omkrets på en rektangel med längden 5 och höjden 3
     */
    @Test
    public void testRektangel2() {
        System.out.println("\nTestar en rektangel med längden 3 och höjden 2");
        rektangel = new Rektangel(5, 3);
        double expArea = 15;
        System.out.println("Förväntad area: " + expArea);
        double resultArea = rektangel.area();
        System.out.println("Faktiskt area: " + resultArea);        
        assertEquals(expArea, resultArea, 0.0);
        
        double expOmk = 16;
        System.out.println("Förväntad omkrets: " + expOmk);
        double resultOmk = rektangel.omkrets();
        System.out.println("Faktisk omkrets: " + resultOmk);
        assertEquals(expOmk, resultOmk, 0.0);
    }
    /**
     * Testar metoder för area och omkrets på ett paralellogram med basen 6, höjden 4 och sidan 4
     */
    @Test
    public void testParalell1() {
        System.out.println("\nTestar ett paralelllogram med basen 6, höjden 4 och sidan 4");
        paralellogram = new Paralellogram(6, 4, 4);
        double expArea = 24;
        System.out.println("Förväntad area: " + expArea);
        double resultArea = paralellogram.area();
        System.out.println("Faktiskt area: " + resultArea);        
        assertEquals(expArea, resultArea, 0.0);
        
        double expOmk = 20;
        System.out.println("Förväntad omkrets: " + expOmk);
        double resultOmk = paralellogram.omkrets();
        System.out.println("Faktisk omkrets: " + resultOmk);
        assertEquals(expOmk, resultOmk, 0.0);
    }
    /**
     * Testar metoder för area och omkrets på ett paralellogram med basen 8, höjden 3 och sidan 6
     */
    @Test
    public void testParalell2() {
        System.out.println("\nTestar ett paralelllogram med basen 8, höjden 3 och sidan 6");
        paralellogram = new Paralellogram(8, 3, 6);
        double expArea = 24;
        System.out.println("Förväntad area: " + expArea);
        double resultArea = paralellogram.area();
        System.out.println("Faktiskt area: " + resultArea);        
        assertEquals(expArea, resultArea, 0.0);
        
        double expOmk = 28;
        System.out.println("Förväntad omkrets: " + expOmk);
        double resultOmk = paralellogram.omkrets();
        System.out.println("Faktisk omkrets: " + resultOmk);
        assertEquals(expOmk, resultOmk, 0.0);
    }
    /**
     * Testar metoder för volym och mantelarea för en kub med sidan 5
     */
    @Test
    public void testKub1() {
        System.out.println("\nTestar en kub med sidan 5");
        kub = new Kub(5);
        double expArea = 125;
        System.out.println("Förväntad volym: " + expArea);
        double resultArea = kub.area();
        System.out.println("Faktiskt volym: " + resultArea);        
        assertEquals(expArea, resultArea, 0.0);
        
        double expOmk = 62500.0;
        System.out.println("Förväntad mantelarea: " + expOmk);
        double resultOmk = kub.omkrets();
        System.out.println("Faktisk mantelarea: " + resultOmk);
        assertEquals(expOmk, resultOmk, 0.0);
    }
    /**
     * Testar metoder för volym och mantelarea för en kub med sidan 8
     */
    @Test
    public void testKub2() {
        System.out.println("\nTestar en kub med sidan 8");
        kub = new Kub(8);
        double expArea = 512.0;
        System.out.println("Förväntad volym: " + expArea);
        double resultArea = kub.area();
        System.out.println("Faktiskt volym: " + resultArea);        
        assertEquals(expArea, resultArea, 0.0);
        
        double expOmk = 1048576.0;
        System.out.println("Förväntad mantelarea: " + expOmk);
        double resultOmk = kub.omkrets();
        System.out.println("Faktisk mantelarea: " + resultOmk);
        assertEquals(expOmk, resultOmk, 0.0);
    }
    /**
     * Testar metoder för volym och mantelarea för en kon med radie 3 och höjden 6
     */
    @Test
    public void testKon1() {
        System.out.println("\nTestar en kon med radie 3 och höjden 6");
        kon = new Kon(3, 6);
        double expSlantHeight = 6.708203932499369;
        System.out.println("Förväntad slanthöjd: " + expSlantHeight);
        double actualSlant = kon.slantHeight();
        assertEquals(expSlantHeight, actualSlant, 0.0);
        System.out.println("Faktisk slanthöjd: " + actualSlant);
        
        double expVolume = 56.52;       
        System.out.println("Förväntad volym: " + expVolume);
        double resultVolume = kon.volume();
        System.out.println("Faktiskt volym: " + resultVolume);        
        assertEquals(expVolume, resultVolume, 0.0);
        
        double expsurfaceArea = 91.45128104414405;
        System.out.println("Förväntad basytan: " + expsurfaceArea);
        double resultSurfaceArea = kon.surfaceArea();
        System.out.println("Faktisk basytan: " + resultSurfaceArea);
        assertEquals(expsurfaceArea, resultSurfaceArea, 0.0);
    }
    /**
     * Testar metoder för volym och mantelarea för en kon med radie 6 och höjden 8
     */
    @Test
    public void testKon2() {
        System.out.println("\nTestar en kon med radie 6 och höjden 8");
        kon = new Kon(6, 8);
        double expSlantHeight = 10;
        System.out.println("Förväntad slanthöjd: " + expSlantHeight);
        double actualSlant = kon.slantHeight();
        assertEquals(expSlantHeight, actualSlant, 0.0);
        System.out.println("Faktisk slanthöjd: " + actualSlant);
        
        double expvolume = 301.44;
        System.out.println("Förväntad volym: " + expvolume);
        double resultVolume = kon.volume();
        System.out.println("Faktiskt volym: " + resultVolume);        
        assertEquals(expvolume, resultVolume, 0.0);
        
        double expsurfaceArea = 301.44;
        System.out.println("Förväntad basytan: " + expsurfaceArea);
        double resultSurfaceArea = kon.surfaceArea();
        System.out.println("Faktisk basytan: " + resultSurfaceArea);
        assertEquals(expsurfaceArea, resultSurfaceArea, 0.0);
    }
}
