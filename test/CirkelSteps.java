/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import org.jbehave.core.annotations.AfterScenario;
import org.jbehave.core.annotations.BeforeScenario;
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
   
   //public double omkretsen;
   
   
   @BeforeScenario
   public void utskrift(){
       System.out.println("Nytt Scenario");
   }
   @AfterScenario
   public void utskriftEfter() {
       System.out.println("Avslutar test");
   }
    
   @Given("en cirkel")
   public void testObjekt(){
       System.out.println("Test av cirkel");
   }

   
    @When("cirkeln har radius $radius")
    public void radius(double radius){
        this.cirkel = new Cirkel(radius);
        actualArea = cirkel.area();
        actualOmkrets = cirkel.omkrets();
        System.out.println("När cirkeln har radie " + radius);
    }
             
   @Then("arean borde vara $area och omkretsen $omkrets")
   public void omkretsenStämmer(double area, double omkrets){
        expectedArea = area;
        expectedOmkrets = omkrets;
        assertEquals(expectedArea, actualArea, 0.1);
        assertEquals(expectedOmkrets, actualOmkrets, 0.1);
        System.out.println("Då borde arean vara " + actualArea + " och omkretsen " + actualOmkrets);
        //double expResult = omkretsen;
        //assertEquals(expected, );
    }
}   
