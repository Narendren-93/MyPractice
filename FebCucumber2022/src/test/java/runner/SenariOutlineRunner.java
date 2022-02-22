package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "E:/Eclipse Workspace/FebCucumber2022/src/test/resources/featureFile/ScenarioOutline.feature",
		glue = "stepDefinition",
		dryRun=false,
		plugin = {"html:HTML_OUTPUT/scenarioOutline.html" }
		
		)

public class SenariOutlineRunner {

}
