package com.web.open.test;

import static org.testng.Assert.assertTrue;

import java.util.Properties;
//
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.web.open.factory.DriverFactory;
import com.web.open.pages.LoginPage;

public class LoginTest extends BaseTest {

	@Test
	public void loginPageTitleTest() {

		String actualTitle = loginPage.getLoginPageTitle();

		String expectedTitle = "Account Login";

		Assert.assertEquals(actualTitle, expectedTitle);

	}

	@Test
	public void isForgetPwdLinkExistsTest() {

		boolean forgetPwdLinkExists = loginPage.isForgetPwdLinkExists();

		Assert.assertTrue(forgetPwdLinkExists);

	}

	@Test
	public void loginTest() throws Exception {
		

		loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));

	}

	@Test
	public void loginLinksTest() {

		int loginlinkscount = loginPage.getLoginLinks().size();

		Assert.assertEquals(loginlinkscount, 13);

	}
	@Test
	public void footerLinksTest() {
		int footerlinkscount = loginPage.getFooterLinks().size();
		
		Assert.assertEquals(footerlinkscount, 5);
	}
}
