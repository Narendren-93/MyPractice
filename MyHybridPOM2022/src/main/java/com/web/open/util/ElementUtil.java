package com.web.open.util;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {

	public WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	public String getPageTitle() {
		return driver.getTitle();
		// TODO Auto-generated method stub

	}

	public WebElement getElement(By locator) {

		return driver.findElement(locator);
	}

	public boolean checkElementVisibility(By locator) {
		return getElement(locator).isDisplayed();

	}

	public void doSendKeys(By locator, String data) {
		getElement(locator).sendKeys(data);
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public List<WebElement> getElements(By locator) {
		
		return driver.findElements(locator);

	}

	public List<String> getElementsText(By locator) {

		List<WebElement> elements = getElements(locator);

		List<String> labels = new ArrayList<>();

		for (WebElement ele : elements) {

			labels.add(ele.getText());
		}
		return labels;
	}

}
