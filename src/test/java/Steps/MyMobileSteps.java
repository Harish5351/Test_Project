package Steps;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import Pages.MobilePage;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.testproject.sdk.DriverBuilder;
import io.testproject.sdk.drivers.android.AndroidDriver;
import io.testproject.sdk.drivers.web.ChromeDriver;
import io.testproject.sdk.internal.exceptions.AgentConnectException;
import io.testproject.sdk.internal.exceptions.InvalidTokenException;
import io.testproject.sdk.internal.exceptions.ObsoleteVersionException;

public class MyMobileSteps {
	AndroidDriver driver;
	MobilePage mp;
	public MyMobileSteps() throws Exception, Exception, InvalidTokenException, ObsoleteVersionException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Galaxy J6");
		cap.setCapability("udid", "32001d8deeff452d");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		cap.setCapability("appPackage", "calculator.innovit.com.calculatrice");
		cap.setCapability("appActivity", "calculator.innovit.com.calculatrice.MainActivity");
		
		driver = new AndroidDriver<MobileElement>("myn_eHPuGy02Nf-zJ3haXcauIVAzV6eJMao4X6ZB-k0", cap);
		mp = new MobilePage(driver);
//		driver = new AndroidDriver("myn_eHPuGy02Nf-zJ3haXcauIVAzV6eJMao4X6ZB-k0", cap);
	}
@Given("User on calculator app")
public void User_on_calculator_app() throws Exception {
	System.out.println("You are in App");
}

@When("User taps on N1 {string}")
public void user_taps_on_n1(String num1) {
//	MobileElement N1 = (MobileElement) driver.findElement(By.xpath("//android.widget.Button[@text='2']"));
//	N1.click();
	mp.EnterNumberN1(num1);
}

@And("User taps on operator")
public void User_taps_on_operator() {
//	MobileElement add = (MobileElement) driver.findElement(By.xpath("//android.widget.Button[@text='+']"));
//	add.click();
	mp.EnterOperator();
}

@And("User taps on N2 {string}")
public void User_taps_on_N2(String num2) {
//	MobileElement N2 = (MobileElement) driver.findElement(By.xpath("//android.widget.Button[@text='3']"));
//	N2.click();
	mp.EnterNumberN2(num2);
}

@Then("User validate answer {string}")
public void user_validate_answer(String ans) {
//	MobileElement Equal = (MobileElement) driver.findElement(By.xpath("//android.widget.Button[@text='=']"));
//	Equal.click();
	mp.ValidateAnswer(ans);
	
	driver.quit();
}


}
