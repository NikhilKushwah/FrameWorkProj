package Framework.FramewokProj;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.base;
import pageObject.LandingPage;
import pageObject.LoginPage;

public class Homepage extends base
{
	

	
	@Test
	public void basePageNavigation() throws IOException, InterruptedException
	{
		driver=initializeDriver();
		driver.get("http://www.qaclickacademy.com/");
		
		
		LandingPage lp=new LandingPage(driver); // giving life to this driver
		lp.getLogin().click();
		
		// Now creating an object for LoginPage
		LoginPage login=new LoginPage(driver);
		login.getEmail().sendKeys("nic@qw.com");
		login.getPassword().sendKeys("Nikhil@123");
		Thread.sleep(2000);
		login.getLogin().click();
	}
	
	
	@DataProvider
	public void getData()
	{
		//pass the data dynamically using array 
		Object[][] data=new Object[2][3];
		

	}

}
