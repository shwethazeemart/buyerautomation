Feature: Verify Buyer Outlet View suppliers page and test all the page

Scenario Outline: Verify the Outlets view suppliers page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>" 
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on outlets in the side navigation menubar
          And User clicks actions dropdown
          Then User clicks on View suppliers
          And User clicks on the actions dropdown
          Then User Click on view market list
          And User click on name search box
          Then User Enter on name in name searchbox field"<name>"
          And User click on check box of product code
          Then User Click on Edit tags
          Then User click on Edit tags close icon
          And User click on Delete button
          Then User click on Delete button close icon
          Then User click on check box clear button
          And User click on options icon
          Then User click on copy to another outlet
          And User click on select all icon
          Then User click on ok button
          And User click on options icon
          Then User click on Download marketlist
          
    @dev       
    Examples: 
      | username                          | | password   ||name      |
      | velumanieswaran2020@gmail.com     | |!123456Zm   ||classyyy    |            
      
   @devSecond        
    Examples: 
      | username                      | | password   ||name      |
      | buyerautomated3@gmail.com     | |!123456Zm   ||classyyy    |            
    
      
  