package stepDefinition;

import static org.testng.Assert.assertNotNull;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Login {
	WebDriver driver;

	@Given("Init the Browser and Navigate {string}")
	public void init_the_browser_and_navigate(String url) {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get(url);
	}
	@Then("Click on login")
	public void click_on_login() {
		driver.findElement(By.id("loginLink")).click();;
		
	  
	}

	@Then("Locate User Textbox and Input UserName as {string}")
	public void locate_user_textbox_and_input_user_name_as(String username) {
		driver.findElement(By.id("UserName")).sendKeys(username);
	  
	}


	@Then("Locate Password TextBox and Input Password as {string}")
	public void locate_password_text_box_and_input_password_as(String password) {
		driver.findElement(By.id("Password")).sendKeys(password);
	   
	}

	@Then("Locate log in button and click on it")
	public void locate_log_in_button_and_click_on_it() {
		WebElement loginButton =  driver.findElement(By.xpath("//*[@id=\"loginForm\"]/form/div[4]/div/input"));
		loginButton.click();
	}

	@Then("Validate if user is able to login or not.")
	public void validate_if_user_is_able_to_login_or_not() {
	    WebElement IfLogin = driver.findElement(By.xpath("//*[@id=\"logoutForm\"]/ul/li[2]/a"));
	    assertNotNull(IfLogin);
	}

}
