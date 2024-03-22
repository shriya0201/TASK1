package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionsDemo {
	WebDriver driver;
	@Before("@SearchHotel")
	@Given("I am on Hotel App Login page")
	
	public void i_am_on_hotel_app_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver= new ChromeDriver();
		   driver.get("https://adactinhotelapp.com/");
		   driver.manage().window().maximize();
	}
 
	@When("I enter username as {string}")
	public void i_enter_username_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("username")).sendKeys(string);
	}
 
	@When("I enter password as {string}")
	public void i_enter_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.id("password")).sendKeys(string);
	}
 
	@When("I click login")
	public void i_click_login() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("login")).click();
		System.out.println("Login button is now clicked");
	}
 
	@Then("I am logged in successfully")
	public void i_am_logged_in_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	}
	
	
	@When("I select location as {string}")
	public void i_select_location_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement locations= driver.findElement(By.id("location"));
	   Select location = new Select(locations);
	   location.selectByVisibleText(string);
	}
	
	@When("Click on the search button")
	public void click_on_the_search_button() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.id("Submit")).click();
	}
	@After("@loginProcess")
	@Then("I can see the hotel")
	public void i_can_see_the_hotel() {
	    // Write code here that turns the phrase above into concrete actions
		driver.quit();
	}

 
}
