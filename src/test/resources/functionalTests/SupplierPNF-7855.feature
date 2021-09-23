Feature: Verify Supplier Customers page tested name changes

Scenario Outline: Verify the Supplier Customers page
          Given User is on available Login Page
          When User enter correct username"<loginEmail>"
          And User enter correct password"<loginPassword>"
          And User is click login button in supplier panel 
          Then User click on Customers in the side navigation menubar 
          Then User check on verify the Location
          Then User check on changed to search icon location
          Then User check on Column is location
          
          
          Examples:
         |loginEmail                            |  |loginPassword    |
         |velumanieswaran2020@gmail.com         |  |!123456Zm        |