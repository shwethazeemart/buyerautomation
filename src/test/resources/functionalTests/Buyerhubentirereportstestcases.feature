Feature: Verify Buyer hub entire Reports screen testcases

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
      
      
 Scenario Outline: Verify the Reports spending per SKU page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on Reports in the side navigation menubar 
          Then User click on spending per sku icon
          And User click on search box in sku
          Then User Enter the sku name in search box"<name>"
          And User select date from calendar in sku
          Then User click on filter in sku
          And User click on outlets in sku
          Then User click on Check box of velumasala in sku
          Then User click on apply button in sku
          And User click on reset button in sku
          Then User click on outside in sku
          Then User click on filter in sku
          And User click on Suppliers in sku
          Then User click on check box of sabari in sku
          Then User click on apply button in sku
          And User click on reset button in sku
          Then User click on outside in sku
          Then User click on export download button in sku
          
          
     Examples: 
      | username                      | | password   ||name     |
      | velumanieswaran2020@gmail.com | |!123456Zm   ||100pipers|     
      
      
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
          
          Examples: 
      | username                      | | password   ||name     |
      | velumanieswaran2020@gmail.com | |!123456Zm   ||Beer     | 
      
      
Scenario Outline: Verify the Reports spending per tag page of Buyer panel 
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
      | username                      | | password   ||name       |
      | velumanieswaran2020@gmail.com | |!123456Zm   ||masala     |                        
      
      
Scenario Outline: Verify the Reports invoice variance page of Buyer panel 
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
      
      
 Scenario Outline: Verify the Reports price updates page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on Reports in the side navigation menubar 
          Then User click on Price updates icon
          And User click on search box in price updates
          Then User Enter the  sku name in search box"<sku>"
          And User click on calendar in price updates
          Then User click on YTD from calendar in price updates
          Then User select from dropdown value of outlet velumasala in price updates
          Then User click on filter in price updates
          And User select supplier in dropdown list of sabari
          Then User click on Apply button in price updates
          Then User click on reset button in price updates
          And User click on outside in price updates
          Then User click on export download button in price updates
          Then User click on Reports back button in price updates
          Then User click on Reports back button in sku page
          
          
     Examples: 
      | username                      | | password   ||sku       |
      | velumanieswaran2020@gmail.com | |!123456Zm   ||100pipers |             