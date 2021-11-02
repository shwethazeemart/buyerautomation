Feature: Verify Supplier Orders e-invoice listing page  

Scenario Outline: Verify the Supplier Orders e-invoice listing page
         Given User is on available Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User click on Invoices side navigation list menubar
          Then User click new invoice button
          Then User select location in delivery dropdown
          Then User select sakthimasala in the drodown list
          Then User enter email in bill to field"<email>"
          Then User enter order number in order number field"<ordernumber>"
          Then User select payment terms in dropdown list
          Then User enter sales person name in name field"<personname>" 
          Then User enter mobile number in sales person field"<mobilenumber>"
          Then User click on add sku button
          Then User click on enter sku name in dropdown field
          Then User click on sakthimasala sku in dropdown field
          Then User clear the quantity field
          Then User enter the quantity value in that field"<quantityvalue>"
          Then User clear the unit price field
          Then User enter the unit price value in that field"<unitprice>"
          Then User clear delivery fees field
          Then User click on final save and issue button
          Then User click on first invoice checkbox in list of invoices page
          Then User click on clear button in lisf of invoices page
          Then User click on first invoice checkbox in list of invoices page
          Then User click on mark as paid button
          Then User click on yes mark as paid in popup message
          Then User click on first invoice checkbox in list of invoices page
          Then User click on export xero in first invoice check box
          Then User click on yes proceed popup message
          Then User click actions dropdown of third invoice in invoices list page
          Then User click void actions dropdown of third invoice in invoices list page
          Then User click on reason in popup message
          Then User enter some reason in popup message"<reason>"
          Then User click on void button in popup message
          Then User click actions dropdown of third invoice in invoices list page
          Then User click on duplicate in action dropdown field
          Then User click on finally save and issue button of duplicate
          Then User click on filter button in invoices page
          Then User click on deliver to link in invoices page 
          Then User click on select all icon in invoices page
          Then User click on apply button in invoices page
          Then User click on filter button in invoices page
          Then User click on reset button in invoices page
          Then User click on filter button in invoices page
          Then User click on invoice status link in invoices page
          Then User click on select all icon in invoices page
          Then User click on apply button in invoices page
          Then User click on filter button in invoices page
          Then User click on reset button in invoices page
          Then User click on filter button in invoices page
          Then User click on payment status in invoices page
          Then User click on select all icon in invoices page
          Then User click on apply button in invoices page
          Then User click on filter button in invoices page
          Then User click on reset button in invoices page
          Then User click on filter button in invoices page
          Then User click on export status in invoices page
          Then User click on select all icon in invoices page
          Then User click on apply button in invoices page
          Then User click on filter button in invoices page
          Then User click on reset button in invoices page
          Then User click on filter button in invoices page 
          Then User select due date in dropdown list
          Then User click on apply button in invoices page
          
    
          
          
          
          Examples:
         |username                              ||password    ||email                ||ordernumber ||personname||mobilenumber||quantityvalue||unitprice||reason                          |
         |supplierautomated2@gmail.com          ||!123456Zm   ||velumani@zeemart.asia||202110270048||velu      ||65123456789 ||10           ||18       ||already available in stock count|