Feature: Verify Buyer Invoice page and test all the page
 
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
    
    
    
  
    Examples: 
      | username                         || loginPassword|
      | velumanieswaran2020@gmail.com    || !123456Zm    | 
      

Scenario Outline: Verify the Invoices page of Buyer panel
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
         
     Examples:
             |username                     |  |password    |
             |velumanieswaran2020@gmail.com|  |!123456Zm   |

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
         
         
Scenario Outline: Verify the Orders page of Buyer panel
         Given User is on Login Page
         When User enter exact username"<username>"
         And User enter exact password"<password>"
         And User is click login button  
         And User Clicks Orders in the side navigation menubar
         And User Clicks New order dropdown value
         And User Clicks New order in the dropdown value
         And User Clicks velu masala2020 in the Suppliers page 
         And User Clicks in Add to order of SKU
         Then User Clicks increase the order button
         And User Clicks in Add to order of SKU
         Then User Clicks increase the order button
         Then User Clicks second time increase the order button
         Then User Clicks third time increase the order button 
         Then User Clicks fourth time increase the order button
         Then User Clicks fifth time increase the order button
         And User Clicks in Add to order of SKU
         Then User Clicks increase the order button
         And  User Clicks Review order
         And User Clicks Place Order
         And User clicks the Back to Orders button 
         Then User click the newly created order
         Then User Copy the particular order number in newly created 
         Then User clicks backbutton orders
         Then User paste the newly created order number in Search order ID
         And User Clicks Search button in the orders page
         Then It should display the particular order ID "<order ID>"

          Examples:
             |Order ID        ||username                     |  |password    |
             |202011130001    ||velumanieswaran2020@gmail.com|  |!123456Zm   |     
             
             
             
Scenario Outline: Verify the New recurring orders page of Buyer panel  
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          When User is click login button 
          And User is Clicks Orders in the side navigation menubar
          When User in Clicks New order dropdown value
          When User Clicks New recurring orders in the dropdown value 
          When User select outlet in the dropdown list
          When User select supplier in the dropdown list
          When User Clicks on deliver date in tuesday
          When User Clicks on deliver date in wednesday
          When User Clicks on checkbox Public holidays
          When User Clicks on Radio button of Never
          When User select contact person in the dropdown list
          When User Clicks on the Done button 
          When User Clicks on Add to order in the first product
          Then User Clicks on first time increase the order button in the first product
          Then User Clicks on second time increase the order button in the first product
          Then User Clicks on third time increase the order button in the first product 
          Then User Clicks on fourth time increase the order button in the first product
          Then User Clicks on fifth time increase the order button in the first product
          Then User Clicks on sixth time increase the order button in the first product
          Then User Clicks on seven time increase the order button in the first product
          Then User Clicks on eight time increase the order button in the first product
          Then User Clicks on nineth time increase the order button in the first product
          Then User Clicks on tenth time increase the order button in the first product
          Then User Clicks on eleventh time increase the order button in the first product
          Then User Clicks on twvelth time increase the order button in the first product
          Then User Clicks on thirteenth time increase the order button in the first product
          Then User Clicks on fourteenth time increase the order button in the first product
          Then User Clicks on fifteenth time increase the order button in the first product
          Then User Clicks on Review Order button
          Then User Clicks on Save recurring order
          Then It should display the particular order in recurring orders page
          
          Examples:
             |username                      |  |password    |
             |kovalan@zeemart.asia          |  |!123456Zm   |     
                      
                      