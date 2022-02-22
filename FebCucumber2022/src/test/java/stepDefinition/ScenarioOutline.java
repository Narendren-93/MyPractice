package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
//import junit.framework.Assert;
import org.junit.*;

public class ScenarioOutline {
	
	WebDriver driver;
	
	@Given("I launch the url {string}")
	public void i_launch_the_url(String url) {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
//		driver.manage().timeouts().i
		
		driver.get(url);

	}
	@When("I enter the username {string} and password as {string}")
	public void i_enter_the_username_and_password_as(String uname, String pwd) {
		
		driver.findElement(By.name("email")).sendKeys(uname);
		driver.findElement(By.name("pass")).sendKeys(pwd);

	}
	@When("I click on the login button")
	public void i_click_on_the_login_button() {
		driver.findElement(By.name("email")).click();

	}
	@Then("I validate the title of new page")
	public void i_validate_the_title_of_new_page() {
		
		Assert.assertEquals("Facebook – log in or sign up", driver.getTitle());
		driver.close();

	}




}
