/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
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
public class CirkelIT extends JUnitStory {
    Cirkel cirkel;
    @Override
    public Configuration configuration() {
         return new MostUsefulConfiguration()
                 .useStoryLoader(new LoadFromClasspath(this.getClass()));
                 //.useStoryReporterBuilder(new StoryReporterBuilder.withFormats(Format.CONSOLE, Format.TXT));
    }
    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(), new CirkelSteps());
    }
    double test;
    public CirkelIT() {
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
     * Test of area method, of class Cirkel.
     */
    @Test
    public void testArea() {
        System.out.println("Testar area");
        Cirkel instance = new Cirkel(test);
        double expResult = (3.14 * (test * test));
        double result = instance.area();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of omkrets method, of class Cirkel.
     */
    @Test
    public void testOmkrets() {
        System.out.println("Testar omkrets");
        Cirkel instance = new Cirkel(test);
        double expResult = (2 * 3.14 * test);
        double result = instance.omkrets();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
