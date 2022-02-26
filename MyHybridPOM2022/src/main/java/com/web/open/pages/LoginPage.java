package com.web.open.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.web.open.util.ElementUtil;

public class LoginPage {

	// Encapsulation
	// Private By locators
	// constructors
	// page action methods
	private WebDriver driver;
	private ElementUtil elementUtil;

	private By user = By.name("email");
	private By pass = By.id("input-password");
	private By login = By.cssSelector("input[value='Login']");
	private By forgetlink = By.xpath("//a[text()='Forgotten Password']/preceding-sibling::input");
	private By loginlinks = By.cssSelector("div.list-group>a");
	private By footerlinks = By.xpath("(//div[@class='row'])[last()]/div/ul/li");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(this.driver);

	}

	public String getLoginPageTitle() {
		return elementUtil.getPageTitle();
	}

	public boolean isForgetPwdLinkExists() {

		return elementUtil.checkElementVisibility(forgetlink);

	}

	public void doLogin(String un, String pwd) {

		elementUtil.doSendKeys(user, un);
		elementUtil.doSendKeys(pass, pwd);
		elementUtil.doClick(login);

	}

	public List<String> getLoginLinks() {

		return elementUtil.getElementsText(loginlinks);

	}

	public List<String> getFooterLinks() {
		return elementUtil.getElementsText(footerlinks);

	}

}
