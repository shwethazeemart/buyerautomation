Feature: Verify Buyer Reports spending per tag page and test all the page

Scenario Outline: Verify the Reports spending per tag page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on Reports in the side navigation menubar 
          Then User click on spending per tag icon
          And User click on search box in tag
          Then User Enter the tag name in search box"<name>"
          Then User select date from calendar
          And User click on Today date from calendar
          Then User select date from calendar
          Then User click on Yesterday date from calendar
          Then User select date from calendar
          And User click on This week date from calendar
          Then User select date from calendar
          Then User click on This month from calendar
          Then User select date from calendar
          And User click on Last year from calendar
          Then User select date from calendar
          Then User click on Custom range from calendar
          Then User click on apply in custom range
          Then User select date from calendar
          Then User click on YTD from calendar
          Then User click on filter in tag
          And User click on outlets in tag
          Then User click on Check box in tag
          Then User click on apply button in tag
          And User click on reset button in tag
          Then User click on outside in tag
          Then User click on filter in tag
          And User click on Suppliers in tag
          Then User click on check box of tag
          Then User click on apply button in tag
          And User click on reset button in tag
          Then User click on outside in tag
          Then User click on Export download button in tag
          And User click on food Tag 
          Then User select date from calendar 
          And User click on Today date from calendar
          Then User select date from calendar
          Then User click on Yesterday date from calendar
          Then User select date from calendar
          And User click on This week date from calendar
          Then User select date from calendar
          Then User click on This month from calendar
          Then User select date from calendar
          And User click on Last year from calendar
          Then User select date from calendar
          Then User click on Custom range from calendar
          Then User click on apply in custom range
          Then User select date from calendar
          Then User click on YTD from calendar
          And User click on Export download button in food
          Then User click on filter tag in food
          And User click on outlets in tag
          Then User click on Check box in tag
          Then User click on apply button in tag
          And User click on reset button in tag
          Then User click on outside tag 
          Then User click on filter tag 
          And User click on Suppliers in tag
          Then User click on check box  in tag
          Then User click on apply button in tag
          And User click on reset button in tag
          Then User click on outside tag 
          Then User click on back button of spending report
          Then User click on back button of reports
          
          
  @dev        
  Examples: 
      | username                      | | password   ||name       |
      | buyerautomated3@gmail.com     | |!123456Zm   ||masala     | 
      
  @naren        
  Examples: 
      | username                      | | password   ||name       |
      | buyerautomated1@gmail.com     | |!123456Zm   ||masala     | 
        
      
      