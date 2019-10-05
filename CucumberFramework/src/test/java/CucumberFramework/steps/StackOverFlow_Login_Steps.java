package CucumberFramework.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StackOverFlow_Login_Steps {

	@Given("^User is on the StackOverFlow website$")
	public void user_is_on_the_StackOverFlow_website() throws Throwable {
	    System.out.println("User is on the StackOverFlow website");
	}

	@When("^Clicks on the Login Link and is navigated to login page$")
	public void clicks_on_the_Login_Link_and_is_navigated_to_login_page() throws Throwable {
		System.out.println("Clicks on the Login Link and is navigated to login page");
	}

	@When("^User enters valid username$")
	public void user_enters_valid_username() throws Throwable {
		System.out.println("User enters valid username");
	}

	@When("^User enters valid password$")
	public void user_enters_valid_password() throws Throwable {
		System.out.println("User enters valid password");
	}

	@When("^User clicks on login$")
	public void user_clicks_on_login() throws Throwable {
		System.out.println("User clicks on login");
	}

	@Then("^User is logged in the site$")
	public void user_is_logged_in_the_site() throws Throwable {
		System.out.println("User is logged in the site");
	}
	
	//Runner Class Sample Example: Delete Later
	
	@Given("^User is on the StackOverFlow website(\\d+)$")
	public void user_is_on_the_StackOverFlow_website(int arg1) throws Throwable {
		System.out.println("User is on the StackOverFlow website2");
	}

	@When("^Clicks on the Login Link and is navigated to login page(\\d+)$")
	public void clicks_on_the_Login_Link_and_is_navigated_to_login_page(int arg1) throws Throwable {
		System.out.println("Clicks on the Login Link and is navigated to login page2");
	}

	@When("^User enters valid username(\\d+)$")
	public void user_enters_valid_username(int arg1) throws Throwable {
		System.out.println("User enters valid username2");
	}

	@When("^User enters valid password(\\d+)$")
	public void user_enters_valid_password(int arg1) throws Throwable {
		System.out.println("User enters valid password2");
	}

	@When("^User clicks on login(\\d+)$")
	public void user_clicks_on_login(int arg1) throws Throwable {
		System.out.println("User clicks on login2");
	}

	@Then("^User is logged in the site(\\d+)$")
	public void user_is_logged_in_the_site(int arg1) throws Throwable {
		System.out.println("User is logged in the site2");
	}
	
}
