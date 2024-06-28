package com.practice_automation.qa.stepdefinitions;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.practice_automation.qa.pages.HomePage;
import com.practice_automation.qa.testbase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PopulateFormFieldPage extends TestBase{
	
	
	public PopulateFormFieldPage()
	{
		super(prop);
	}
	
	
	HomePage homePage = new HomePage();
	
	
	@Given("I select the link to display the FormFields page")
	public void i_select_the_link_to_display_the_FormFields_page() {
	    homePage.initialisation();
	    homePage.selectFormFieldPage();
	}
	
	
	@When("I enter the name")
	public void i_enter_the_name() {
		webDriver.findElement(By.id("name")).sendKeys("Tony O'Gara");
	}

	
	@When("I select the drinks")
	public void i_select_the_drinks() {
		webDriver.findElement(By.id("drink2")).click();
	}

	
	@When("I select a colour")
	public void i_select_a_colour() {		
		WebElement element = webDriver.findElement(By.id("color3"));
		Actions actions = new Actions(webDriver);
		actions.moveToElement(element).click().perform();
	}

	
	@When("I select yes to having a siblings")
	public void i_select_yes_to_having_a_siblings() {
		webDriver.findElement(By.id("siblings")).sendKeys("Maybe");
	}

	
	@When("I enter an email address")
	public void i_enter_an_email_address() {
		webDriver.findElement(By.cssSelector("#email")).sendKeys("tony.ogara@gmail.com");
	}
	
	
	//By tagname
	@When("I enter a message")
	public void i_enter_a_message() {
		webDriver.findElement(By.tagName("textarea")).sendKeys("Yooooo");
	}
	

	@When("I select the submit button")
	public void i_select_the_submit_button() {
		WebElement element = webDriver.findElement(By.cssSelector("#submit-btn"));
		Actions actions = new Actions(webDriver);
		actions.moveToElement(element).click().perform();
	}
	

	@Then("I see the correct message being displayed")
	public void i_see_the_correct_message_being_displayed() {
		String alertStr = webDriver.switchTo().alert().getText();
		assertEquals("Message received!", alertStr);
		webDriver.switchTo().alert().dismiss();
		
		String winStr = webDriver.getWindowHandle();
		webDriver.switchTo().window(winStr);
		webDriver.close();
	}


}
