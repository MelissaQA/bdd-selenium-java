Feature: Facebook login functionality
	Scenario: Login with valid credentials
	Given User is on login page
	When User enters username
	And User enters password
	And User clicks on signin button
	Then User logged in successfully
	
	Scenario: Login with invalid credentials
	Given User is on login page
	When User enters incorrecto username
	And User enters password
	And User clicks on signin button
	Then User should not be logged in