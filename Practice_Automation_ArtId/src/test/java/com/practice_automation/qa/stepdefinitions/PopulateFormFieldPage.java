package com.practice_automation.qa.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
	
	//By id
	@When("I enter the name")
	public void i_enter_the_name() {
		webDriver.findElement(By.id("name")).sendKeys("Tony O'Gara");
	}

	//By id
	@When("I select the drinks")
	public void i_select_the_drinks() {
		webDriver.findElement(By.id("drink2")).click();
	}

	
	//By tagname
	@When("I select a colour")
	public void i_select_a_colour() {
		webDriver.findElement(By.id("color1")).click();
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
		//webDriver.findElement(By.id("submit-btn")).click();
		WebElement subBtn = webDriver.findElement(By.cssSelector("#submit-btn"));
		System.out.println("Before");
		//WebDriverWait wait = new WebDriverWait(webDriver.d.Duration.ofSeconds(10));
		
		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(webDriver.findElement(By.cssSelector("#submit-btn"))));
		subBtn.click();
		
		//new WebDriverWait(webDriver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/b[1]"))); 
		
		//subBtn.click();
		//webDriver.findElement(By.xpath("//button[@id='submit-btn']")).click();
		System.out.println("After");
	}

	@Then("I see the correct message being displayed")
	public void i_see_the_correct_message_being_displayed() {
		System.out.println("Nine");
	}


}
