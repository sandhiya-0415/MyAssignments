package week7.com.leaftaps.testcase;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features={"src/test/resources/TC001_createLead.feature"},glue= {"week7.com.leaftaps.pages"},monochrome=true
,publish=true)
public class TC001_CreateLead extends AbstractTestNGCucumberTests {

}
