package com.web.open.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	Properties prop;

	WebDriver driver;

	public WebDriver init_Driver(Properties prop) {

		String browser = prop.getProperty("browser").trim();
		System.out.println("Browser is " + browser);

		if (browser.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("edge")) {

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}

		else {
			System.out.println("Please pass correct browser name, Entered browser name is " + browser);
		}

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));

		return driver;

	}

	public Properties init_prop() {

		prop = new Properties();

		FileInputStream ip = null;
		try {
			ip = new FileInputStream(
					"E:/Eclipse Workspace/MyHybridPOM2022/src/main/resources/Config/config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prop.load(ip);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();

		}

		return prop;
	}
}
