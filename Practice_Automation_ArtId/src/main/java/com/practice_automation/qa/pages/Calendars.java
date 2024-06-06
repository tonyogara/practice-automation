package com.practice_automation.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.practice_automation.qa.testbase.TestBase;

public class Calendars extends TestBase {
	
	
	public Calendars()
	{
		super(prop);
	}
	
	
	public void enterDate(String day, String month, String year)
	{
		//day = //a[contains(text(),'20')]
		
		WebElement dayElement = webDriver.findElement(By.xpath("//a[contains(text(),'day')]")).sendKeys('day');;
		
		
		//month = //span[contains(text(),'June')]
		WebElement monthElement = webDriver.findElement(By.xpath("//span[contains(text(),'month')]"));
		
		//year = //body/div[@id='ui-datepicker-div']/div[1]/div[1]/span[2]
		WebElement yearElement = webDriver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]/span[2])]"));
		
		yearElement.sendKeys(year);
		
		
		
		
	}
	
	
	
	public void enterADate()
	{
		WebElement dateTextBox = webDriver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/main[1]/div[1]/article[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]"));
		dateTextBox.click();
		
		WebElement calanderDateSelected = webDriver.findElement(By.xpath("//a[contains(text(),'13')]"));
		calanderDateSelected.click();
		
		WebElement submitBtn = webDriver.findElement(By.xpath("//body/div[@id='box']/div[@id='main']/div[1]/div[1]/main[1]/div[1]/article[1]/div[1]/div[1]/form[1]/p[1]/button[1]"));
		submitBtn.click();
	}
	
	
	public Boolean checkMsgDateEnteredSuccessfully(String expectedDateMessage)
	{
		WebElement successfulDateSelectedMsg = webDriver.findElement(By.xpath("//h4[@id='contact-form-success-header']"));	
		return (successfulDateSelectedMsg.getText().toString().equalsIgnoreCase(expectedDateMessage));
	}

	
	public void closeBrowser()
	{
		webDriver.close();
	}
	
	
	
	
}
