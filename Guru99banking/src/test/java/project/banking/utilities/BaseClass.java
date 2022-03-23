package project.banking.utilities;






import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;




public class BaseClass {
	
	ReadConfig readconfig=new ReadConfig();
	
	public String url =readconfig.getURL();
	public String username=readconfig.getusername();
	public String password=readconfig.getpassword();
	public static WebDriver driver;
	
   public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String browser)
	{
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromeDriver.exe");
		if(browser.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", readconfig.getChromeDriver());
		driver = new ChromeDriver();
		
		}
		
		if(browser.equals("firefox"))
		{
		System.setProperty("webdriver.gecko.driver", readconfig.getGeckoDriver());
		driver = new FirefoxDriver();
		}
		
		if(browser.equals("ie"))
		{
		System.setProperty("webdriver.ie.driver", readconfig.getIeDriver());
		driver = new InternetExplorerDriver();
		}
		
		logger = LogManager.getLogger("Guru99banking");
		
		
		
		
	}
	
	
	

}
