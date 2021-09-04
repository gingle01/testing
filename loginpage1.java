package module_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage1 {
	
	@FindBy(xpath="//input[@type='text']") private WebElement UN;
	@FindBy(xpath="//input[@type='password']") private WebElement PWD;
	@FindBy(xpath="//button[@type='submit']") private WebElement login;
	
	public loginpage1 (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void enterusername(String username)
	{
		UN.sendKeys(username);
	}
	
	public void enterpassword(String password)
	{
		PWD.sendKeys(password);
	}
	
	public void clicklogin()
	{
		login.click();
	}
}
