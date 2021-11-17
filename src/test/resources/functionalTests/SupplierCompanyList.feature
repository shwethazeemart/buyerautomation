Feature: Verify Supplier Customers Company list  

Scenario Outline: Verify the Supplier customers Company list 
         Given User is on available Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User click on Customers side navigation list menubar
          Then User click on companies icon
          Then User click on new customer
          Then User enter company registration number in textbox"<UENNumber>"
          Then User click on continue button
          Then User enter the company name in textbox"<CompanyName>"
          Then User select country in dropdown list
          Then User enter on postcode in textbox"<PostCode>"
          Then User enter on address line one in textbox"<AddressLineOne>"
          Then User enter on address line two in textbox"<AddressLineTwo>"
          Then User enter on company email in textbox"<CompanyEmail>"
          Then User click on checkbox in same company address
          Then User click on save button in company page
          
       
          
   Examples:
         |username                      |  |password   ||UENNumber||CompanyName ||PostCode||AddressLineOne           ||AddressLineTwo||CompanyEmail         |
         |supplierautomated2@gmail.com  |  |!123456Zm  ||UEN-2021  ||sairammasala||638312  ||19,Murugan temple street ||Singapore     ||velusai2032@gmail.com|
