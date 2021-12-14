Feature: Verify Buyer Reports spending per tag page and test all the page
@Smoke
Scenario Outline: Verify the Reports spending per tag page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on Reports in the side navigation menubar 
          Then User click on spending per tag icon  
          And User click on food Tag      
          Then User click on filter tag in food
          And User click on outlets in tag
          Then User click on Check box in food tag 
          Then User click on apply button in tag
          Then User click on filter tag in food
          And User click on reset button in tag
          Then User click on outside tag 
          Then User click on filter tag 
          And User click on Suppliers in tag
          Then User click on check box in tag
          Then User click on apply button in tag
          Then User click on filter tag 
          And User click on reset button in tag
          Then User click on outside tag 
          Then User click on back button of spending report
          Then User click on back button of reports
          
          
  @dev        
  Examples: 
      | username                          | | password   ||name       ||outletname      ||suppliername |
      | velumanieswaran2020@gmail.com     | |!123456Zm   ||masala     ||velu masala2020 ||sabari250    |
      
    
  
      
