package com.practice_automation.qa.stepdefinitions;

import com.practice_automation.qa.pages.Calendars;
import com.practice_automation.qa.pages.HomePage;
import com.practice_automation.qa.testbase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SelectCalandarDate extends TestBase{
	
	
	public SelectCalandarDate()
	{
		super(prop);
	}
	
	
	HomePage homePage = new HomePage();
	Calendars calendars = new Calendars();
	
	@Given("I have landed on the Calanders page")
	public void i_have_landed_on_the_Calanders_page() {
	    
		homePage.initialisation();
		homePage.selectCalendarsPage();
		
		
	}

	@When("I enter a date successfully")
	public void i_enter_a_date_successfully() {
		//calendars.enterADate();
		calendars.pagenatToAndSelectDate("22", "April", "2013");
		
		System.out.println("When statement");
		
	}

	@Then("I am seeing the correct message being displayed")
	public void i_am_seeing_the_correct_message_being_displayed() {
	    
		System.out.println("Then statement");
		
		calendars.checkMsgDateEnteredSuccessfully("Your message has been sent");
		calendars.closeBrowser();
		
		//webDriver.close();
		
	}
	
	
	
	

}
