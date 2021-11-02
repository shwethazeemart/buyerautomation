Feature: Verify Supplier Invoices listing page  

Scenario Outline: Verify the Supplier Invoices listing page
         Given User is on available Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User click on Invoices side navigation list menubar
          Then User click on first invoice in the invoices list page
          Then User click on mark as paid button in that invoice page
          Then User click on yes mark as paid in popup message in the invoice page
          Then User click on first invoice in the invoices list page
          Then User click on options dropdown in the invoice page
          Then User click on add credit note in the invoice page 
          Then User click on quantity field in credit note page
          Then User clear on quantity field in credit note page
          Then User enter on value in quantity field"<quantityvalue>"
          Then User click on scroll down in credit note page
          Then User click on save and issue button in credit note page
          Then User click on first invoice in the invoices list page
          Then User click on options dropdown in the invoice page
          Then User click on duplicate options dropdown field
          Then User click on scroll down in duplicate page
          Then User click on save and issue button in duplicate page
          Then User click on first invoice in the invoices list page
          Then User click on options dropdown in the invoice page
          Then User click on void link in invoice page
          Then User click on reason in invoice field popup message
          Then User enter on reason in invoice field popup message"<reason>"
          Then User click on void button in popup message
          Then User click on first invoice in the invoices list page
          Then User click on options dropdown in the invoice page
          Then User click on download DO in options dropdown field
    
    
    
    
    
     Examples:
         |username                              ||password    |quantityvalue||reason         |
         |supplierautomated2@gmail.com          ||!123456Zm   |1            ||stock available|