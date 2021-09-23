Feature: Verify Supplier Customers page functional test

Scenario Outline: Verify the Supplier Customers page
          Given User is on available Login Page
          When User enter correct username"<loginEmail>"
          And User enter correct password"<loginPassword>"
          And User is click login button in supplier panel 
          Then User click on Customers in the side navigation menubar 
          Then User click on New customer icon in customers page
          Then User enter UEN number in the registration field "<UEN>"
          Then User click on continue button
          Then User enter the company name "<companyname>"
          Then User select country in address field
          Then User enter the postcode in address field "<postcode>"
          Then User enter the Address line one in address field "<addresslineone>"
          Then User enter the Address line two in address field "<addresslinetwo>"
          Then User enter the company email "<companyemail>"
          Then User click on same company address checkbox
          Then User finally click on sava button 
          
          
          Examples:
         |loginEmail                            |  |loginPassword    ||UEN    ||companyname         ||postcode||addresslineone        ||addresslinetwo||companyemail         |
         |velumanieswaran2020@gmail.com         |  |!123456Zm        ||UEN-769||VELU MUTTON MASALA||638312  ||05,Murugan koil street||Singapore     ||velumani@zeemart.asia|