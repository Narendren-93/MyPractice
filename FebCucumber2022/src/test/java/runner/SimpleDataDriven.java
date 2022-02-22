package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:/Eclipse Workspace/FebCucumber2022/src/test/resources/featureFile/SimpleDataDriven.feature",
		glue = "stepDefinition",
		dryRun=false,
		plugin = {"html:HTML_OUTPUT/opsdd.html", }
		)

public class SimpleDataDriven {

}
