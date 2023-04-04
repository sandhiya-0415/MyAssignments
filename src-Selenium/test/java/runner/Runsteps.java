package runner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features= {"src/test/java/feature/createLead.feature"},
glue= {"steps"},
monochrome=true,
tags="@unit or @Negative")
public class Runsteps extends AbstractTestNGCucumberTests {

}
