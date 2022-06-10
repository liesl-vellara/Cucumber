package Test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase {
	WebDriver driver;
	public static String URL = "https://demoapp.skillrary.com/login.php?type=login";


	@Given("I open the browser and navigate to the URL")
	public void i_open_the_browser_and_navigate_to_the_url() {
	    WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(URL);
	}
	@When("Enter Username {string}")
	public void enter_username(String string) {
	    driver.findElement(By.id("email")).sendKeys(string);
	}
	@When("Enter Password {string}")
	public void enter_password(String string) {
		driver.findElement(By.id("password")).sendKeys(string);
	}
	@When("Click on the loginButton")
	public void click_on_the_login_button() {
	    driver.findElement(By.id("last")).click();
	}
	@Then("I should see the username as {string}")
	public void i_should_see_the_username_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement name = driver.findElement(By.xpath("//*[@class='hidden-xs']"));
		Assert.assertEquals(string, name.getText());
		
		// closing the browser when the condition is met
		driver.close();
	}


	@Then("I should navigate to the page {string}")
	public void i_should_navigate_to_the_page(String string) {
		WebElement page = driver.findElement(By.xpath("//*[@class='btnRegister']"));
	    Assert.assertEquals(string, page.getAttribute("value"));
	    
	    // closing the browser when the condition is met	
	    driver.close();
	}





	}

