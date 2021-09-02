Feature: Verify Buyer Reports spending per supplier page and test all the page

Scenario Outline: Verify the Reports spending per supplier page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on Reports in the side navigation menubar 
          Then User click on spending per supplier icon
          And User click on supplier search box
          Then User enter supplier name in search box"<name>"
          Then User select date from calendar in supplier
          And User click on filter in supplier
          Then User click on outlets
          Then User click on check box velumasala
          Then User click on Apply button in supplier
          Then User click on Reset button in supplier
          Then User click on outside in supplier
          And User click Export download button
          
             
          
     Examples: 
      | username                      | | password   ||name     |
      | velumanieswaran2020@gmail.com | |!123456Zm   ||sabari250|