package module_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage2 {

	@FindBy(xpath="//input[@type='password']") private WebElement PIN;
	@FindBy(xpath="//button[@type='submit']") private WebElement cont;
	
	
	public loginpage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterpin(String pin)
	{
		PIN.sendKeys(pin);
	}

	public void clickcontinue()
	{
		cont.click();
	}

}
