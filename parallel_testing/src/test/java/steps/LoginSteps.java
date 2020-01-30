package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
	WebDriver driver;
	@Given("^user launches the chrome driver$")
	public void user_launch_chromedriver() {
		
		WebDriver driver =new ChromeDriver(); 
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.com");
		
	}
	
	
	@When("^user enters amazon username and password$")
	public void enters_amazon_username_password() {
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("thanujachinnu666@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Rishi@7874");

	}
	@Then("^user login to amazon application$")
	public void login_to_amazon() {
		
		driver.findElement(By.id("signInSubmit")).click();
		System.out.println("login to application");
	}

}
