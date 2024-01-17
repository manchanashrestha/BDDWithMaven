package stepDefinition;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Login {
	WebDriver driver;

	@Given("Init the Browser and Navigate {string}")
	public void init_the_browser_and_navigate(String url) {
		driver.get(url);
	}

	@Then("Click on login")
	public void click_on_login() {
		driver.findElement(By.id("loginLink")).click();
		;

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
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/form/div[4]/div/input")).click();
	}

	// Scenario 2 steops 5 and 6
	@Then("Validate if user is able to login or not.")
	public void validate_if_user_is_able_to_login_or_not() {
		List<WebElement> IfLogin = driver.findElements(By.xpath("//*[@id=\"logoutForm\"]/ul/li[2]/a"));
		IfLogin.get(0).click();
		assertNotNull(IfLogin);
	}

	@Then("User should not allowed to login.")
	public void user_should_not_allowed_to_login() {
		List<WebElement> IfLogOffButtonExists = driver.findElements(By.xpath("//*[@id=\"logoutForm\"]/ul/li[2]/a"));
		assertEquals(IfLogOffButtonExists.size(), 0);
	}

	@Before
	public void SetUpBrowser() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@After
	public void CloseBrowser() {
		driver.close();
	}

}
