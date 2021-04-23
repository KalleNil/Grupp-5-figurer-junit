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
        System.out.println("Testar cirkel med radie 3");
        cirkel = new Cirkel(3);
        double expArea = 28.26;
        System.out.println("Förväntad area: " + expArea);
        double result = cirkel.area();
        System.out.println("Faktiskt area: " + result);
        assertEquals(expArea, result, 0.0);
        double expOmk = 18.84;
        System.out.println("Förväntad omkrets: " + expOmk);
        double result2 = cirkel.omkrets();
        System.out.println("Faktisk omkrets: " + result2);
        assertEquals(expOmk, result2, 0.0);
    }

    /**
     * Testar metoder för area och omkrets på en cirkel med radie 1
     */
    @Test
    public void testCirkel1() {
        System.out.println("Testar cirkel med radie 3");
        cirkel = new Cirkel(1);
        double expArea = 3.14;
        System.out.println("Förväntad area: " + expArea);
        double result = cirkel.area();
        System.out.println("Faktiskt area: " + result);        
        assertEquals(expArea, result, 0.0);
        double expOmk = 6.28;
        System.out.println("Förväntad omkrets: " + expOmk);
        double result2 = cirkel.omkrets();
        System.out.println("Faktisk omkrets: " + result2);
        assertEquals(expOmk, result2, 0.0);
    }

    /**
     * Testar metoder för area och omkrets på en cirkel med radie 1
     */
    @Test
    public void testCirkel2() {
        System.out.println("Testar cirkel med radie 2");
        cirkel = new Cirkel(2);
        double expArea = 12.56;
        System.out.println("Förväntad area: " + expArea);
        double result = cirkel.area();
        System.out.println("Faktiskt area: " + result);        
        assertEquals(expArea, result, 0.0);
        double expOmk = 12.56;
        System.out.println("Förväntad omkrets: " + expOmk);
        double result2 = cirkel.omkrets();
        System.out.println("Faktisk omkrets: " + result2);
        assertEquals(expOmk, result2, 0.0);
    }
    
    /**
     * Testar metoder för area och omkrets på en triangel med basen 3 och höjden 2, samt övriga två sidor 3 och 4-
     */
    @Test
    public void testTriangel() {
        System.out.println("Testar em triangel med basen 3 och höjden 2 och där övriga sidor är 3 respektive 4");
        triangel = new Triangel(3, 2, 4, 2);
        double expArea = 3;
        System.out.println("Förväntad area: " + expArea);
        double result = triangel.area();
        System.out.println("Faktiskt area: " + result);        
        assertEquals(expArea, result, 0.0);
        double expOmk = 9;
        System.out.println("Förväntad omkrets: " + expOmk);
        double result2 = triangel.omkrets();
        System.out.println("Faktisk omkrets: " + result2);
        assertEquals(expOmk, result2, 0.0);
    }
    
    /**
     * Testar metoder för area och omkrets på en rektangel med längden 3 och höjden 2
     */
    @Test
    public void testRektangel1() {
        System.out.println("Testar en rektangel med längden 3 och höjden 2");
        rektangel = new Rektangel(3, 2);
        double expArea = 6;
        System.out.println("Förväntad area: " + expArea);
        double result = rektangel.area();
        System.out.println("Faktiskt area: " + result);        
        assertEquals(expArea, result, 0.0);
        double expOmk = 10;
        System.out.println("Förväntad omkrets: " + expOmk);
        double result2 = rektangel.omkrets();
        System.out.println("Faktisk omkrets: " + result2);
        assertEquals(expOmk, result2, 0.0);
    }
    /**
     * Testar metoder för area och omkrets på en rektangel med längden 5 och höjden 3
     */
    @Test
    public void testRektangel2() {
        System.out.println("Testar en rektangel med längden 3 och höjden 2");
        rektangel = new Rektangel(5, 3);
        double expArea = 15;
        System.out.println("Förväntad area: " + expArea);
        double result = rektangel.area();
        System.out.println("Faktiskt area: " + result);        
        assertEquals(expArea, result, 0.0);
        double expOmk = 16;
        System.out.println("Förväntad omkrets: " + expOmk);
        double result2 = rektangel.omkrets();
        System.out.println("Faktisk omkrets: " + result2);
        assertEquals(expOmk, result2, 0.0);
    }
    /**
     * Testar metoder för area och omkrets på ett paralellogram med basen 6, höjden 4 och sidan 4
     */
    @Test
    public void testParalell1() {
        System.out.println("Testar ett paralelllogram med basen 6, höjden 4 och sidan 4");
        paralellogram = new Paralellogram(6, 4, 4);
        double expArea = 24;
        System.out.println("Förväntad area: " + expArea);
        double result = paralellogram.area();
        System.out.println("Faktiskt area: " + result);        
        assertEquals(expArea, result, 0.0);
        double expOmk = 20;
        System.out.println("Förväntad omkrets: " + expOmk);
        double result2 = paralellogram.omkrets();
        System.out.println("Faktisk omkrets: " + result2);
        assertEquals(expOmk, result2, 0.0);
    }
    /**
     * Testar metoder för area och omkrets på ett paralellogram med basen 8, höjden 3 och sidan 6
     */
    @Test
    public void testParalell2() {
        System.out.println("Testar ett paralelllogram med basen 8, höjden 3 och sidan 6");
        paralellogram = new Paralellogram(8, 3, 6);
        double expArea = 24;
        System.out.println("Förväntad area: " + expArea);
        double result = paralellogram.area();
        System.out.println("Faktiskt area: " + result);        
        assertEquals(expArea, result, 0.0);
        double expOmk = 28;
        System.out.println("Förväntad omkrets: " + expOmk);
        double result2 = paralellogram.omkrets();
        System.out.println("Faktisk omkrets: " + result2);
        assertEquals(expOmk, result2, 0.0);
    }
    /**
     * Testar metoder för volym och mantelarea för en kub med sidan 5
     */
    @Test
    public void kub1() {
        System.out.println("Testar en kub med sidan 5");
        kub = new Kub(5);
        double expArea = 125;
        System.out.println("Förväntad volym: " + expArea);
        double result = kub.area();
        System.out.println("Faktiskt volym: " + result);        
        assertEquals(expArea, result, 0.0);
        double expOmk = 500;
        System.out.println("Förväntad mantelarea: " + expOmk);
        double result2 = kub.omkrets();
        System.out.println("Faktisk mantelarea: " + result2);
        assertEquals(expOmk, result2, 0.0);
    }
    /**
     * Testar metoder för volym och mantelarea för en kub med sidan 8
     */
    @Test
    public void kub2() {
        System.out.println("Testar en kub med sidan 5");
        kub = new Kub(8);
        double expArea = 125;
        System.out.println("Förväntad volym: " + expArea);
        double result = kub.area();
        System.out.println("Faktiskt volym: " + result);        
        assertEquals(expArea, result, 0.0);
        double expOmk = 2048;
        System.out.println("Förväntad mantelarea: " + expOmk);
        double result2 = kub.omkrets();
        System.out.println("Faktisk mantelarea: " + result2);
        assertEquals(expOmk, result2, 0.0);
    }
    /**
     * Testar metoder för volym och mantelarea för en kon med radie 3 och höjden 6
     */
    @Test
    public void kon1() {
        System.out.println("Testar en kon med radie 3 och höjden 6");
        kon = new Kon(3, 6);
        double expSlantHeight = 6.708;
        System.out.println("Förväntad slanthöjd: " + expSlantHeight);
        double actualSlant = kon.slant_height;
        assertEquals(expSlantHeight, actualSlant, 0.1);
        System.out.println("Faktisk slanthöjd: " + actualSlant);
        double expArea = 56.52;
        System.out.println("Förväntad volym: " + expArea);
        double result = kon.volume();
        System.out.println("Faktiskt volym: " + result);        
        assertEquals(expArea, result, 0.0);
        double expOmk = 10648.37;
        System.out.println("Förväntad mantelarea: " + expOmk);
        double result2 = kon.surfaceArea();
        System.out.println("Faktisk mantelarea: " + result2);
        assertEquals(expOmk, result2, 0.0);
    }
    /**
     * Testar metoder för volym och mantelarea för en kon med radie 3 och höjden 6
     */
    @Test
    public void kon2() {
        System.out.println("Testar en kon med radie 3 och höjden 6");
        kon = new Kon(6, 8);
        double expSlantHeight = 10;
        System.out.println("Förväntad slanthöjd: " + expSlantHeight);
        double actualSlant = kon.slant_height;
        assertEquals(expSlantHeight, actualSlant, 0.1);
        System.out.println("Faktisk slanthöjd: " + actualSlant);
        double expArea = 301.44;
        System.out.println("Förväntad volym: " + expArea);
        double result = kon.volume();
        System.out.println("Faktiskt volym: " + result);        
        assertEquals(expArea, result, 0.0);
        double expOmk = 155466.17;
        System.out.println("Förväntad mantelarea: " + expOmk);
        double result2 = kon.surfaceArea();
        System.out.println("Faktisk mantelarea: " + result2);
        assertEquals(expOmk, result2, 0.0);
    }
}
