
import org.jbehave.core.annotations.AfterScenario;
import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import static org.junit.Assert.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author denej
 */
public class KonSteps {
    private Kon kon;
    private double expectedSidhöjd;
    private double actualSidhöjd;
    private double expectedVolume;
    private double actualVolume;
    private double expectedMantelarea;
    private double actualMantelarea;
   
   //public double omkretsen;
   
   
   @BeforeScenario
   public void utskrift(){
       System.out.println("Nytt scenario");
   }
   @AfterScenario
   public void utskriftEfter() {
       System.out.println("Avslutar test");
   }
    
   @Given("en kon")
   public void testObjekt(){
       System.out.println("Test av kon");
   }

   
    @When("radie är $radius och höjden är $höjd")
    public void radius(double radius, double höjd){
        kon = new Kon(radius, höjd);
        actualSidhöjd = kon.slantHeight();
        actualVolume = kon.volume();
        actualMantelarea = kon.surfaceArea();
        System.out.println("När konen har radien " + radius + " och höjden " + höjd);
    }
             
   @Then("sidhöj borde vara $sidhöjd och volym $volym och mantelarean är $mantelarea")
   public void omkretsenStämmer(double sidhöjd, double volym, double mantelarea){
        expectedSidhöjd = sidhöjd;
        expectedVolume = volym;
        expectedMantelarea = mantelarea;
        assertEquals(expectedSidhöjd, actualSidhöjd, 0.0);
        assertEquals(expectedVolume, actualVolume, 0.0);
        assertEquals(expectedMantelarea, actualMantelarea, 0.0);
        System.out.println("Då borde sidhöjden vara " + actualSidhöjd + ", volymen " + actualVolume + " och mantelarean " + actualMantelarea);
        //double expResult = omkretsen;
        //assertEquals(expected, );
    }
}   
 

