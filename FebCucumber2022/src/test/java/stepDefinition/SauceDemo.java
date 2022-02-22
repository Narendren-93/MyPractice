package stepDefinition;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceDemo {

	WebDriver driver;

	@Then("Verify url of the webpage is {string}")
	public void verify_url_of_the_webpage_is(String Expurl) {

		Assert.assertEquals(Expurl, driver.getCurrentUrl());
	}

	@Given("the user launches the url {string}")
	public void the_user_launches_the_url(String url) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);

	}

	@When("the user enters the username {string} and password {string}")
	public void the_user_enters_the_username_and_password(String username, String pwd) throws InterruptedException {

		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.manage().window().maximize();
		Thread.sleep(5000);

	}

	@When("the user click on the login button")
	public void the_user_click_on_the_login_button() {

		driver.findElement(By.id("login-button")).click();

	}

//	@Given("the user collects all the items in webpage")
//	public void the_user_collects_all_the_items_in_webpage() {
//		
//		//List<WebElement> item_prices = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));

//	}

	@When("the user finds the highest pricing item")
	public void the_user_finds_the_highest_pricing_item() { //throws InterruptedException {
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement> prices = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
		
		double hp = prices.stream().mapToDouble((e) ->Double.parseDouble(e.getText().trim().replace("$", ""))).max().getAsDouble();
		
		System.out.println("costly product = "+hp);
		
		String xpath = "//div[normalize-space()='$" + hp + "']/following-sibling::button";
		
//		String xpath = "//div[normalize-space()='$" + minPrice + "']/following-sibling::button";
//		
		driver.findElement(By.xpath(xpath)).click();
		
//		String xpath = "//div[normalize-space()='$" + hp + "']/following-sibling::button";
		
		//Thread.sleep(2000);
		
	//	driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']")).click();
		
		//driver.close();

	}
	


	@Then("the user should validate he product by checking the remove button")
	public void the_user_should_validate_he_product_by_checking_the_remove_button() {
		
		//Assert.assertTrue(driver.findElement(By.xpath("//button[text()='Remove']")).isDisplayed());

	}

}