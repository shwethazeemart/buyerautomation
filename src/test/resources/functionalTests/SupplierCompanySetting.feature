Feature: Verify Supplier Company Setting list  

Scenario Outline: Verify the Supplier Company Settings list 
         Given User is on available Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button
          Then User click on user account icon
          Then User click on company settings in user account page
          Then User click on details in company settings
          Then User click on payments in company settings
          Then User click on invoicing in company settings
          Then User click on integration in company settings
          Then User click on subscription in company settings
          Then User click on view priceing options in subscription

                 
          
  Examples:
         |username                     ||password    |
         |mrmanager@gmail.com          ||!123456Zm   |