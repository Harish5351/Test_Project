package Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//import org.junit.runner.RunWith;

//@RunWith(Cucumber.class)
@CucumberOptions(features={"src\\test\\java\\Features\\MobileTest.feature"},
glue={"Steps"},
plugin={"io.testproject.sdk.internal.reporting.extensions.cucumber.CucumberReporter"})
//plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class TestRunnerMob extends AbstractTestNGCucumberTests {
	
}
