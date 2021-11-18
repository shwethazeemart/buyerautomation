Feature: Verify Supplier Reports SKU list  

Scenario Outline: Verify the Supplier SKU list 
         Given User is on available Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button
          Then User click on Reports side navigation list menubar
          Then User click on orders received sku
          Then User click on search sku orders recevied page
          Then User enter sku name in search icon"<skuname>"
          Then User select invoice date from calendar field
          Then User select on outlets in dropdown list
          Then User click on search icon in orders received sku page
          Then User click on export icon in sku page
          Then User click on sku in orders recevied sku page
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
          Then User click on bdl quantity order
          Then User click on bch quantity order
          Then User click on blk quantity order
          Then User click on box quantity order
          Then User click on filter in sku page
          Then User select outlet in dropdown list in sku page
          Then User click on apply button in sku page
          Then User click on filter in sku page
          Then User click on export icon in sku apge
          
  Examples:
         |username                              ||password    ||skuname        |
         |supplierautomated2@gmail.com          ||!123456Zm   ||Sakthimasala100|  