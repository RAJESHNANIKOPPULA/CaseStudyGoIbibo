package testRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//import org.junit.runner.RunWith;
//import io.cucumber.junit.CucumberOptions;
//import io.cucumber.junit.Cucumber;

@CucumberOptions(features=".//Features//Goibiboflight.feature",
glue="stepDefinitions",
dryRun=false,
monochrome=false,
plugin={"pretty","html:target/test-outputLogin.html"}
)
public class RunTest extends AbstractTestNGCucumberTests{

}
