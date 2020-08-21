package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



import POM.LoginPage;

public class Base {
	private  WebDriver driver;
	
	public  WebDriver getDriver() { return driver; }

	public void before() {
		
	//	System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://sellercenter-box2.dev.tiki.services/new/#/user/login");
	}
	public void after() {
		driver.quit();
}
	
	public void login()
	{
		LoginPage lgPage = new LoginPage(getDriver());
		lgPage.InputUserName("thuytest38@gmail.com");
		lgPage.InputPassword("123456");
		
		
		lgPage.submit();
	}
	
}