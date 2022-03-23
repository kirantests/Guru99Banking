package project.banking.testCases;

import java.time.Duration;
import org.testng.Assert;
import org.testng.annotations.Test;
import project.banking.pageObjects.LoginPage;
import project.banking.utilities.BaseClass;

public class TC1_LogIntoBankingpage extends BaseClass {
	
	
	@Test
	public void login() throws InterruptedException
	{
		
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		LoginPage lp = new LoginPage(driver);
		
		lp.enterUsername(username);
		
		logger.info("Username is entered");
		
		lp.enterPassword(password);
		logger.info("Password is entered");
				
		lp.clickLogin();
		
		logger.info("Success");
		
		if(driver.getTitle().equals("Guru99 Bank Manager Homepage"))
		{
			Assert.assertTrue(true);
			
		}else
		{
				Assert.assertFalse(false);
		}
			
	
		
		
	}
	
	

}
