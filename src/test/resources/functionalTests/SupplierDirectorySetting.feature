Feature: Verify Supplier Directory manage settings page  

Scenario Outline: Verify the Supplier Directory manage settings page
         Given User is on available Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User click on Directory side navigation list menubar
          Then User click on manage settings in directory page
          Then User clear on about the company in general settings page 
          Then User enter on about the company textbox field "<text>"
          Then User click on certifications check box in directory page
          Then User click on save button in directory page
          
          
             
   Examples:
         |username                              ||password    | |text         |
         |supplierautomated2@gmail.com          ||!123456Zm   | |Fresh fruits |
