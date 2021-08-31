Feature: Verify Buyer Outlets manage details page and test all the page

Scenario Outline: Verify the Outlets details page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>" 
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on outlets in the side navigation menubar
          And User clicks actions dropdown
          Then User clicks on Manage details
          And User clear on outlet email
          Then User enter the new email id"<Email>"
          Then User click on first manage subscription
          And User click on manage subscription
          Then User click on manage subscription close icon
          Then User click on save button
           
    Examples: 
      | username                      | | password   ||Email                      |
      | velumanieswaran2020@gmail.com | |!123456Zm   ||lingeshsabari2009@gmail.com|