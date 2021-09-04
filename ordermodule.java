package module_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ordermodule {
	
	
	
	@FindBy(xpath="//a[@href='/orders']") private WebElement orders;
	@FindBy(xpath="//span[@class='icon']") private WebElement vhistory;
	
	public ordermodule(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
public void order()
{
	orders.click();
	vhistory.click();
}
}
