package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.testproject.sdk.drivers.android.AndroidDriver;

public class MobilePage {
	AndroidDriver driver;
	
	public MobilePage(AndroidDriver driver) {
		this.driver = driver;
	}
	
//	@AndroidFindBy(xpath="//android.widget.Button[@text='2']")
//	MobileElement Num1;
//	
//	@AndroidFindBy(xpath="//android.widget.Button[@text='+']")
//	MobileElement operator;
//	
//	@AndroidFindBy(xpath="//android.widget.Button[@text='3']")
//	MobileElement Num2;
//	
//	@AndroidFindBy(xpath="//android.widget.Button[@text='=']")
//	MobileElement Equal;
//	
//	@AndroidFindBy(xpath="//android.widget.Button[@text='5']")
//	MobileElement Ans;
	
//	By Num1 = By.xpath("//android.widget.Button[@text='2']");
//	By add = By.xpath("//android.widget.Button[@text='+']");
//	By Num2 = By.xpath("//android.widget.Button[@text='3']");
//	By Equal = By.xpath("//android.widget.Button[@text='=']");
//	By Result = By.xpath("//android.widget.TextView[@text='9']");
	
	
	public void EnterNumberN1(String num1) {
//		((MobileElement) driver.findElement(Num1)).click();
		((MobileElement) driver.findElement(By.xpath("//android.widget.Button[@text='"+num1+"']"))).click();
//		Num1.click();
	}
	
	public void EnterOperator() {
//		((MobileElement)driver.findElement(add)).click();
		((MobileElement) driver.findElement(By.xpath("//android.widget.Button[@text='+']"))).click();
//		operator.click();
	}
	
	public void EnterNumberN2(String num2) {
//		((MobileElement)driver.findElement(Num2)).click();
		((MobileElement) driver.findElement(By.xpath("//android.widget.Button[@text='"+num2+"']"))).click();
//		Num2.click();
	}
	
	public void ValidateAnswer(String ans) {
//		((MobileElement)driver.findElement(Equal)).click();
		((MobileElement) driver.findElement(By.xpath("//android.widget.Button[@text='=']"))).click();
//		Equal.click();
		String Text = ((MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='"+ans+"']"))).getText();
		System.out.println("Answer is: " +Text);
		Assert.assertEquals(Text, "9");
	}
	
}
