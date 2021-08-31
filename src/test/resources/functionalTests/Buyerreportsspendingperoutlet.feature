Feature: Verify Buyer Reports spending per outlet page and test all the page

Scenario Outline: Verify the Reports spending per outlet page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on Reports in the side navigation menubar 
          Then User click on spending per outlet icon
          Then User select date from calendar
          And User click on filter
          Then User click on suppliers
          And User click on check box of sabari
          Then User click on Apply button
          Then User click on Reset button
          Then User click on outside 
          And User click on filter 
          Then User click on invoice and credit note
          And User click on check box of processed
          Then User click on check box of issued
          Then User click on Apply button
          Then User click on Reset button
          Then User click on outside 
          And User click on filter 
          Then User click on payment status
          And User click on unpaid check box
          Then User click on paid check box
          Then User click on Apply button
          Then User click on Reset button
          Then User click on outside 
          And User click on filter 
          Then User click on Export status
          Then User click on Exported check box
          Then User click on Not Exported check box
          Then User click on Apply button
          Then User click on Apply button
          Then User click on Reset button
          Then User click on outside
          And User click on Export download button
          Then User click on export page is CSV
          And User click on Export download button
          Then User click on Detailed report
          
          
          
      Examples: 
      | username                      | | password   |
      | velumanieswaran2020@gmail.com | |!123456Zm   |