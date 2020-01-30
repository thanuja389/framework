package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SelectionSteps {
	WebDriver driver;
	@Given("^after login to application$")
	public void homepage() {
		System.out.println("login to application");
		
	}
	
	@When("^user search for baby products$")
	public void search() {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("baby products");
		
	}
	@Then("^display all baby products$")
	
	public void select() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}
	

}
