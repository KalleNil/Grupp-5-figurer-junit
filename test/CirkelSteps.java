/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.jbehave.core.annotations.Given;

/**
 *
 * @author Kalle
 */
public class CirkelSteps {
    
   private Cirkel cirkel;
   
   private Omkrets omkrets;
    
   @Given("en $cirkel")
   public void aCirkel(Cirkel cirkel){
       cirkelOmkretsen = cirkel.omkrets();
       
   }
   
   
   
    
}
