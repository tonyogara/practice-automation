#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to check that I can complete the Formfields page

  @tag1
  Scenario: Title of your scenario
    Given I select the link to display the FormFields page
    When I enter the name
    And I select the drinks
    And I select a colour
    And I select yes to having a siblings
    And I enter an email address
    And I enter a message
    And I select the submit button
    Then I see the correct message being displayed

