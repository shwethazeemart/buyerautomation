Feature: Verify Supplier Invoice page tested UI issues

Scenario Outline: Verify the Supplier invoice page
          Given User is on available Login Page
          When User enter correct username"<loginEmail>"
          And User enter correct password"<loginPassword>"
          And User is click login button in supplier panel 
          Then User click on Invoices in the side navigation menubar 
          Then User click on any one invoice invoice menu
          Then User check on changed deliver to and linked to
          
          
          Examples:
         |loginEmail                            |  |loginPassword    |
         |velumanieswaran2020@gmail.com         |  |!123456Zm        |