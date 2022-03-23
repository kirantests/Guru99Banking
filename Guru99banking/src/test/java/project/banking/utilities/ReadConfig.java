package project.banking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig()
	{
		File src = new File("./configurationFiles\\config.properties");
		try {
			FileInputStream file = new FileInputStream(src);
			pro = new Properties();
			pro.load(file);
			
			
		} catch (Exception e) {
			System.out.println("The Exception is:"+e.getMessage());
		}
		
	}
	
	public String getURL() {
		String url = pro.getProperty("url");
		return url;	
	}
	
	public String getusername() {
		String username = pro.getProperty("username");
		return username;	
	}
	
	public String getpassword() {
		String password = pro.getProperty("password");
		return password;	
	}
	
	public String getChromeDriver() {
		String ChromeDriver = pro.getProperty("ChromeDriver");
		return ChromeDriver;	
	}
	
	public String getGeckoDriver() {
		String GeckoDriver = pro.getProperty("GeckoDriver");
		return GeckoDriver;	
	}
	
	public String getIeDriver() {
		String IeDriver = pro.getProperty("IeDriver");
		return IeDriver;	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
