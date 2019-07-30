package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {

	
	String path = "C:\\Users\\SumitKumar\\eclipse-workspace\\Sumit_Workspace\\CucumberTest\\Driver\\geckodriver.exe";
	
	WebDriver driver;
	
	@Given("^User is on FB login page$")
	public void launchBrowser()
	{
		System.setProperty("webdriver.gecko.driver", path);
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@When("^User gives credentials$")
	public void credentialInput()
	{
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Testing");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Testing");
		driver.findElement(By.xpath("//input[@id='u_0_a']")).click();
	}
	
	@Then("^User should log in to FB$")
	public void verification()
	{
		String actualTitle = "Log in to Facebook | Facebook";
		String expectedTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
}
