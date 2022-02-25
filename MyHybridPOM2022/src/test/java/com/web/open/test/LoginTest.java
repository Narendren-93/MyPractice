package com.web.open.test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.web.open.factory.DriverFactory;
import com.web.open.pages.LoginPage;

public class LoginTest {
	
@Test
	private void loginPageTitleTest() {
	
	DriverFactory driverFactory = new DriverFactory();
	Properties prop = driverFactory.init_prop();
	WebDriver driver = driverFactory.init_Driver(prop);
	LoginPage loginPage = new LoginPage(driver);
	String actualTitle = loginPage.getLoginPageTitle();
	
	String expectedTitle = "Account Login";
	
	Assert.assertEquals(actualTitle, expectedTitle);
	
		

	}
}
