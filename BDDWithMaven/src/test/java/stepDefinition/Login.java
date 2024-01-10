package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Login {

	@Given("Open the Browser and Navigate {string}")
	public void open_the_browser_and_navigate(String url) {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	@Then("Click on login")
	public void click_on_login() {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@Then("Locate User Textbox and Input UserName as {string}")
	public void locate_user_textbox_and_input_user_name_as(String username) {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@Then("Locate User Textbox and Input UserName")
	public void locate_user_textbox_and_input_user_name() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("Locate Password TextBox and Input Password as {string}")
	public void locate_password_text_box_and_input_password_as(String password) {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("Locate {string} button")
	public void locate_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("Click on it.")
	public void click_on_it() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Validate if user is able to login or not.")
	public void validate_if_user_is_able_to_login_or_not() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
