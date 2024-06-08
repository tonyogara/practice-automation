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
		
		//Click on the date textbox to display the calendar
		webDriver.findElement(By.xpath("//input[@id='g1065-selectorenteradate']")).click();
		
		
		//Loop through the calendar to find the specified month and year
		while (true)
		{
			//Could also compare the initial value on the calander to see if we need to pagenate backwards or forwards
			String currentDisplayedMonth = webDriver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[1]/span[1]")).getText();
			
			String currentDisplayedYear = webDriver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[1]/span[2]")).getText();
			
			
			if (currentDisplayedMonth.equalsIgnoreCase(month) && currentDisplayedYear.equalsIgnoreCase(year))
			{
				break;
			}
			//Select the back button
			webDriver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/a[1]")).click();
			
			
		}
		
		//Select the day
		webDriver.findElement(By.xpath("//a[contains(text(),'"+day+"')]")).click();
		
		//Select the submit button
		webDriver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/main[1]/div[1]/article[1]/div[1]/div[1]/form[1]/p[1]/button[1]")).click();
			
		
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
