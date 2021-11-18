Feature: Verify Supplier Reports Outlet list  

Scenario Outline: Verify the Supplier Outlet list 
         Given User is on available Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button
          Then User click on Reports side navigation list menubar
          Then User click on orders received outlet
          Then User select date from calendar icon
          Then User click on search icon in orders recevied page
          Then User click filter in orders received
          Then User select customer in dropdown list
          Then User select team in dropdown list
          Then User click on apply button in recevied outlet page
          Then User click on scroll down
          Then User click on outlet in recevied outlet page
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
          Then User click on export icon in orders recevied page
          
          
          
  Examples:
         |username                              ||password    |
         |supplierautomated2@gmail.com          ||!123456Zm   |