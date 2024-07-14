package stepDefination;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utIits.PropertiesFileReader;

public class stepDefination {
	 WebDriver driver;
	 String url;
	 String Email;
	 String password;
	@Before
	 public void setup() {
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 Properties prop = PropertiesFileReader.read("config.properties");
		 url= prop.getProperty("baseUrl");
		 Email= prop.getProperty("Email");
		 password = prop.getProperty("password");
	 }
	
	@Given("User is on nopcommerce site")
	
	public void user_is_on_nopcommerce_site() {
	   driver.get(url);
	}
	@When("User click on login")
	public void user_click_on_login() {
	driver.findElement(By.className("ico-login")).click();
	  
	}
	@When("User enter username and password")
	public void user_enter_username_and_password() {
	   driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Email");
	   driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("password");
	}
	@When("User click on login button")
	public void user_click_on_login_button() {
	  driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
	}
	@Then("User should successful login")
	  public void user_should_be_successfully_logged_in() {
        WebElement myAccountLink = driver.findElement(By.linkText("My account"));
        assertTrue(myAccountLink.isDisplayed());
    }

	private void assertTrue(boolean displayed) {
		
		
	}



}
