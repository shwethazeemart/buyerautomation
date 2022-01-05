Feature: Verify Buyer Inventory Activity lisen Tag Added in Stockcount

Scenario Outline: Verify the Inventory Activity Tag Added in Stockcount of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User clicks on Inventory in the side navigation menubar 
          And User click on outlets icon
          Then User ckicks on outlet "<outletname>"
          Then User click on Activity icon
          Then User click on first count
          Then User click on add tag button in stockcount 
          Then User click on save button in stockcount 
          Then User click on back button in stockcount
          Then User click on consumption report in activity page
     
     @dev     
     Examples:
         |username                            |  |password    | |outletname  |
         |velumanieswaran2020@gmail.com       |  |!123456Zm   | |velu masala |
     
      
    @devSecond    
     Examples:
         |username                            |  |password    | |outletname  |
         |buyerautomated3@gmail.com           |  |!123456Zm   | |velu masala |
             