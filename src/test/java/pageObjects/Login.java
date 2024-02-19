package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Login extends BasePage
{
   public Login(WebDriver driver)
  {
	super(driver);
  }
 // capturing webelements
   
  
   @FindBy(xpath= "//input[@id='Email']")
   WebElement txt_email;
   
   @FindBy(xpath="//input[@id='Password']")
   WebElement txt_password;
   
   @FindBy(xpath="//input[@id='RememberMe']")
   WebElement btn;
   
   @FindBy(xpath="//input[@value='Log in']")
   WebElement btnl;
   
   
   //Action Methods
 
   
   public void sendEmail( String email) 
   {
	   txt_email.sendKeys(email);
   }
   
   public void sendPassword(String password)
   {
	   txt_password.sendKeys(password);
   }
   
   public void rememberMe()
   {
	   btn.click();
   }
   
   public void login()
   {
	   btnl.click();
   }
   
   
   
   
   
   
   
   
   
}
