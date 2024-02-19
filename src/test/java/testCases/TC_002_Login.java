package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.MyAccount;
import pageObjects.HomePage;
import pageObjects.Login;

import testBase.BaseClass;

public class TC_002_Login extends BaseClass
{
	@Test(groups= {"sanity","master"})
public void login()
{
		try
		{
			
		
	//homepage
logger.info("2 chalu kiya");
HomePage hp = new HomePage(driver);
hp.mainLogin();

//login page
	Login lp = new Login(driver);
	lp.sendEmail(p.getProperty("email"));
	lp.sendPassword(p.getProperty("password"));
	lp.rememberMe();
	lp.login();
	logger.info("bandh 2 kiya");
	
	MyAccount myacc = new MyAccount(driver);
	
 	boolean targetPage 	= myacc.isMyAccountPageExists();
       if(targetPage == true)
       {
    	   Assert.assertTrue(true);
       }
       else
       {
    	   Assert.fail();
       }
       myacc.clickLogout();
		}

		
  catch(Exception e )
  {
 		  Assert.fail();
  }
 	  
 		logger.info("***closed***");
  
}
}

