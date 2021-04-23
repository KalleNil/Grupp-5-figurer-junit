/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

/**
 *
 * @author denej
 */
public class KonIT extends JUnitStory {
    @Override
    public Configuration configuration() {
         return new MostUsefulConfiguration().useStoryLoader(new LoadFromClasspath(this.getClass()));
    //.useStoryReporterBuilder(new StoryReporterBuilder.withFormats(Format.CONSOLE, Format.TXT));
    }
    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(), new KonSteps());
    }
    double radius;
    double höjd;
    double slant_height;
    final double pi= 3.14;
   
    
     //Räkna konens sida "slant height" med s = math.sqrt (r^2 + h^2)
     //Använder pythagoras sats 
     public double slantHeight() {
         //Konvertera Math.sqrt till float (float) Math.sqrt
         return slant_height = (double) Math.sqrt(radius * radius + höjd * höjd);
     }
    
     
     //Räkna ut volym på konen volym = 1/3 (pi * r * r * h)
     public double volume() {
        
         return 1 / 3 * (pi * höjd * radius * radius);
     }
     
     
     //Räkna ytan av konen med pi * r * s + pi * r^2
     public double surfaceArea() {
        
        return pi * radius * slant_height  + pi * radius * radius;   
     }

}
