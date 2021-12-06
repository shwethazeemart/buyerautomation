Feature: Verify Buyer Reports spending per supplier page and test all the page
@Smoke
Scenario Outline: Verify the Reports spending per supplier page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on Reports in the side navigation menubar 
          Then User click on spending per supplier icon
          And User click on supplier search box
          Then User enter supplier name in search box"<name>"
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
          And User click on filter in supplier
          Then User click on outlets
          Then User click on check box "<outletname>"
          Then User click on Apply button in supplier
          Then User click on Reset button in supplier
          Then User click on outside in supplier
          And User click Export download button
          Then User click on supplier
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
          And User select dropdown in month 
          Then User click download button of export
          Then User click on back button of spending report
          Then User click on back button of reports 
          
             
     @dev     
     Examples: 
      | username                          | | password   ||name     | |outletname     |
      | velumanieswaran2020@gmail.com     | |!123456Zm   ||sabari250| |velu masala2020|
      
    