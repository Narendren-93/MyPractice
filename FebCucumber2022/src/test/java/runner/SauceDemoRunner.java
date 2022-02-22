package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "E:/Eclipse Workspace/FebCucumber2022/src/test/resources/featureFile/SauceDemo.feature", 
		glue = "stepDefinition", 
		dryRun = false, 
		plugin = {"html:html_output/out.html" }
				
				)

public class SauceDemoRunner {

}
