package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SimpleData {
	
	

	@Given("I have {int} brother and {int} sisters")
	public void i_have_brothers_and_sister(Integer int1, Integer int2) {
	  System.out.println(int1 +" " +int2);
	}

	


	@When("my brother name is {string} and sister name is {string}")
	public void my_brother_name_is_and_sister_name_is(String s1, String s2) {
		System.out.println("Brother name is "+s1);
		System.out.println("Sister name is "+s2);

	}


	@When("{string} is getting around {double} lpa")
	public void is_getting_around_lpa(String s, Double d) {
		System.out.println(s);
		System.out.println(d);
	   
	}




}
