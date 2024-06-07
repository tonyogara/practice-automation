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
		
		//back button
		//body/div[@id='ui-datepicker-div']/div[1]/a[1]
		
		//forward button
		//body/div[@id='ui-datepicker-div']/div[1]/a[2]
		
		//Date text box
		////input[@id='g1065-selectorenteradate']
		webDriver.findElement(By.xpath("//input[@id='g1065-selectorenteradate']")).click();
		
		//day = //a[contains(text(),'20')]
		//WebElement dayElement = webDriver.findElement(By.xpath("//a[contains(text(),'"+day+"')]"));
		//.sendKeys(day);
		//dayElement.click();
		
		//month = //span[contains(text(),'June')]
		//WebElement monthElement = webDriver.findElement(By.xpath("//span[contains(text(),'month')]"));
		//.sendKeys(month);
		
		//year = //body/div[@id='ui-datepicker-div']/div[1]/div[1]/span[2]
		//WebElement yearElement = webDriver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]/span[2])]"));
		//.sendKeys(year);
		
		while (true)
		{
			//String currentMonth = webDriver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[1]/span[1]")).getText();
			String currentMonth = webDriver.findElement(By.cssSelector("body.page-template-default.page.page-id-1065.custom-background.wp-custom-logo.jps-theme-exs-pro.singular.no-sidebar.btns-bold.btns-colormain.btns-rounded.menu-bold.dom-loaded.window-loaded:nth-child(2) div.ui-datepicker.ui-widget.ui-widget-content.ui-helper-clearfix.ui-corner-all:nth-child(50) div.ui-datepicker-header.ui-widget-header.ui-helper-clearfix.ui-corner-all div.ui-datepicker-title > span.ui-datepicker-month")).getText();
			
			System.out.println(currentMonth);
			String currentYear = webDriver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]/span[2])]")).getText();
			
			if (currentMonth.equalsIgnoreCase(month) && currentYear.equalsIgnoreCase(year))
			{
				break;
			}
			webDriver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/a[1]")).click();
			
		}
		
		
		
		
		
		
		
		
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
