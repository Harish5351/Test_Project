package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//import org.junit.runner.RunWith;

//import io.cucumber.testng.*;
import io.cucumber.testng.CucumberOptions;


//@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/java/Features/WebTest.feature"},
glue={"Steps"},
plugin={"io.testproject.sdk.internal.reporting.extensions.cucumber.CucumberReporter"})
//plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class TestRunner extends AbstractTestNGCucumberTests {
	
}
