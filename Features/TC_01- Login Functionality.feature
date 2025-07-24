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
@feature1
Feature: Login Feature
  Login Functionality

  @Scenario
  Scenario Outline: Login to Application
    Given Click on Try_Login_Page_Link button
    Then Validate the expected Login Page
    When Enter the UserName "<Name>" and Password "<Password>"
    When Click on Login Button
    Then Validate the Login Page "<status>"

    Examples: 
      | Name     | Password             | status  |
      | practice | SuperSecretPassword! | success |
      | Murali   | MuraliPassword       | fail    |
      | practice | SuperSecret!         | fail    |
