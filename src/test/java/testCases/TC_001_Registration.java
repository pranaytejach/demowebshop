package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC_001_Registration extends BaseClass

{

	@Test(groups= {"regression","master"})
	public void verify_Account ()
	{
		
		try
		{
			logger.info("** chalu hua**");
			
		HomePage hp = new HomePage(driver);
		logger.info("clicked on Reg");
		hp.Registration();
		
		RegistrationPage rp = new RegistrationPage(driver);
		rp.Gender();
		rp.setFirstName( randomeString().toUpperCase());
		rp.setLastName(randomeString().toUpperCase());
		rp.setEmail(randomeString()+"@gmail.com");
		
		String password=randomeAlphaNumeric();
		rp.setPassword(password);
		rp.setConfirmPassword(password);
		rp.Register();
		rp.Continue();
		
		logger.info("created account");
		
		// checking msg conformation 
			
String confmsg=rp.getConfirmationMsg();
		
		
		if(confmsg.equals("Welcome to our store"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			logger.error("test failed");
			Assert.fail();
		}
		}
		catch (Exception e)
		{
			Assert.fail();
		}
		
	logger.info("**Bandh hua**");	
		

	
	
	
	}

}
