package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage 
{
	public RegistrationPage(WebDriver driver) 
	{
		super(driver);
	}


	@FindBy(xpath="//input[@id = 'gender-male']")
	WebElement btnG;
	
	@FindBy(xpath= "//input[@id='FirstName']")
	WebElement txt_fname;
	
	@FindBy(xpath="//input[@id='LastName']")
	WebElement txt_lname;
	
	@FindBy(xpath= "//input[@name='Email']")
	WebElement txt_email;
	
	@FindBy(xpath = "//input[@id = 'Password']")
	WebElement txt_pwd;
	
	@FindBy(xpath= "//input[@id='ConfirmPassword']")
	WebElement  txt_cfmnpwd;
	
	@FindBy(xpath="//input[@id='register-button']") 
	WebElement btnR;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btnC;
	
	@FindBy(xpath="//h2[normalize-space()='Welcome to our store']")
	WebElement  msgconfirmation;	
	
	
	
	//Action Methods
	
	public void Gender()
	{
		btnG.click();
	}
	
	public void setFirstName( String fname)
	{
		txt_fname.sendKeys(fname);
	}
	
	public void setLastName(String lname)
	{
		txt_lname.sendKeys(lname);
	}
	
	public void setEmail(String email)
	{
		txt_email.sendKeys(email);
	}
	
	public void setPassword(String pwd)
	{
		txt_pwd.sendKeys(pwd);
	}
	
	public void setConfirmPassword(String cfmnpwd)
	{
		txt_cfmnpwd.sendKeys(cfmnpwd);
	}
	
	
	public void Register() 
	{
		btnR.click();
	}
	
	public void Continue() 
	{
		btnC.click();
	}

	public String getConfirmationMsg()
	{
		try 
		{
			return (msgconfirmation.getText());
		} catch (Exception e) {
			return(e.getMessage());
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
