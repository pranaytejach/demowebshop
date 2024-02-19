package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends BasePage
{
public MyAccount(WebDriver driver)
{
		super(driver);
		// TODO Auto-generated constructor stub
	}

@FindBy(xpath="//strong[normalize-space()='Featured products']")
WebElement msg;

@FindBy(xpath="//a[normalize-space()='Log out']")
WebElement logout;

public boolean isMyAccountPageExists()   // MyAccount Page heading display status
{
	try {
		return (msg.isDisplayed());
	} catch (Exception e) {
		return (false);
	}
}

public void clickLogout() {
	logout.click();

}




}
