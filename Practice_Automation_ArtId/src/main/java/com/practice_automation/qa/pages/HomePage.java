package com.practice_automation.qa.pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.practice_automation.qa.testbase.TestBase;

public class HomePage extends TestBase {
	
	
	
	public HomePage()
	{
		super(prop);
	}

	
	
	public void selectCalendarsPage()
	{
		
		//WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/main[1]/div[1]/article[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/a[1]")));
		
		WebElement calElement = webDriver.findElement(By.xpath("html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/main[1]/div[1]/article[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/a[1]"));
		Actions actions = new Actions(webDriver);
		actions.moveToElement(calElement).click().perform();
				
	}
	
	
	public void selectFormFieldPage()
	{
		
		WebElement frmFieldPageElement = webDriver.findElement(By.xpath("//a[contains(text(),'Form Fields')]"));
		frmFieldPageElement.click();
		
		
	}
	
	
	
	
	
}
