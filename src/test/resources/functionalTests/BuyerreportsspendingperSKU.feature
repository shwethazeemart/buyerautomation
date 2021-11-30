Feature: Verify Buyer Reports spending per SKU page and test all the page

Scenario Outline: Verify the Reports spending per SKU page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on Reports in the side navigation menubar 
          Then User click on spending per sku icon
          And User click on search box in sku
          Then User Enter the sku name in search box"<name>"
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
          Then User click on filter in sku
          And User click on outlets in sku
          Then User click on Check box in sku
          Then User click on apply button in sku
          And User click on reset button in sku
          Then User click on outside in sku
          Then User click on filter in sku
          And User click on Suppliers in sku
          Then User click on check box in sku
          Then User click on apply button in sku
          And User click on reset button in sku
          Then User click on outside in sku
          Then User click on export download button in sku
          Then User click on hundred pipers sku
          Then User select date from calendar in hundred pipers
          And User click on Today date from calendar
          Then User select date from calendar in hundred pipers
          Then User click on Yesterday date from calendar
          Then User select date from calendar in hundred pipers
          And User click on This week date from calendar
          Then User select date from calendar in hundred pipers
          Then User click on This month from calendar
          Then User select date from calendar in hundred pipers
          And User click on Last year from calendar
          Then User select date from calendar in hundred pipers
          Then User click on Custom range from calendar
          Then User click on apply in custom range
          Then User select date from calendar in hundred pipers
          Then User click on YTD from calendar
          And User select dropdown in month in hundred pipers
          Then User click on bag in hundred pipers
          Then User click on box in hundred pipers
          Then User click on bdl in hundred pipers
          And User click on filter in hundred pipers
          Then User click on outlets in hundred pipers
          Then User click on select all icon in hundred pipers
          Then User click on apply button in hundred pipers
          And User click on reset button in hundred pipers
          Then User click on Outside in hundred pipers
          And User click on export button in hundred pipers
          Then User click on price history icon in hundred pipers
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
          And User select dropdown 
          Then User click on bdl in price history
          Then User click on bag in price history
          Then User click on box in price history
          Then User click download button of export
          
             
     @dev      
     Examples: 
      | username                      | | password   ||name     |
      | buyerautomated3@gmail.com     | |!123456Zm   ||100pipers|     
      
               
     @naren    
     Examples: 
      | username                      | | password   ||name     |
      | buyerautomated1@gmail.com     | |!123456Zm   ||100pipers|     
      
