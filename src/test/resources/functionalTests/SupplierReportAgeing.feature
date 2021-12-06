Feature: Verify Supplier Reports Ageing Receviables list  

Scenario Outline: Verify the Supplier Reports Ageing list 
         Given User is on available Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button
          Then User click on Reports side navigation list menubar
          Then User click on Ageing receviables in report page
          Then User click on update button in ageing
          Then User click on export button in ageing 
          Then User click on first company
          Then User select outlet in dropdown lists in ageing
          Then User click on update button in ageing
          Then User click on export button in ageing
          Then User click on first invoice number in ageing
          
          
          
  Examples:
         |username                       ||password    ||stockcount|
         |supplierautomated2@gmail.com   ||!123456Zm   ||10        |