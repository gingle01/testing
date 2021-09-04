package module_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homekitepage {
	
	@FindBy(xpath="//span[@class='user-id']") private WebElement userid;
	
	
	public homekitepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public String verifyusername()
	{
		String actresult =userid.getText();
		return actresult;
	}
	
	
	
}
