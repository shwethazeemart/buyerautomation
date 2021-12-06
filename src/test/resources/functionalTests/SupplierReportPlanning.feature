Feature: Verify Supplier Reports Supply Planning list  

Scenario Outline: Verify the Supplier Reports Planning list 
         Given User is on available Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button
          Then User click on Reports side navigation list menubar
          Then User click on supply planning in report page
          Then User set date in calendar field
          Then User click on generate report button
          Then User click on download as csv button
          Then User click on first code in supply planning
          Then User clear on quantity stock count today
          Then User enter on quantity stock count today"<stockcount>"
          Then User click on checkbox stock count
          Then User click on save button stock count
          
          
          
  Examples:
         |username                  ||password    ||stockcount|
         |mrmanager@gmail.com       ||!123456Zm   ||10        |