package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{

	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	

	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement btnR;
	
	 @FindBy(xpath="//a[normalize-space()='Log in']") // added at 5
	   WebElement btnml1;
	
	
public void Registration()
{
	btnR.click();
}
	
public void mainLogin()     // added at 5
{
	   btnml1.click();
}

	
	
	
	

	
	

}
