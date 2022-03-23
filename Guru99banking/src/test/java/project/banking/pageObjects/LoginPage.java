package project.banking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver rdriver)
	{
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	
	@FindBy(name = "uid")
	public static WebElement username;
	
	@FindBy(name = "password")
	public WebElement password;
	
	@FindBy(name = "btnLogin")
	public WebElement loginButton;
	
	public void enterUsername(String uname)
	{
		username.sendKeys(uname);
	}
	
	public void enterPassword(String pswd)
	{
		password.sendKeys(pswd);
	}
	
	public void clickLogin()
	{
		loginButton.click();
	}
	
	
}
