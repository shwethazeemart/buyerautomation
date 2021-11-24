Feature: Verify Supplier Payment Plans list  

Scenario Outline: Verify the Supplier Payments Plans list 
         Given User is on available Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button
          Then User click on Payments side navigation list menubar
          Then User click on payment plans icon
          Then User select failed payment status in dropdown lists
          Then User select unpaid payment status in dropdown lists
          Then User select paid payment status in dropdown lists
          Then User click on paid status company
          Then User click on issued bill amount
          Then User click on Bill issued invoice
          
          
          
          
  Examples:
         |username                     ||password    |
         |mrmanager@gmail.com          ||!123456Zm   |