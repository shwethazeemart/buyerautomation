Feature: Verify Supplier Customers Location listing page  

Scenario Outline: Verify the Supplier customers location listing page
         Given User is on available Login Page
          When User enter correct username"<loginEmail>"
          And User enter correct password"<loginPassword>"
          And User is click login button in supplier panel 
          Then User click on Customers side navigation list menubar
          Then User enter name in search box sakthimasala "<name>" 
          Then User click on checkbox in location page
          Then User click on apply outlet setting button
          Then User select on dropdown value of sakthimasala
          Then User click on select all button
          Then User click on apply button
          Then User click on checkbox in location page
          Then User click on clear button in location page 
          Then User click on actions dropdown in location page
          Then User click on Manage settings in location page
          Then User click on customers backbutton 
          Then User click on actions dropdown in location page
          Then User click on Manage market list in location page
          Then User click on Customers backbutton in manage market page
          Then User click on Default settings in location page
          Then User click on Customers backbutton in default settings page
          Then User click on New customers in location page
          Then User click on customers backbutton in new customers page
           
          Examples:
         |loginEmail                            |  |loginPassword    ||name           | 
         |supplierautomated2@gmail.com          |  |!123456Zm        ||Sakthimasala100|