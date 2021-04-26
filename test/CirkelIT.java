import com.thoughtworks.paranamer.BytecodeReadingParanamer;
import com.thoughtworks.paranamer.CachingParanamer;
import com.thoughtworks.paranamer.Paranamer;
import java.text.SimpleDateFormat;
import static java.util.Arrays.asList;
import java.util.List;
import java.util.Properties;
import org.jbehave.core.Embeddable;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.CodeLocations;
import static org.jbehave.core.io.CodeLocations.codeLocationFromClass;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.io.UnderscoredCamelCaseResolver;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.reporters.FilePrintStreamFactory;
import static org.jbehave.core.reporters.Format.CONSOLE;
import static org.jbehave.core.reporters.Format.HTML;
import static org.jbehave.core.reporters.Format.TXT;
import static org.jbehave.core.reporters.Format.XML;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.ParameterConverters;
import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.jbehave.core.steps.ParameterConverters.DateConverter;
import org.jbehave.core.steps.SilentStepMonitor;

/**
 *
 * @author denej
 */
public class CirkelIT extends JUnitStory {
    //Paranamerer är ett ramverk för att komma åt parametrar
    private static Paranamer paranamer = new CachingParanamer(new BytecodeReadingParanamer());
    
    //Initierar ett objekt av Java-filen CirkelSteps som omvandlar cirkel_i_t.story till faktisk testmetod
    private final CirkelSteps steps;

    
    //Konstruktor
    public CirkelIT(){
        steps = new CirkelSteps();
    }
    
    //Konfiguration av JBehave
    @Override
    public Configuration configuration() {
        Class<? extends Embeddable> embeddableClass = this.getClass(); //Hänvisar att det är den här klassen som är Embedabble för testen
        Properties viewResources = new Properties(); //Inställningar för output
        viewResources.put("decorateNonHtml", "true"); //även här
        return new MostUsefulConfiguration()
            .useParanamer(paranamer) //Scanner för att läsa story
            .useStoryLoader(new LoadFromClasspath(embeddableClass)) //Vad som ska läsa storyn
            .useStoryPathResolver(new UnderscoredCamelCaseResolver().removeFromClassName("Story")) //Säger sig självt
            .useStoryReporterBuilder(new StoryReporterBuilder() // Konfiguration av reports efter tester
                    .withCodeLocation(CodeLocations.codeLocationFromClass(embeddableClass)) //Visar vart testet är gjort
                    .withDefaultFormats() //Hur raden ovanför ska formateras
                    .withPathResolver(new FilePrintStreamFactory.ResolveToPackagedName()) //Drar alla paths till .story 
                    .withViewResources(viewResources) //hämtar från rad 57
                    .withFormats(CONSOLE, TXT, HTML, XML)) //Vilka outputs vi vill ha
            .useParameterConverters(new ParameterConverters() //Som namnet säger, konverterar parametrar under testfallen
                    .addConverters(new ParameterConverters.NumberConverter(), new DateConverter(new SimpleDateFormat("yyyy-MM-dd")))). //Loggar vår data
            useStepMonitor(new SilentStepMonitor()); //Loggar våra steps
    }

protected List<String> storyPaths() { //Söker igenom systemet efter .story filer och returnerar handlingen i en lista
        return new StoryFinder().findPaths(codeLocationFromClass(this.getClass()).getFile(),
                asList("**/*.story"), asList(""));
    }

@Override
    public List<CandidateSteps> candidateSteps() { //Gör så att paranamer skapar steg i loggen efter läst CirkelSteps annotationer
        return new InstanceStepsFactory(configuration(), steps
        ).createCandidateSteps();
    }
}
