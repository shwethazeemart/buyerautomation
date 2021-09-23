Feature: Verify Buyer Inventory Time format page and test all the page

Scenario Outline: Verify the Inventory Time format page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on Inventory in the side navigation menubar 
          And User click on outlets icon
          Then User ckicks on velu masala outlet
          And User click on New stock count
          Then User select dropdown of velu
          Then User click on start new stock count button
          Then User  enter the count quantity"<quantity>"
          Then User click on save button in quantity count
          Then User click on pop message save button
          Then User click on List menu item
          Then User click on velu list item
          Then User see the twenty hours time format
         
          
     Examples:
         |username                            |  |password    ||quantity|
         |velumanieswaran2020@gmail.com       |  |!123456Zm   ||10      |