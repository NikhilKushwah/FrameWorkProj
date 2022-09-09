package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage 
{
	
	public WebDriver driver;
	
	By email =By.xpath("//input[@id='user_email']");
	By password=By.xpath("//input[@id='user_password']");
	By button=By.xpath("//input[@type='submit']");
	
	
	public LoginPage(WebDriver driver)
	{
		// TODO Auto-generated constructor stub
		this.driver=driver; // giving life to the driver by creating a variable
	}

	
	public WebElement getEmail()
	{
		return driver.findElement(email);
		
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(password);
		
	}
	
	
	public WebElement getLogin()
	{
		return driver.findElement(button);
		
	}
	

}
