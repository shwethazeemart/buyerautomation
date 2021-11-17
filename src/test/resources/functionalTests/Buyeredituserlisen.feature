Feature: Verify Buyer Edit Users page and test all the page

Scenario Outline: Verify the Edit Users page of Buyer panel 
  
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          And User Clicks on Users in the side navigation menubar 
          Then User click on velumanitwo user
          And User clear the job title
          Then User enter the job title"<title>"
          And User clear the Email address
          Then User enter the Email in email filed"<Email>"
          And User clear the mobile phone field
          Then User enter the mobile number in mobile phone field"<mobilephone>"
          Then User click save button in edit user page
          
    Examples:
         |username                     |  |password    ||title      ||Email                            ||mobilephone  | 
         |velumanieswaran2020@gmail.com|  |!123456Zm   ||AtoZ test  ||velumanieswaran2020@gmail.com    ||+65122456789 |     
         