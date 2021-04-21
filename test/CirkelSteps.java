/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.security.InvalidAlgorithmParameterException;
import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import static org.junit.Assert.assertThat;

/**
 *
 * @author Kalle
 */
public class CirkelSteps {
    
   private Cirkel cirkel;
   
   public double omkretsen;
   
   
   @BeforeScenario
   public void ÅterStällaDiamtern(){
       omkretsen = 0;
   } 
    
   @Given("en Cirkel ")
   public void enCirkelsDiameter(){
       Cirkel cirkel;
       
       
       
   }
   
   @When("cirkeln har radius 3")
   public void radius(){
       
       Cirkel omkrets = new Cirkel(3);
       
       
       
       
       
       
       
   }
   
   @Then("borde return värdet vara $31.42")
   public void omkretsenStämmer(){
       
       double expResult = omkretsen;
       assertThat(omkretsen == 28.27);
   }
   
   
   
   
   
   
    
}
