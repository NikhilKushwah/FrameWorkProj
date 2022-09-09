package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base
{
	public WebDriver driver; // have mentioned globally 
	
	public WebDriver initializeDriver() throws IOException
	{
		
		Properties prop=new Properties();
		//have passed this path of the data.properties file which is having driver info
		FileInputStream fis=new FileInputStream("D:\\Soft\\eclipse-java-2022-06-R-win32-x86_64\\FramewokProj\\src\\main\\java\\Resources\\data.properties");
		
		// connecting data.properties file to the base file
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhil.kushwah\\Downloads\\chromedriver_win32\\chromedriver.exe");
		    driver=new ChromeDriver();
		}
		
		/*else if(browserName=="firefox")
		{
			System.setProperty("webdriver.gecko.driver","");
			
		}
		else if(browserName=="IE")
		{
			
		}*/
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	
	}
	

}
