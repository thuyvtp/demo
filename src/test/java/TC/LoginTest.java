package TC;
import common.Base;


import org.testng.annotations.Test;


public class LoginTest extends Base{	
	
	
	@Test
	public void TestLogin()
	{
		super.before(); // before();
		//LoginPage lgPage = new LoginPage(getDriver());
		//System.out.println(getDriver());
		//lgPage.InputUserName("thuytest38@gmail.com");
		//lgPage.InputPassword("123456");
		//lgPage.submit();
	    super.login();// login();
		super.after();
		  
	} 


}






