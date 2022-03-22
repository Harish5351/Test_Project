# Test_Project
// Use Java JDK-11, Currently, this jdk-11 supports to test project.
// Latest one doesn't support

// Use maven repository of test project
e.g.
		<dependency>
			<groupId>io.testproject</groupId>
			<artifactId>java-sdk</artifactId>
			<version>1.3.0-RELEASE</version>
			<scope>test</scope>
		</dependency>
<----------------Mobile--------------------->		
Use Android Driver : Import from io.sdk.testproject
AndroidDriver driver = new AndroidDriver();

//This set desired capabilities of mobile device

Add Desired Capabilities like we do for AppiumDriver
e.g. DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Your Device Name");
		cap.setCapability("udid", "Device ID");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11");
		
		
//This is used for locating element in device	
		AndroidDriver driver = new AndroidDriver<MobileElement>("DEV_TOKEN", cap);
		e.g.:
		MobileElement N1 = (MobileElement) driver1.findElement(By.xpath("//android.widget.Button[@text='2']"));
		N1.click();	
		
<------------Commands to run Test Cases----------------->
1) mvn test -Dcucumber.filter.tags=@Webtest
2) mvn test -Dcucumber.options="--tags @tag Name"

*************To run all Test Cases*****************
1) mvn clean test
2) mvn test	
