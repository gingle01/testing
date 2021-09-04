package config_file;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass {
	
	public WebDriver driver;
	
	public  void initializebrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shailesh\\Desktop\\new\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(utility.readPropertyFiledata("URL"));
				
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
}
