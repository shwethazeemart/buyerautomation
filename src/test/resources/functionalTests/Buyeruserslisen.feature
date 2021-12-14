Feature: Verify Buyer Users page and test all the page
@Smoke
Scenario Outline: Verify the Users page of Buyer panel 
  
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
          
    @dev      
    Examples:
         |username                       ||password    ||First name||Last name ||Job title    ||Email                              ||Mobile phone|
         |velumanieswaran2020@gmail.com  ||!123456Zm   ||velu      ||ganesh    ||ATZ          ||ganeshvelumanitamil902008@gmail.com      ||+6512345677 |       
    
    