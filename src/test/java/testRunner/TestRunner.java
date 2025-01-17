package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/featureFiles", glue = {
		"src/test/java/stepDefintions" }, monochrome = true, plugin = { "pretty",
				"html:target/cucumber-report" }, tags = " @registration")
public class TestRunner {

}
