package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCart {
	
	@Given("user launches the amazon {string}  URL {string}")
	public void user_launches_the_amazon_url(String string, String string2) {
		
		System.out.println("Environment is "+string +" URL is "+string2);
	    
	}

	@When("user browsers the product")
	public void user_browsers_the_product() {
		
		System.out.println("search the mobile");
	    
	}

	@When("user click add to cart")
	public void user_click_add_to_cart() {
		System.out.println("Click add to cart");

	    
	}

	@Then("user does checkout for {int} rupees")
	public void user_does_checkout_for_rupees(int int1) {
		
		System.out.println("Price purchased is "+int1);

	     
	}


}