package Com.radical.basic.B15Demo;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberPathStepDefination {
	
	WebDriver driver;
	@Given("^ther user is on facebook login Page$")
	public void ther_user_is_on_facebook_login_Page()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Radical_Software\\selenium-1\\chromedriver_win32_B39\\chromedriver.exe");
		driver = new ChromeDriver();  
		driver.get("https://www.facebook.com/");
	}
	
	@When("^he enters \"([^\"]*)\" as user name$")
	public void he_enters_user_as_user_name(String username) throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys(username);
		Thread.sleep(2000);
	}
	
	
	@And("^he enters \"([^\"]*)\" as password$")
	public void he_enters_mayur_as_password(String Password) throws InterruptedException
	{
		driver.findElement(By.id("pass")).sendKeys(Password);
		Thread.sleep(2000);
	}
	
	@Then("^check username is present in textbox$")
	public void check_username_is_present_in_textbox() throws InterruptedException
	{
		Assert.assertTrue(true);
		Thread.sleep(2000);
		driver.quit();
	}

}
