Feature: Automated End2End Tests 
	Description: The purpose of this feature is to test End 2 end integration of buyer hub

Scenario Outline: Customer Success fully logins to buyer hub 
	Given User is on Login Page 
	When User enters username "<username>" 
	And User enters password "<password>" 
	And User Clicks Login button 
	Then User routed to dashboard page "Dashboard | Buyer Hub" 
	
	Examples: 
		| username            | password  |
		| guindyuser@gmail.com | !123456Zm |
		
Scenario Outline: Customer enters wrong password to buyer hub 
	Given User is on Login Page 
	When User enters correct username "<username>" 
	And User enters wrong password "<password>" 
	And User Clicks Login button 
	Then User shown with error message "Invalid Username/Password" 
	
	Examples: 
		| username            | password  |
		| guindyuser@gmail.com | !123456Z |
		
		
Scenario Outline: Customer wants to reset password 
	Given User is on Login Page 
	When User clicks on "I've forgotten my password" 
	Then User shown with Reset password screen "Validate Email | Buyer Hub" 
	When User enters invalid email "<emails>" 
	Then User shown with error message "Must be email." 
	And User enters valid but unregisterd email "<email>" 
	When User clicks on Send request 
	Then User shown with error message  "Email not valid" 
	And User enters valid registered email "<email>" 
	When User clickes on Send Request 
	Then User shown with password reset email set screen 
	
	Examples: 
		| email      |
		| guindyusergmail.com |
		| user@aacbd.com      |
		| guindyusergmail.com |
		
		