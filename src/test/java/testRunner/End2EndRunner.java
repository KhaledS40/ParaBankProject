package testRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/resources/featureFiles", glue = {
        "stepDefinitions"}, monochrome = true, plugin = { "pretty",
        "html:target/cucumber-report" }, tags = "@end2end")
public class End2EndRunner extends AbstractTestNGCucumberTests {
}
