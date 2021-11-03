Feature: Verify Supplier Orders e-invoice listing page  

Scenario Outline: Verify the Supplier Orders e-invoice listing page
         Given User is on available Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User click on Orders side navigation list menubar
          Then User click on first order in order list page
          Then User click on acknowledge button in first order
          Then User click on ok button of popmessage
          Then User click on create einvoice icon in first order
          Then User click on email field in einvoice page
          Then User enter the email einvoice field"<emailfield>" 
          Then User click on delivery field in einvoice page
          Then User enter delivery fees in einvoice page"<deliveryfees>" 
          Then User click on save and issue button in einvoice page
          Then User click on Orders side navigation list menubar
          Then User click on first order in order list page
          Then User click on options dropdown in first order
          Then User click on download packing slip in first order
          Then User click on options dropdown in first order
          Then User click on mark as shipped in first order
          Then User click on back order button in first order
          Then User click on fifth order in order list page
          Then User click on options dropdown in first order
          Then User click on partially shipped in fifth order list
          Then User click on back order button in first order
          Then User click on sixth order in order list page 
          Then User click on options dropdown in first order
          Then User click on void order in sixth order
          Then User click on requested by buyer in sixth order
          Then User click on void order button in sixth order
          Then User click on first order in order list page
          Then User click on options dropdown in first order
          Then User click on Download PDF in first order page
           
          
          
          
          Examples:
         |username                              ||password    ||emailfield           ||deliveryfess|
         |supplierautomated2@gmail.com          ||!123456Zm   ||velumani@zeemart.asia||10          |