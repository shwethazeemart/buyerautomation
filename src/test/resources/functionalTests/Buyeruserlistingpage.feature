Feature: Verify Buyer  Users listing page testcases and test all the page

Scenario Outline: Verify the Users Listing page of Buyer panel 
  
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          And User Clicks on Users in the side navigation menubar 
          Then User is click on check box of user "<username>"
          And User click on clear icon in edit user page
          Then User is click on check box of user "<username>"
          And User click on delete icon 
          Then User click on delete close icon
          And User click on clear icon in edit user page
          Then User click on search box in edit user page
          And User enter the name in search box in edit user page"<name>"
          
    @dev     
    Examples:
         |username                         |  |password    ||name      |  |username  |
         |velumanieswaran2020@gmail.com    |  |!123456Zm   ||velu mani2|  |velu mani2|
    
    @devSecond 
     Examples:
         |username                         |  |password    ||name      |  |username  |
         |buyerautomated3@gmail.com        |  |!123456Zm   ||velu mani2|  |velu mani2|
    