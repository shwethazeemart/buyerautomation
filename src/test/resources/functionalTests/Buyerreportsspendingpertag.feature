Feature: Verify Buyer Reports spending per Category page and test all the page

Scenario Outline: Verify the Reports spending per Category page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on Reports in the side navigation menubar 
          Then User click on spending per tag icon
          And User click on search box in tag
          Then User Enter the tag name in search box"<name>"
          And User select date from calendar in tag
          Then User click on filter in tag
          And User click on outlets in tag
          Then User click on Check box of velumasala in tag
          Then User click on apply button in tag
          And User click on reset button in tag
          Then User click on outside in tag
          Then User click on filter in tag
          And User click on Suppliers in tag
          Then User click on check box of sabari in tag
          Then User click on apply button in tag
          And User click on reset button in tag
          Then User click on outside in tag
          Then User click on Export download button in tag 
          
          Examples: 
      | username                      | | password   ||name     |
      | velumanieswaran2020@gmail.com | |!123456Zm   ||masala     | 