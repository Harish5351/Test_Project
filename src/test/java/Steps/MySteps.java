package Steps;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import Pages.WebPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.testproject.sdk.DriverBuilder;
import io.testproject.sdk.drivers.web.ChromeDriver;

public class MySteps {
	ChromeDriver driver = null;
	WebPage wp;
//	Actions act = new Actions(driver);
	
	public MySteps() throws Exception {
		driver = new DriverBuilder<ChromeDriver>(new ChromeOptions())
	            .withRemoteAddress(new URL("http://localhost:8585"))
	            .withToken("YC2s7fLolrsShl1gJd4_7jiC3zOzwvlFnT31m6Ui61o1").build(ChromeDriver.class);
	    final int timeout = 1500;
	    driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.MILLISECONDS);
	    driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	    
	    wp = new WebPage(driver);
	}
	
@Given("User navigate to the Login page")
public void user_navigate_to_the_login_page() {
	wp.typeMail();
	wp.typePassword();
}

@When("User perform a login")
public void user_perform_a_login() {
//    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//    driver.findElement(By.id("btnLogin")).click();
	wp.Do_login();
}

@Then("User should close the browser")
public void user_should_close_the_browser() {
    driver.quit();
}

@And("User hover over on Admin user and user management")
public void User_hover_over_on_Admin_user_and_user_management() {
	wp.hover_over();
}

@Then("User verifies user admin page")
public void User_verifies_user_admin_page() {
   wp.verify_Userpage();
}

}
