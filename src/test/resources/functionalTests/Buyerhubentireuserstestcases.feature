Feature: Verify Buyer Users Entire page tesstcases

Scenario Outline: Verify the Users Add new user page of Buyer panel 
  
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          And User Clicks on Users in the side navigation menubar 
          Then User is Clicks in Add new user button
          When User are Select Company in the textbox lists
          When User is Selct Outlet in the textbox lists
          And User enter the First name in the First name field"<First name>"
          Then User enter the Last name in the Last name field"<Last name>"
          And User enter Job title in the Job title field"<Job title>"
          Then User are enter Email in the Email field"<Email>"
          And User is Clicks checkbox
          Then User are clear the Mobile phone field
          Then User are enter Mobile phone in the Mobile phone field"<Mobile phone>"  
          And User is upload Profile photo in that field
          Then User is Select Owner in the permissions dropdown
          Then User is Clicks Save button 
          
    Examples:
         |username                     |  |password    ||First name||Last name ||Job title    ||Email                              ||Mobile phone|
         |velumanieswaran2020@gmail.com|  |!123456Zm   ||eswaran   ||ganesh    ||ATZ          ||ganeshtamil2009@gmail.com          ||+6512345677 | 
         
         
                
    
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
    
       
    