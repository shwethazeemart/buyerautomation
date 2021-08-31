Feature: Verify Buyer Reports Invoice variance page and test all the page

Scenario Outline: Verify the Reports invoice variance Category page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on Reports in the side navigation menubar 
          Then User click on Invoice variance icon
          And User click on search box in invoice variance
          Then User Enter the  invoice number in search box"<invoice>"
          And User select date from calendar in invoice variance
          Then User select from dropdown value of velumasala
          Then User click on filter in invoice variance
          And User select supplier in dropdown list
          Then User select match status in dropdown list
          And User click on Apply button in invoice variance
          Then User click on reset button in invoice variance
          And User click on outside in invoice variance
          Then User click on export download button in invoice variance
          Then User click on Reports back button in invoice variance
          
          
     Examples: 
      | username                      | | password   ||invoice     |
      | velumanieswaran2020@gmail.com | |!123456Zm   ||vel-1234567 | 