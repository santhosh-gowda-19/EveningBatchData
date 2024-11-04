package stepDefn;

import io.cucumber.java.en.*;

public class Login1 {
	@Given("user opens the testUrl")
	public void user_opens_the_test_url() {
	    System.out.println("user entered url");
	}

	@When("user enters valid email address {string}")
	public void user_enters_valid_email_address(String validUN) {
	   System.out.println("user entered valid username "+validUN);
	}

	@When("user enters valid password {string}")
	public void user_enters_valid_password(String validPWD) {
	   System.out.println("user entered valid password "+validPWD);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	   System.out.println("clicked on login button");
	}

	@Then("user should login successfully")
	public void user_should_login_successfully() {
	    System.out.println("user logged in successfully");
	}

	@When("user enters invalid email address {string}")
	public void user_enters_invalid_email_address(String invalidUN) {
	   System.out.println("user entered invalid email "+invalidUN);
	}

	@When("user enters invalid password {string}")
	public void user_enters_invalid_password(String invalidPWD) {
		System.out.println("user entered invalid password "+invalidPWD);
	}

	@Then("user should get warning message")
	public void user_should_get_warning_message() {
	   System.out.println("invalid user login");
	}

	@When("user enters no credentials")
	public void user_enters_no_credentials() {
	    System.out.println("no credentials entered");
	}

}
