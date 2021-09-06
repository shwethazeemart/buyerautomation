Feature: Verify Buyer Edit Users page and test all the page

Scenario Outline: Verify the Edit Users page of Buyer panel 
  
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          And User Clicks on Users in the side navigation menubar 
          Then User is click on check box of aruloli user
          And User click on delete icon 
          Then User click on delete close icon
          And User click on clear icon in edit user page
          Then User click on search box in edit user page
          And User enter the name in search box in edit user page"<name>"
          Then User clear on search box in edit user page
          Then User click on velumanitwo user
          And User clear the job title
          Then User enter the job title"<title>"
          And User clear the Email address
          Then User enter the Email in email filed"<Email>"
          And User clear the mobile phone field
          Then User enter the mobile number in mobile phone field"<mobilephone>"
          Then User click save button in edit user page
          
    Examples:
         |username                     |  |password    ||title      ||Email                            ||mobilephone  ||name      |  
         |velumanieswaran2020@gmail.com|  |!123456Zm   ||AtoZ test  ||velumanieswaran2020@gmail.com    ||+65122456789 ||velu mani2|         
    
    