package com.practice_automation.qa.stepdefinitions;

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
	    System.out.println("One");
	    homePage.initialisation();
	    homePage.selectFormFieldPage();
	    //throw new cucumber.api.PendingException("Failed on step one");
	}

	@When("I enter the name")
	public void i_enter_the_name() {
		System.out.println("Two");
	    //throw new cucumber.api.PendingException();
	}

	@When("I select the drinks")
	public void i_select_the_drinks() {
		System.out.println("Three");
	    //throw new cucumber.api.PendingException();
	}

	@When("I select a colour")
	public void i_select_a_colour() {
		System.out.println("Four");
	    //throw new cucumber.api.PendingException();
	}

	@When("I select yes to having a siblings")
	public void i_select_yes_to_having_a_siblings() {
		System.out.println("Five");
	    //throw new cucumber.api.PendingException();
	}

	@When("I enter an email address")
	public void i_enter_an_email_address() {
		System.out.println("Six");
	    //throw new cucumber.api.PendingException();
	}

	@When("I enter a message")
	public void i_enter_a_message() {
		System.out.println("Seven");
	    //throw new cucumber.api.PendingException();
	}

	@When("I select the submit button")
	public void i_select_the_submit_button() {
		System.out.println("Eight");
	    //throw new cucumber.api.PendingException();
	}

	@Then("I see the correct message being displayed")
	public void i_see_the_correct_message_being_displayed() {
		System.out.println("Nine");
	    //throw new cucumber.api.PendingException();
	}


}
