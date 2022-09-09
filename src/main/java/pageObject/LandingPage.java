package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage 
{
	
	public WebDriver driver;
	
	By signin =By.xpath("//a[@href='https://rahulshettyacademy.com/sign_in/']");
	
	
	public LandingPage(WebDriver driver)
	{
		// TODO Auto-generated constructor stub
		this.driver=driver; // giving life to the driver by creating a variable
	}


	public WebElement getLogin()
	{
		return driver.findElement(signin);
		
	
	}

}
