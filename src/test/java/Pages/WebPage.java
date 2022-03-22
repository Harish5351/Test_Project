package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


import io.appium.java_client.MobileElement;
import io.testproject.sdk.drivers.web.ChromeDriver;

public class WebPage {
	ChromeDriver driver;
	
	public WebPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	
	public void typeMail() {
//		((MobileElement) driver.findElement(Num1)).click();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		Num1.click();
	}
	
	public void typePassword() {
//		((MobileElement)driver.findElement(add)).click();
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//		operator.click();
	}
	
	public void Do_login() {
//		((MobileElement)driver.findElement(Num2)).click();
		 driver.findElement(By.id("btnLogin")).click();
//		Num2.click();
	}
	
	public void hover_over() {
		Actions act = new Actions(driver);
//		driver.findElement(By.id("menu_admin_viewAdminModule"));
		act.moveToElement(driver.findElement(By.id("menu_admin_viewAdminModule"))).build().perform();;
		act.moveToElement(driver.findElement(By.id("menu_admin_UserManagement"))).build().perform();;
		act.moveToElement(driver.findElement(By.id("menu_admin_viewSystemUsers"))).build().perform();
//		act.moveToElement(driver.findElement(By.id("menu_admin_viewSystemUsers"))).click(driver.findElement(By.id("menu_admin_viewSystemUsers")));
		driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void verify_Userpage() {
		String URL = driver.getCurrentUrl();
		System.out.println("Your URL is: "+URL);
		Assert.assertEquals("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers", URL);
	}
	
}
