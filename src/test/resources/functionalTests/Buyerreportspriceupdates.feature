Feature: Verify Buyer Reports Price updates page and test all the page

Scenario Outline: Verify the Reports price updates Category page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on Reports in the side navigation menubar 
          Then User click on Price updates icon
          And User click on search box in price updates
          Then User Enter the  sku name in search box"<sku>"
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
          Then User select from dropdown value of outlet velumasala in price updates
          Then User click on filter in price updates
          And User select supplier in dropdown list of sabari
          Then User click on Apply button in price updates
          Then User click on reset button in price updates
          And User click on outside in price updates
          Then User click on Download button first page
          Then User click on export download button in price updates
          Then User click on Reports back button in price updates
          Then User click on Reports back button in sku page
            
          
     Examples: 
      | username                      | | password   ||sku       |
      | velumanieswaran2020@gmail.com | |!123456Zm   ||100pipers | 