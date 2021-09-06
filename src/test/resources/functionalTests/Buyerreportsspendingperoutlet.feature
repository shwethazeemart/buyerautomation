Feature: Verify Buyer Reports spending per outlet page and test all the page

Scenario Outline: Verify the Reports spending per outlet page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on Reports in the side navigation menubar 
          Then User click on spending per outlet icon
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
          And User click on velu masala download button
          Then User click on velu masala summary button
          And User click on velu masala detailed button
          Then User click on velu masala List of invoices button
          And User click on velu masala outlet icon
          And User select dropdown in month 
          Then User click download button of export
          Then User click on back button of spending report
          Then User click on back button of reports
          
          
      Examples: 
      | username                      | | password   |
      | velumanieswaran2020@gmail.com | |!123456Zm   |