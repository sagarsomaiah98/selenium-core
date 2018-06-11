package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	WebDriver driver;
	@Given("^Facebook is launched with URL$")
	public void facebook_is_launched_with_URL() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "E:\\ALL JARS\\geckodriver-master\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://facebook.com");
		System.out.println("launched");
	}

	@When("^I enter \"(.*)\"$")
	public void i_enter_username(String username) throws Throwable {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		 System.out.println("username");
	}

	@When("^I enter password$")
	public void i_enter_password() throws Throwable {
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("sagarsomaiah");
		 System.out.println("password");
	}

	@When("^I Click login$")
	public void i_Click_login() throws Throwable {
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		 System.out.println("login");
	}

	@Then("^Homepage is displayed$")
	public void homepage_is_displayed() throws Throwable {
		boolean value=driver.findElement(By.linkText("Home")).isDisplayed();
		Assert.assertEquals(value, true);
		System.out.println("homepage displayed");
		driver.quit();
	}



}
