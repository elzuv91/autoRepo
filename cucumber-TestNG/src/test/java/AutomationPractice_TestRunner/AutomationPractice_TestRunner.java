package AutomationPractice_TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features ="features",
		glue= "AutomationPractice_StepDefinitions",
		plugin= {"pretty",
						"json:target/json-reports/cucumber.json",
						"html:target/cucumber-reports/cucumber.html",
						"junit:target/cucumber-reports/cucumber.xml"
						},
		monochrome = true,
		tags = "@H2"
		)
public class AutomationPractice_TestRunner extends AbstractTestNGCucumberTests {
 
}




