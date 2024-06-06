package com.practice_automation.qa.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase {
	
	public static String browserName;
	public static WebDriver webDriver;
	public static Properties prop = new Properties();
	
	
	public TestBase(Properties prop)
	{
		try
		{
			FileInputStream ip = new FileInputStream(
				"/Users/tony/Documents/Learning/Practice_Automation/Practice_Automation_ArtId/src/main/java/com/practice_automation/qa/config/config.properties");
			prop.load(ip);
			browserName = prop.getProperty("browser");
			
		} catch (FileNotFoundException e)
			{
				e.printStackTrace();
			} catch (IOException e)
			{
				e.printStackTrace();			
			}
	}
	
	
	
	public void initialisation()
	{
		if (browserName.equalsIgnoreCase("Chrome"))
		{		///Users/tony/Documents/Learning/Practice_Automation/Practice_Automation_ArtId/src/main/java/com/practice_automation/qa/chromedriver/chromedriver
				  ///Users/tony/Documents/Learning/FreeCrm/FreeCrmArtId/src/main/java/com/crm/qa/chromedriver/chromedriver
			
															   
			
				//System.setProperty("webDriver.chrome.driver", "/Users/tony/Documents/Learning/Practice_Automation/Practice_Automation_ArtId/src/main/java/com/practice_automation/qa/chromedriver/chromedriver");
				
			System.setProperty("webdriver.chrome.driver", "/Users/tony/Documents/Learning/FreeCrm/FreeCrmArtId/src/main/java/com/crm/qa/chromedriver/chromedriver");
			ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				webDriver = new ChromeDriver(options);
		}
		
		
		
		webDriver.manage().window().maximize();
		webDriver.get(prop.getProperty("url"));
		
	}
	


}
