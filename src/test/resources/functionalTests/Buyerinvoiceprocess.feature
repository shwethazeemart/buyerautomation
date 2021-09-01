Feature: Verify Buyer Invoice upload page and test all the page

@Smoke
Scenario Outline: Verify the Invoices process page of Buyer panel 
          Given User is on Login Page
          When User is enter Registered username"<username>"
          And User are enter Registered password"<password>"
          And User is click login button 
          And User is Clicks Invoices in the side navigation menubar
          Then User are Clicks in Uploads
          Then User are clicks in Today button
          And User is Clicks in Process button
          Then User are Select supplier in the dropdown lists
          And User is set the invoice number"<invoicenumber>"
          Then User are Clicks in Validate button 
          And User is Select date in the calendar options
          Then User are Clicks the Order number in textbox 
          When User are Select the Order number in textbox lists
          And User is Clicks in Use data
          Then User are Click yes processed POP
          And User is Select the Payments terms in the dropdown lists
          Then User are Clicks the Publish this invoice
          Then It should display invoice in invoices page
          
         Examples:
         |invoicenumber|  |username                     |  |password    |
         |INV-20123456 |  |velumanieswaran2020@gmail.com|  |!123456Zm   |      
         