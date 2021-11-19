Feature: Verify Supplier Payments Transaction list  

Scenario Outline: Verify the Supplier Payments Transaction list 
         Given User is on available Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button
          Then User click on Payments side navigation list menubar
          Then User click on transaction icon
          Then User set date from calendar in transaction page
          Then User click on search button in transaction page
          Then User click on Export button in transaction page
          Then User click on first customer in transaction page
          Then User click on back button payments
          
          
          
          
  Examples:
         |username                     ||password    |
         |mrmanager@gmail.com          ||!123456Zm   |