package stepDefinitions;


import POM.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;



public class LoginTest  {
	private WebDriver driver;
	LoginPage lgPage = new LoginPage(driver);
	
	
	@Before
	public void StartTest() {
		//khoi tao driver
		//	System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
    @Given("^User open a page \"([^\"]*)\"$")
    public void user_open_a_page_something()  {
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://sellercenter-box2.dev.tiki.services/new/#/user/login");
    }

    @When("^user input correct email$")
    public void user_input_correct_email() {
    	lgPage.InputUserName("thuytest38@gmail.com");

    }
   
    @And("^user input correct password$")
    public void user_input_correct_password() {
    	lgPage.InputPassword("123456");
    }
    @And("^click on button Login$")
    public void click_on_button_login() {
    	lgPage.submit();
    }

    @Then("^Verify user login success$")
    public void verify_user_login_success() {
    	String loginPageTitle = driver.getTitle();
		Assert.assertEquals(loginPageTitle, "Trang chủ - Seller Center");
    }
    @After
    public void EndTest() {
    	driver.quit();
    }
}