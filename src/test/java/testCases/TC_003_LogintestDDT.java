package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;

import pageObjects.Login;
import pageObjects.MyAccount;
import testBase.BaseClass;
import utilities.DataProviders;

@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class) // connecting both classes
public class TC_003_LogintestDDT extends BaseClass
{
	/*Data is valid  - login success - test pass  - logout
	Data is valid -- login failed - test fail

	Data is invalid - login success - test fail  - logout
	Data is invalid -- login failed - test pass
	*/
	
	public void verify_loginDDT(String email ,String password,String exp) // from excel sheet we have 3 so we are passing 3
	{
try {
		//Home page
		HomePage hp = new HomePage(driver);
				hp.mainLogin();
			
	//Login
			Login lp=  new Login(driver);
			lp.sendEmail(email);
			lp.sendPassword(password);
			lp.login();
			
		//my account page 
			//My Account Page
			MyAccount macc=new MyAccount(driver);
			boolean targetPage=macc.isMyAccountPageExists();
			
			if(exp.equalsIgnoreCase("Valid"))
			{
				if(targetPage==true)
				{
					macc.clickLogout();
					Assert.assertTrue(true); // here  vachindi  alage logout chey malli ue for other tc
				}
				else
				{
					Assert.assertTrue(false);
				}
			}
			
			if(exp.equalsIgnoreCase("Invalid"))
			{
				if(targetPage==true)
				{
					macc.clickLogout();
					Assert.assertTrue(false); // not suppose to pass so make it fail
				}
				else
				{
					Assert.assertTrue(true);
				}
			}
		}
	catch(Exception e)
	{
		Assert.fail("An exception occurred: ");
	}
		
	logger.info("**** Finished TC_003_LoginDDT *****");
}
		
	}

