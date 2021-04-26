/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import static org.junit.Assert.*;

/**
 *
 * @author Kalle
 */
public class CirkelSteps {

   
   
    private Cirkel cirkel;
    private double expectedArea;
    private double actualArea;
    private double expectedOmkrets;
    private double actualOmkrets;
    
    @Given("en cirkel med radius $radius")
    public void testObjekt(double radius){
       System.out.println("Test av cirkel");
       cirkel = new Cirkel(radius);
    }

   
    @When("cirkeln räknar ut area")
    public void testaArea(){
        actualArea = cirkel.area();
        System.out.println("När cirkeln har radie " + cirkel.radius);
    }
    
    @Then("borde arean vara $area")
    public void areanStämmer(double area){
        expectedArea = area;
        assertEquals(expectedArea, actualArea, 0.1);
        System.out.println("Då borde arean vara " + actualArea);
    }
    
    @When("cirkeln räknar ut omkrets")
    public void testOmkrets(){
        actualOmkrets = cirkel.omkrets();
        System.out.println("När cirkeln har radie " + cirkel.radius);
    }
    
    @Then("borde omkretsen vara $omkrets")
    public void omkretsenStämmer(double omkrets) {
        expectedOmkrets = omkrets;
        assertEquals(expectedOmkrets, actualOmkrets, 0.1);
        System.out.println("Då borde omkretsen vara" + actualOmkrets);
    }
}

