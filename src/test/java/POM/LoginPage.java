package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
 
By txtUsername= By.id("email");
By txtPassword= By.id("password");
By btnLogin=By.xpath("//button[@class='ant-btn submit___1WKz7 ant-btn-primary ant-btn-lg']");




WebDriver driver;
public WebDriver getDriver() {
	return driver;

}


public LoginPage(WebDriver mainDriver) {
	// TODO Auto-generated constructor stub
	this.driver=mainDriver;
}



public void InputUserName(String username)
{
	driver.findElement(txtUsername).sendKeys(username);
}

public void InputPassword(String password)
{
	driver.findElement(txtPassword).sendKeys(password);
}

public void submit()
{
	driver.findElement(btnLogin).click();
}




	
}