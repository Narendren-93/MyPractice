package com.web.open.test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.web.open.factory.DriverFactory;
import com.web.open.pages.LoginPage;

public class BaseTest {
	
	public DriverFactory driverFactory;
	public Properties prop;
	public WebDriver driver;
	public LoginPage loginPage;
	
	@BeforeTest
	public void setup()
	{
		driverFactory = new DriverFactory();
		Properties prop = driverFactory.init_prop();
		driver = driverFactory.init_Driver(prop);
		loginPage = new LoginPage(driver);
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

}
