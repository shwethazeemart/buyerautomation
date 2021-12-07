Feature: Verify Buyer Inventory Activity lisen page and test all the page

Scenario Outline: Verify the Inventory Activity lisen page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on Inventory in the side navigation menubar 
          And User click on outlets icon
          Then User ckicks on outlet "<outletname>"
          Then User click on Activity icon
          And User click on New stock count
          Then User click on New stock count close icon
          And User click on Record Adjustment
          Then User click on Record Adjustment close icon
          And User select the calendar this month from date to To date
          Then User click on download button
     
     @dev     
     Examples:
         |username                            |  |password    | |outletname  |
         |velumanieswaran2020@gmail.com       |  |!123456Zm   | |velu masala |
     
      
    @naren   
     Examples:
         |username                            |  |password    | |outletname  |
         |buyerautomated3@gmail.com           |  |!123456Zm   | |velu masala |
             