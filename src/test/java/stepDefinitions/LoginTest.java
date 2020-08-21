package stepDefinitions;

import common.Base;
import POM.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.java.en.And;



public class LoginTest extends Base {
	private WebDriver driver;
	LoginPage lgPage = new LoginPage(driver);
	
    @Given("^User open a page \"([^\"]*)\"$")
    public void user_open_a_page_something()  {
       super.before();
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
		Assert.assertEquals(loginPageTitle, "Trang chu - Seller Center");
    }
    @And("^quit app$")
    public void quit_app() {
        super.after();
    }
}