Feature: Verify Buyer Invoice screen Entire testcases

Scenario Outline:Buyer Invoice lisen page verify the all field 
    Given User is on Login Page
    When User enters exact username "<username>"
    When User enters exact password"<loginPassword>"
    Then User click on login button
    Then User clicks on Invoices in the side navigation menubar
    And User clicks on Pay online
    Then User clicks on pay online close icon
    And User clicks on upload invoice  
    Then User clicks on upload invoice close icon
    And User click on any one of check box
    Then User click on download data
    And User click on export to accounting system 
    Then User click on cancel button in accounting system
    Then User click on clear button
    And User click on invoice
    Then User click on return invoice icon 
    And User click on credit note invoice
    Then User click on credit note return invoice icon 
    And User click on voided invoice
    Then User click on voided return invoice icon
    And User click on filter icon
    Then User click on calendar from date
    Then User click on search icon
    And User enter invoice number in first textbox 
    Then User click on search icon
    And User clear on invoice number in first time first textbox
    Then User click on search icom in second time
    
    
    
    @dev
    Examples: 
      | username                         || loginPassword|
      | buyerautomated3@gmail.com        || !123456Zm    |
      
    @naren
    Examples: 
      | username                         || loginPassword|
      | buyerautomated1@gmail.com        || !123456Zm    | 
       
      
       
   
  
 Scenario Outline: Verify the Invoices upload page of Buyer panel
         Given User is on Login Page
         When User enter exact username"<username>"
         And User enter exact password"<password>"
         And User is click login button 
         Then User Clicks on Invoices in the side navigation menubar
         And User is Clicks in Uploads 
         Then User is Clicks in Upload invoice
         And User is Clicks on select outlet
         Then User is Clicks on upload the image
         And User is Clicks on Upload button
         Then It should display the particular image number and process button 
         
     
    @dev
    Examples: 
      | username                         || loginPassword|
      | buyerautomated3@gmail.com        || !123456Zm    |
            
      
    @naren
    Examples: 
      | username                         || loginPassword|
      | buyerautomated1@gmail.com        || !123456Zm    |
             
               
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
         |invoicenumber |  |username                     |  |password    |
         |INV-908765  s |  |buyerautomated3@gmail.com    |  |!123456Zm   |      
                           
