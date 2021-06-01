package Runner;




import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
			features= "D:\\Learning_Selenium\\Selenium_Workspace\\PathFactoryAutomationTest\\src\\test\\java\\features",
			glue="stepDefinition")

public class TestRunner {

	
	
}

