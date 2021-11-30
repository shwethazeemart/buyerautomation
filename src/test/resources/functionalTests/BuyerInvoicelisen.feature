Feature: Verify Buyer Invoice page and test all the page

Scenario Outline: Buyer Invoice lisen page verify the all field 

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
    Then User click on outlet
    And User click on select all
    Then User click on Apply button
    And User click on filter icon
    Then User click on Reset button
    And User click on outside option
    And User click on filter icon
    Then User click on supplier
    And User click on select all
    Then User click on Apply button
    And User click on filter icon
    Then User click on Reset button
    And User click on filter icon
    Then User click on invoice and creditnote
    And User click on select all
    Then User click on Apply button
    And User click on filter icon
    Then User click on Reset button
    And User click on filter icon
    Then User click on payments status
    And User click on select all
    Then User click on Apply button
    And User click on filter icon
    Then User click on Reset button
    And User click on filter icon
    And User click on Export status in invoice page
    And User click on select all
    Then User click on Apply button
    And User click on filter icon
    Then User click on Reset button
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
