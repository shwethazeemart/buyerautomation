Feature: verify Buyer page and the test all the page
 
Scenario Outline: Customer wants to reset password
    Given User is on Login Page
    When User enters exact username "<username>"
    When User clicks on I've forgotten my password link
    Then User shown with Reset password screen "Validate Email | Buyer Hub"
    When User enters invalid email for password reset page "<invalidEmail>"
    Then User shown with invalid email error message "Must be email"
    And User enters valid but unregisterd email for password reset "<noregisteredEmail>" 
    When User clicks on Send request for password reset
    Then User shown with non registered email error message "Email not valid"
    And User enters valid registered email "<regesteredEmail>"
    Then User get display the popup message
    
  
    Examples: 
      | username                      || invalidEmail        | noregisteredEmail | regesteredEmail               |
      | velumanieswaran2020@gmail.com || guindyusergmail.com | user@aacbd.com    | velumanieswaran2020@gmail.com | 

 Scenario Outline: Customer enters wrong password to buyer hub
    Given User is on Login Page
    When User enters correct username "<username>"
    And User enters wrong password "<password>"
    And User Clicks Login button
    Then User shown with invalid userName,password error message "Invalid Username/Password"


    Examples:
     | username                       || password |
     | velumanieswaran2020@gmail.com  || !123456Z | 
     

  Scenario Outline: Customer Success fully logins to buyer hub
 
    Given User is on Login Page
    When User clicks on I've forgotten my password link
    Then User shown with Reset password screen "Validate Email | Buyer Hub"
    When User enters invalid email for password reset "<invalidEmail>"
    When User clicks on Send request for password reset
    Then User shown with valid email error message "Must be email."
    And User enters valid but unregisterd email for password reset "<noregisteredEmail>"
    When User clicks on Send request for password reset
    Then User shown with non registered email error message "Email not valid"
    And User enters valid registered email "<regesteredEmail>"
    When User clicks on Send request for password reset
    Then User shown with password reset email sent screen

    Examples:  
      | invalidEmail        | noregisteredEmail | regesteredEmail      |
      | guindyusergmail.com | user@aacbd.com    | guindyuser@gmail.com |
      
    Scenario Outline: Customer Success fully logins Dashboard to buyer hub
 
    When User enters username "<username>"
    And User enters password "<password>"
    And User Clicks Login button
    Then User routed to dashboard page "Dashboard | Buyer Hub"

    Examples: 
      | username                      | | password  |
      | velumanieswaran2020@gmail.com | |!123456Zm   |
   
Scenario Outline: Verify the Outlets page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>" 
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on outlets in the side navigation menubar
          And User clicks actions dropdown
          Then User clicks on View suppliers
          And User clicks on the actions dropdown
          Then User Clicks on the view orders
           
    Examples: 
      | username                      | | password  |
      | velumanieswaran2020@gmail.com | |!123456Zm   |
           
 Scenario Outline: Verify the Reports page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on Reports in the side navigation menubar 
          And User clicks on the spending per tag
          
          Examples:
         |username                            |  |password    |
         |kovalan@zeemart.asia                |  |!123456Zm   |
         
        
Scenario Outline: Verify the Inventory page Add SKU of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on Inventory in the side navigation menubar 
          And User clicks on the velumasala2020 outlet
          Then User clicks on the Add SKU button
          And User select on the inventory list in dropdown field
          Then User clicks on the checkbox of pipers SKU
          And User clicks on the Done button
          
          Examples:
         |username                            |  |password    |
         |velumanieswaran2020@gmail.com       |  |!123456Zm   |
                       
Scenario Outline: Verify the Inventory page Export of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on Inventory in the side navigation menubar 
          And User clicks on the Cavenagh4 outlets
          Then User clicks on the Activity icon
          And User clicks on the Export icon
 
 
  Examples:
         |username                            |  |password    |
         |kovalan@zeemart.asia                |  |!123456Zm   |
                  
 
Scenario Outline: Verify the Inventory page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on Inventory in the side navigation menubar 
          Then User is Clicks in velu masala2020 outlet
          And User are Clicks in Lists
          Then User is Clicks in New list
          Then User are type the name in list name filed"<Listname>"
          Then User is Clicks in next button
          And User are Clicks the check box of parisian Baguette
          And User is Clicks Done button
          Then User are Clicks the sairam list
          And  User is Clicks the New stock count
          Then User are Clicks the Start stock count button
          And User is Clicks the increase counted Quantity of parisian Baguetee
          Then User are Clicks the increase second time counted Quantity of parisian Baguetee
          Then User are Clicks Save button
          And User is Clicks Save stock count POPUP button
          Then User are Click Record adjusment button
          When User is Select Reason drodown value of found 
          When User is Select item in the items name dropdown
          Then User are type the value of Quantity box field"<Quantity>"
          Then User are type Notes in the Notes field"<Notes>"
          Then User are Clicks final Save button
         
          
           
          
    Examples:
         |username                            |  |password    ||Listname        ||Quantity||Notes               |
         |velumanieswaran2020@gmail.com       |  |!123456Zm   ||sairam          ||   10   ||eswaranolifound10  |

                  
Scenario Outline: Verify the Users page of Buyer panel 
  
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          And User Clicks on Users in the side navigation menubar 
          Then User is Clicks in Add new user button
          When User are Select Company in the textbox lists
          When User is Selct Outlet in the textbox lists
          And User enter the First name in the First name field"<First name>"
          Then User enter the Last name in the Last name field"<Last name>"
          And User enter Job title in the Job title field"<Job title>"
          Then User are enter Email in the Email field"<Email>"
          And User is Clicks checkbox
          Then User are clear the Mobile phone field
          Then User are enter Mobile phone in the Mobile phone field"<Mobile phone>"  
          And User is upload Profile photo in that field
          Then User is Select Owner in the permissions dropdown
          Then User is Clicks Save button 
          
    Examples:
         |username                     |  |password    ||First name||Last name ||Job title    ||Email                              ||Mobile phone|
         |velumanieswaran2020@gmail.com|  |!123456Zm   ||eswaran   ||ganesh    ||ATZ          ||ganeshtamil2009@gmail.com          ||+6512345677 |       
    
         
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
          Then User Clicks on Review Order button
          Then User Clicks on Save recurring order
          Then It should display the particular order in recurring orders page
          
          Examples:
             |username                      |  |password    |
             |kovalan@zeemart.asia          |  |!123456Zm   |     
         
         
Scenario Outline: Verify the Orders page void status of Buyer panel
         Given User is on Login Page
         When User enter exact username"<username>"
         And User enter exact password"<password>"
         And User is click login button  
         And User Clicks Orders in the side navigation menubar
         Then User clicks on the filter option
         And User clicks on the order status
         Then User clicks on the void checkbox
         And Use clicks on the Apply buttone
  
  
   Examples:
             |username                     |  |password    |
             |velumanieswaran2020@gmail.com|  |!123456Zm   |     
  

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

