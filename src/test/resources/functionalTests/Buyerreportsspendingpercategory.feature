Feature: Verify Buyer Reports spending per Category page and test all the page

Scenario Outline: Verify the Reports spending per Category page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on Reports in the side navigation menubar 
          Then User click on spending per category icon
          And User click on search box in category
          Then User Enter the category name in search box"<name>"
          And User select date from calendar in category
          Then User click on search icon in category
          Then User click on filter in category
          And User click on outlets in category
          Then User click on Check box of velumasala in category
          Then User click on apply button in category
          And User click on reset button in category
          Then User click on outside in category
          Then User click on filter in category
          And User click on Suppliers in category
          Then User click on check box of sabari in category
          Then User click on apply button in category
          And User click on reset button in category
          Then User click on outside in category
          And User click on Beer category
          Then User select date from calendar in Beer
          And User select dropdown in month Beer
          Then User click on filter in category
          And User click on outlets in category
          Then User click on Check box of velumasala in category
          Then User click on apply button in category
          And User click on reset button in category
          Then User click on outside in category in Beer
          Then User click on filter in category
          And User click on Suppliers in category
          Then User click on check box of sabari in category
          Then User click on apply button in category
          Then User click on outside in category in Beer
          Then User click download button of export
          Then User click on back button of spending report
          Then User click on back button of reports
          
          
  Examples: 
      | username                      | | password   ||name     |
      | velumanieswaran2020@gmail.com | |!123456Zm   ||Beer     | 