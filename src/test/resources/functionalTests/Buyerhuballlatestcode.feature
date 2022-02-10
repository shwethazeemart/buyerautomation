Feature: Verify Buyer hub Entire screen latest test cases

Scenario Outline: Verify the Dashboard lisen page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on Dashboard in the side navigation menubar 
          And User click on New order icon
          Then User click on the supplier
          And User click on show favourites check box
          Then User click on show favourites uncheck box
          And User click on filter in order page 
          Then User click on Tags
          And User click on selectall
          Then User click on Apply button in order page
          Then User click on outside of order page
          And User click on filter in order page
          And User click on categories
          And User click on selectall
          Then User click on Apply button in order page
          Then User click on outside of order page
          And User click on filter in order page
          Then User click on cretifications 
          Then User click on outside of order page
          And User click on Search box SKU name
          Then User enter sku in search box"<name>"
          Then User click on close icon in order page
          And User click on upload invoice icon
          Then User click on outletname in dashboard page
          And User click on upload image in drag and dorp filed
          Then User click on Done button in drag and drop filed
          And User select dropdown spending overview list outletname
          Then User click on YTD icon
          And User click on Last year icon
          Then User click on Past twelve week icon
          Then User click on view spending report icon
          Then User click on Dashboard side navigation menubar
          And User select dropdown top expenditures list outletname
          Then User click on SKU icon
          Then User click on category icon 
          And User click on supplier tab icon
          Then User click on This month icon
          And User click on This week icon
          Then User click on Last week icon
          And User click on Last month icon
         
         @dev 
         Examples:
         |username                            |  |password    ||name     | 
         |velumanieswaran2020@gmail.com       |  |!123456Zm   ||100pipers| 
         
        @devSecond  
         Examples:
         |username                            |  |password    ||name     | 
         |buyerautomated3@gmail.com           |  |!123456Zm   ||100pipers|
         
        

Scenario Outline: Verify the Reports invoice variance Category page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on Reports in the side navigation menubar 
          Then User click on Invoice variance icon
          And User click on search box in invoice variance
          Then User Enter the  invoice number in search box"<invoice>"
          Then User select date from calendar
          And User click on Today date from calendar
          Then User select date from calendar
          Then User click on Yesterday date from calendar
          Then User select date from calendar
          And User click on This week date from calendar
          Then User select date from calendar
          Then User click on This month from calendar
          Then User select date from calendar
          And User click on Last year from calendar
          Then User select date from calendar
          Then User click on Custom range from calendar
          Then User click on apply in custom range
          Then User select date from calendar
          Then User click on YTD from calendar 
          Then User select from dropdown value
          Then User click on filter in invoice variance
          And User select supplier in dropdown list
          Then User select match status in dropdown list
          And User click on Apply button in invoice variance
          Then User click on reset button in invoice variance
          And User click on outside in invoice variance
          Then User click on export download button in invoice variance
          Then User click on Reports back button in invoice variance
          
     @dev     
     Examples: 
      |username                      | | password   ||invoice     |
      |velumanieswaran2020@gmail.com  | |!123456Zm   ||vel-1234567 |
      
     @devSecond 
      Examples: 
      | username                      | | password   ||invoice     ||outletname    |
      |buyerautomated3@gmail.com      | |!123456Zm   ||vel-1234567 ||velumasala2020|
      
      
      
  
 Scenario Outline: Verify the Reports price updates Category page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on Reports in the side navigation menubar 
          Then User click on Price updates icon
          And User click on search box in price updates
          Then User Enter the  sku name in search box"<sku>"
          Then User select date from calendar
          And User click on Today date from calendar
          Then User select date from calendar
          Then User click on Yesterday date from calendar
          Then User select date from calendar
          And User click on This week date from calendar
          Then User select date from calendar
          Then User click on This month from calendar
          Then User select date from calendar 
          Then User click on YTD from calendar
          Then User select date from calendar
          Then User click on Custom range from calendar
          Then User click on apply in custom range
          Then User select date from calendar      
          And User click on Last year from calendar
          Then User select from dropdown value of outlet in price updates
          Then User click on filter in price updates
          And User select supplier in dropdown list 
          Then User click on Apply button in price updates
          Then User click on reset button in price updates
          And User click on outside in price updates
          Then User click on Download button first page
          Then User click on export download button in price updates
          Then User click on Reports back button in price updates
         
            
     @dev 
     Examples: 
      | username                      | | password   ||sku       |
      |velumanieswaran2020@gmail.com  | |!123456Zm   ||100pipers | 
      
     @devSecond
     Examples: 
      | username                      | | password   ||sku       |
      |buyerautomated3@gmail.com      | |!123456Zm   ||100pipers | 
      
      
    
Scenario Outline: Verify the Reports spending per Category page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on Reports in the side navigation menubar 
          Then User click on spending per category icon
          And User click on search box in category
          Then User Enter the category name in search box"<name>"
          And User select date from calendar in category
          Then User click on search icon in category
          Then User click on filter in category
          And User click on outlets in category
          Then User click on Check box in category
          Then User click on apply button in category
          And User click on reset button in category
          Then User click on outside in category
          Then User click on filter in category
          And User click on Suppliers in category
          Then User click on check box of category
          Then User click on apply button in category
          And User click on reset button in category
          Then User click on outside in category
          And User click on Beer category
          Then User select date from calendar in Beer
          And User select dropdown in month Beer
          Then User click on filter in category
          And User click on outlets in category
          Then User click on Check box 
          Then User click on apply button in category
          And User click on reset button in category
          Then User click on outside in category in Beer
          Then User click on filter in category
          And User click on Suppliers in category
          Then User click on check box category
          Then User click on apply button in category
          Then User click on outside in category in Beer
          Then User click download button of export
          Then User click on back button of spending report
          Then User click on back button of reports
          
  @dev        
  Examples: 
      |username                          | | password   ||name     |
      |velumanieswaran2020@gmail.com     | |!123456Zm   ||Beer     | 
      
      
  @devSecond       
  Examples: 
      |username                      | | password   ||name     |
      |buyerautomated1@gmail.com     | |!123456Zm   ||Beer     | 
      
     
Scenario Outline: Verify the Reports spending per outlet page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on Reports in the side navigation menubar 
          Then User click on spending per outlet icon  
          Then User select date from calendar
          And User click on Today date from calendar
          Then User select date from calendar
          Then User click on Yesterday date from calendar
          Then User select date from calendar
          And User click on This week date from calendar
          Then User select date from calendar
          Then User click on This month from calendar
          Then User select date from calendar
          Then User click on YTD from calendar          
          Then User select date from calendar
          Then User click on Custom range from calendar
          Then User click on apply in custom range
          Then User select date from calendar
          And User click on Last year from calendar
          And User click on filter
          Then User click on suppliers
          And User click on check box  
          Then User click on Apply button  
          And User click on filter        
          Then User click on Reset button
          Then User click on outside 
          And User click on filter 
          Then User click on invoice and credit note
          And User click on check box of processed
          Then User click on check box of issued
          Then User click on Apply button
          And User click on filter
          Then User click on Reset button
          Then User click on outside 
          And User click on filter 
          Then User click on payment status
          And User click on unpaid check box
          Then User click on paid check box
          Then User click on Apply button
          And User click on filter
          Then User click on Reset button
          Then User click on outside 
          And User click on filter 
          Then User click on Export status
          Then User click on Exported check box 
          Then User click on Not Exported check box
          Then User click on Apply button          
          And User click on filter
          Then User click on Reset button
          Then User click on outside            
          And User click on Export download button
          Then User click on export page is CSV
          And User click on Export download button
          Then User click on Detailed report
          And User click on download button          
          And User click on outlet icon
          Then User select date from calendar
          And User click on Today date from calendar
          Then User select date from calendar
          Then User click on Yesterday date from calendar
          Then User select date from calendar
          And User click on This week date from calendar
          Then User select date from calendar
          Then User click on This month from calendar
          Then User select date from calendar
          And User click on Last year from calendar
          Then User select date from calendar
          Then User click on Custom range from calendar
          Then User click on apply in custom range
          Then User select date from calendar
          Then User click on YTD from calendar
          And User select dropdown in month 
          Then User click download button of export
          Then User click on back button of spending report
          Then User click on back button of reports
          
      @dev   
      Examples: 
      | username                      | | password   |  |outletname      |
      | velumanieswaran2020@gmail.com | |!123456Zm   |  |velu masala2020 |
      
      
            
Scenario Outline: Verify the Reports spending per SKU page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on Reports in the side navigation menubar 
          Then User click on spending per sku icon
          And User click on search box in sku
          Then User Enter the sku name in search box"<name>"
          Then User select date from calendar 
          And User click on Today date from calendar
          Then User select date from calendar
          Then User click on Yesterday date from calendar
          Then User select date from calendar
          And User click on This week date from calendar
          Then User select date from calendar
          Then User click on This month from calendar
          Then User select date from calendar
          And User click on Last year from calendar
          Then User select date from calendar
          Then User click on Custom range from calendar
          Then User click on apply in custom range
          Then User select date from calendar
          Then User click on YTD from calendar
          Then User click on filter in sku
          And User click on outlets in sku
          Then User click on Check box in sku
          Then User click on apply button in sku
          And User click on reset button in sku
          Then User click on outside in sku
          Then User click on filter in sku
          And User click on Suppliers in sku
          Then User click on check box in sku
          Then User click on apply button in sku
          And User click on reset button in sku
          Then User click on outside in sku
          Then User click on export download button in sku
          Then User click on hundred pipers sku
          Then User select date from calendar in hundred pipers
          And User click on Today date from calendar
          Then User select date from calendar in hundred pipers
          Then User click on Yesterday date from calendar
          Then User select date from calendar in hundred pipers
          And User click on This week date from calendar
          Then User select date from calendar in hundred pipers
          Then User click on This month from calendar
          Then User select date from calendar in hundred pipers
          And User click on Last year from calendar
          Then User select date from calendar in hundred pipers
          Then User click on Custom range from calendar
          Then User click on apply in custom range
          Then User select date from calendar in hundred pipers
          Then User click on YTD from calendar
          And User select dropdown in month in hundred pipers
          Then User click on bag in hundred pipers
          Then User click on box in hundred pipers
          Then User click on bdl in hundred pipers
          And User click on filter in hundred pipers
          Then User click on outlets in hundred pipers
          Then User click on select all icon in hundred pipers
          Then User click on apply button in hundred pipers
          And User click on reset button in hundred pipers
          Then User click on Outside in hundred pipers
          And User click on export button in hundred pipers
          Then User click on price history icon in hundred pipers
          Then User select date from calendar
          And User click on Today date from calendar
          Then User select date from calendar
          Then User click on Yesterday date from calendar
          Then User select date from calendar 
          And User click on This week date from calendar
          Then User select date from calendar
          Then User click on This month from calendar
          Then User select date from calendar
          And User click on Last year from calendar
          Then User select date from calendar
          Then User click on Custom range from calendar
          Then User click on apply in custom range
          Then User select date from calendar
          Then User click on YTD from calendar
          And User select dropdown 
          Then User click on bdl in price history
          Then User click on bag in price history
          Then User click on box in price history
          Then User click download button of export
          
             
     @dev      
     Examples: 
      | username                          | | password   ||name     |
      | velumanieswaran2020@gmail.com     | |!123456Zm   ||100pipers|     
      
     @devSecond      
     Examples: 
      | username                      | | password   ||name     |
      | buyerautomated3@gmail.com     | |!123456Zm   ||100pipers|   
      
      
Scenario Outline: Verify the Reports spending per supplier page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on Reports in the side navigation menubar 
          Then User click on spending per supplier icon 
           And User click on supplier search box
          Then User enter supplier name in search box"<name>"
          Then User select date from calendar
          And User click on Today date from calendar
          Then User select date from calendar
          Then User click on Yesterday date from calendar
          Then User select date from calendar
          And User click on This week date from calendar
          Then User select date from calendar
          Then User click on This month from calendar
          Then User select date from calendar
          Then User click on YTD from calendar          
          Then User select date from calendar
          Then User click on Custom range from calendar
          Then User click on apply in custom range
          Then User select date from calendar
          And User click on Last year from calendar
          And User click on filter in supplier
          Then User click on outlets
          Then User click on check box 
          Then User click on Apply button in supplier
          And User click on filter in supplier
          Then User click on Reset button in supplier
          Then User click on outside in supplier                                
          And User click Export download button
          Then User click on the supplier "<suppliername> " 
          Then User select date from calendar
          And User click on Today date from calendar
          Then User select date from calendar
          Then User click on Yesterday date from calendar
          Then User select date from calendar
          And User click on This week date from calendar
          Then User select date from calendar
          Then User click on This month from calendar
          Then User select date from calendar
          And User click on Last year from calendar
          Then User select date from calendar
          Then User click on Custom range from calendar
          Then User click on apply in custom range
          Then User select date from calendar
          Then User click on YTD from calendar
          And User select dropdown in month 
          Then User click download button of export
          Then User click on back button of spending report
          Then User click on back button of reports 
          
             
     @dev    
     Examples: 
      | username                       | | password   ||name     | |suppliername |
      | velumanieswaran2020@gmail.com  | |!123456Zm   ||sabari250| |sabari250    |
      
    @devSecond    
     Examples: 
      | username                       | | password   ||name     | |suppliername |
      | buyerautomated3@gmail.com      | |!123456Zm   ||sabari250| |sabari250    |
    
   
    
Scenario Outline: Verify the Reports spending per tag page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on Reports in the side navigation menubar 
          Then User click on spending per tag icon
          And User click on search box in tag
          Then User Enter the tag name in search box"<name>"
          Then User select date from calendar
          And User click on Today date from calendar
          Then User select date from calendar
          Then User click on Yesterday date from calendar
          Then User select date from calendar
          And User click on This week date from calendar
          Then User select date from calendar
          Then User click on This month from calendar
          Then User select date from calendar
          And User click on Last year from calendar
          Then User select date from calendar
          Then User click on Custom range from calendar
          Then User click on apply in custom range
          Then User select date from calendar
          Then User click on YTD from calendar
          Then User click on filter in tag
          And User click on outlets in tag
          Then User click on Check box in tag
          Then User click on apply button in tag
          And User click on reset button in tag
          Then User click on outside in tag
          Then User click on filter in tag
          And User click on Suppliers in tag
          Then User click on check box of tag
          Then User click on apply button in tag
          And User click on reset button in tag
          Then User click on outside in tag
          Then User click on Export download button in tag
          And User click on food Tag 
          Then User select date from calendar 
          And User click on Today date from calendar
          Then User select date from calendar
          Then User click on Yesterday date from calendar
          Then User select date from calendar
          And User click on This week date from calendar
          Then User select date from calendar
          Then User click on This month from calendar
          Then User select date from calendar
          And User click on Last year from calendar
          Then User select date from calendar
          Then User click on Custom range from calendar
          Then User click on apply in custom range
          Then User select date from calendar
          Then User click on YTD from calendar
          And User click on Export download button in food
          Then User click on filter tag in food
          And User click on outlets in tag
          Then User click on Check box in tag
          Then User click on apply button in tag
          Then User click on filter tag in food
          And User click on reset button in tag
          Then User click on outside tag 
          Then User click on filter tag 
          And User click on Suppliers in tag
          Then User click on check box  in tag
          Then User click on apply button in tag
          Then User click on filter tag 
          And User click on reset button in tag
          Then User click on outside tag 
          Then User click on back button of spending report
          Then User click on back button of reports
          
          
  @dev        
  Examples: 
      | username                          | | password   ||name       |
      | velumanieswaran2020@gmail.com     | |!123456Zm   ||masala     | 
      
   @devSecond       
  Examples: 
      | username                          | | password   ||name       |
      | buyerautomated3@gmail.com         | |!123456Zm   ||masala     | 
      
      


Scenario Outline: Verify the New Order page of Buyer panel
         Given User is on Login Page
         When User enter exact username"<username>"
         And User enter exact password"<password>"
         And User is click login button  
         And User Clicks Orders in the side navigation menubar
         And User Clicks New order dropdown value
         And User Clicks New order in the dropdown value
         Then User click on the supplier
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
         
          
        @dev 
        Examples:
             |Order ID       ||username                       | |password    |
             |202110270051   ||velumanieswaran2020@gmail.com  | |!123456Zm   | 
          
          
         @dev 
        Examples:
             |Order ID       ||username                       | |password    |
             |202110270051   ||buyerautomated3@gmail.com  | |!123456Zm   | 
          
          
         
         

Scenario Outline: Verify the New Order outstanding options page of Buyer panel   

         Given User is on Login Page
         When User enter exact username"<username>"
         And User enter exact password"<password>"
         And User is click login button  
         And User Clicks Orders in the side navigation menubar 
         And User Clicks New order dropdown value
         And User Clicks New order in the dropdown value
         Then User click on  in the supplier page outletname
         Then User click on ok button of pop message
         And User Clicks Orders in the side navigation menubar
         And User Clicks New order dropdown value
         And User Clicks New order in the dropdown value
         Then User click on in the supplier page outletnameone
         Then User click on ok button of pop message outletone
         Then User click on close icon first pop message
         And User Clicks Orders in the side navigation menubar
         And User Clicks New order dropdown value
         And User Clicks New order in the dropdown value
         Then User click on in the supplier page outletnametwo
         Then User click on ok button of pop message outletone
         Then User click on close icon first pop message
           
         
           @dev
           Examples:
             |username                         |  |password    | 
             |velumanieswaran2020@gmail.com    |  |!123456Zm   |  
    
              @devSecond
           Examples:
             |username                     |  |password    | 
             |buyerautomated3@gmail.com    |  |!123456Zm   | 


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
          Then User Clicks on Review Order button
          Then User Clicks on Save recurring order
         
          
          @dev  
          Examples:
             |username                                   |  |password    |
             |velumanieswaran2020@gmail.com              |  |!123456Zm   | 
             
          @devSecond 
          Examples:
             |username                               |  |password    |
             |buyerautomated3@gmail.com              |  |!123456Zm   |       
             
              
Scenario Outline: Verify the New Weekly Order page of Buyer panel
         Given User is on Login Page
         When User enter exact username"<username>"
         And User enter exact password"<password>"
         And User is click login button  
         And User Clicks Orders in the side navigation menubar
         And User Clicks New order dropdown value
         Then User click on New weekly order
         Then User click on dropdown of weekly order
         Then User click on in weekly order 
         Then User click on checkbox of Last thrity days order
         Then User click on Download button in new weekly order
         Then User Upload the weekly order excel file
         Then User click on upload and review order button
    
         @dev
         Examples:
           |username                         |  |password    |
           |velumanieswaran2020@gmail.com    |  |!123456Zm   |     
           
          @devSecond 
         Examples:
           |username                     |  |password    |
           |buyerautomated3@gmail.com    |  |!123456Zm   |     
           
          
Scenario Outline: Verify the Orders lisen page of Buyer panel
         Given User is on Login Page
         When User enter exact username"<username>"
         And User enter exact password"<password>"
         And User is click login button  
         And User Clicks Orders in the side navigation menubar    
         And User Clicks on New order dropdown value
         Then User click on outside order icon
         And User click on Download option
         Then User click on Download receving list
         Then User click on select date from calendar
         Then User select outlet in dropdown value
         Then User click on download button in order page
         Then User click on close icon in order first page
         Then User click on all orders icon 
         And User click on Needs approval icon 
         Then User click on Drafts icon
         And User click on Recurring orders
         Then User click on all orders icon
         And User click on search box order id
         Then User enter the order id search box"<orderid>" 
         Then User click on search icon in orders page
         Then User clear the search box
         Then User click on search icon in orders page
         And User select delivery date from calendar
         Then User click on search icon in orders page
         Then User close button delivery date from calendar
         Then User click on search icon in orders page
         And User click on placed date from calendar
         Then User click on search icon in orders page
         Then User click on close button to placed date from calendar
         Then User click on search icon in orders page
         And User click on filter in order first page
         Then User click on outlet in filter
         And User click on select all icon in order page
         Then User click on Apply button in order in first page
         And User click on filter in order first page
         Then User click on Reset button in order in first page
         And User click on filter in order first page
         Then User Click on supplier in order page
         And User click on select all icon in order page
         Then User click on Apply button in order in first page
         And User click on filter in order first page
         Then User click on Reset button in order in first page
         And User click on filter in order first page
         Then User click on order status in order page
         And User click on select all icon in order page
         Then User click on Apply button in order in first page
         And User click on filter in order first page
         Then User click on Reset button in order in first page
         And User click on filter in order first page
         Then User click on invoicing status in order page
         And User click on select all icon in order page
         Then User click on Apply button in order in first page
         And User click on filter in order first page
         Then User click on Reset button in order in first page
         And User click on filter in order first page
         Then User click on delivery status
         Then User click on select all in delivery status
         Then User click on apply button in delivery status
         And User click on filter in order first page
         Then User click on reset button in delivery status
         And User click on filter in order first page
         Then User click on order type in order page
         And User click on select all icon in order page
         Then User click on Apply button in order in first page
         And User click on filter in order first page
         Then User click on Reset button in order in first page                     
         And User click on check box of first order
         Then User click on download orders button in order page
         Then User click on download orders in detailed in order page 
         And User click on Mark as recevied button in order page
         Then User click on clear button in order page 
         And User click on the supplier order 
         Then User click on Repeat order
         And User Clicks Orders in the side navigation menubar
         And User click on supplier order 
         Then User click on Receive order
         Then User click on yes marked button
         And User click on Activity
         Then User click on Cancel and linked order
         Then User click on reason of change quantity
         Then User click on confirm cancel button
         And User click on supplier order in order page 
         Then User click on PDF download button

        @dev  
        Examples:
             |username                         |  |password    ||orderid     | |suppliername   |
             |velumanieswaran2020@gmail.com    |  |!123456Zm   ||202109090012| |sabari         |
        
         @devSecond  
        Examples:
             |username                     |  |password    ||orderid     | |suppliername   |
             |buyerautomated3@gmail.com    |  |!123456Zm   ||202109090012| |sabari         |
               
         
           
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
      | velumanieswaran2020@gmail.com    || !123456Zm    | 
   
    @devSecond  
    Examples: 
      | username                     || loginPassword|
      | buyerautomated3@gmail.com    || !123456Zm    | 
   
  
  

Scenario Outline: Verify the Invoices upload page of Buyer panel
         Given User is on Login Page
         When User enter exact username"<username>"
         And User enter exact password"<password>"
         And User is click login button 
         Then User clicks on Invoices in the side navigation menubar
         And User is Clicks in Uploads 
         Then User is Clicks in Upload invoice
         And User is Clicks on select outlet
         Then User is Clicks on upload the image
         And User is Clicks on Upload button
         
      @dev     
     Examples:
             |username                         |  |password    |
             |velumanieswaran2020@gmail.com    |  |!123456Zm   |
 
         
     @devSecond      
     Examples:
             |username                     |  |password    |
             |buyerautomated3@gmail.com    |  |!123456Zm   |
 
             
Scenario Outline: Verify the Payment plans page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button
          And User name should be displayed 
          Then User Enter dashboard menu highlighted with the yellow colour 
          Then User Clicks on Payments in the side navigation menubar
          Then User click on Payment plans icon
          And User select companies from dropdown list in payment plans
          Then User selecct suppliers from dropdown list in payment plans
          And User select payment status in unpaid
          Then User select payment status in failed
          Then User select payment status in paid
          Then User click on listed supplier in payment plans
          And User click on payments back button in payment plans
          
          
          
     Examples: 
      | username                      | | password   |
      | kovalan@zeemart.asia          | |!1234567Zm   |
      
      
Scenario Outline: Verify the Payment transactions page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on Payments in the side navigation menubar 
          Then User click on Transactions icon
          And User select companies from dropdown list
          Then User selecct suppliers from dropdown list
          And User click on calendar and select date
          Then User click on Search icon from transactions page
          Then User Click on download button from trans actions apge
          Then User click on listed supplier
          And User click on payments back button
          
          
          
     Examples: 
      | username                      | | password   |
      | velumanieswaran2020@gmail.com | |!123456Zm   |     
      
      
   
 Scenario Outline: Verify the Inventory Activity lisen page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on Inventory in the side navigation menubar 
          And User click on outlets icon
          Then User ckicks on outlet "<outletname>"
          Then User click on Activity icon
          And User click on New stock count
          Then User click on New stock count close icon
          And User click on Record Adjustment
          Then User click on Record Adjustment close icon
          And User select the calendar this month from date to To date
          Then User click on download button
     
     @dev     
     Examples:
         |username                            |  |password    | |outletname  |
         |velumanieswaran2020@gmail.com       |  |!123456Zm   | |velu masala |
     
      
    @devSecond   
     Examples:
         |username                            |  |password    | |outletname  |
         |buyerautomated3@gmail.com           |  |!123456Zm   | |velu masala |
             
Scenario Outline: Verify the Inventory Outlets lisen page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on Inventory in the side navigation menubar 
          And User click on outlets icon
          Then User click on settings
          And User click on settings close icon
          Then User click on Export download icon
          And User click on new list "<outletnameone>"
          Then User click on new list close icon
          And User click on starter plan "<outletnametwo>"
          Then User click on starter plan close icon
          Then User click on search outlets
          And User send outlet name in search icon"<outletname>"
          Then User click on status icon
          And User click on checkbox of Has items below par
          Then User click on uncheckbox of Has items below par
          Then User click on checkbox of last count 
          Then User click on uncheckbox of last count
          Then User click on outletname
          Then User click vertically scroll up in the page
          And User return to outlet page
           
          @dev
          Examples:
         |username                       |  |password    ||outletname     ||outletnameone | |outletnametwo |
         |velumanieswaran2020@gmail.com  |  |!123456Zm   ||velu masala2020||sstmasala     | |sstmasala2020 |
         
          @devSecond
          Examples:
         |username                       |  |password    ||outletname     ||outletnameone | |outletnametwo |
         |buyerautomated3@gmail.com      |  |!123456Zm   ||velu masala2020||sstmasala     | |sstmasala2020 |
         
                                             
Scenario Outline: Verify the Inventory Record adjustment page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on Inventory in the side navigation menubar 
          Then User Clicks on outlet in recordadjusment page
          And User are Clicks in Lists
          Then User are Clicks the list
          And User click on Record Adjustment
          When User is Select Reason drodown value of found 
          When User is Select item in the items name dropdown
          Then User are type the value of Quantity box field"<Quantity>"
          Then User are type Notes in the Notes field"<Notes>"
          Then User are Clicks final Save button 
          Then User are Click Record adjusment button
          When User is Select Reason second drodown value of missing 
          When User is Select item in the items name dropdown
          Then User are type the value of Quantity box field"<Quantityone>"
          Then User are type Notes in the Notes field"<Notesone>"
          Then User are Clicks final Save button 
          Then User are Click Record adjusment button
          When User is Select Reason thirdtime drodown value of Promotion 
          When User is Select item in the items name dropdown
          Then User are type the value of Quantity box field"<Quantitytwo>"
          Then User are type Notes in the Notes field"<Notestwo>"
          Then User are Clicks final Save button 
          Then User are Click Record adjusment button
          When User is Select Reason fourthtime drodown value of Transfer in 
          When User is Select item in the items name dropdown
          Then User are type the value of Quantity box field"<Quantity>"
          Then User are type Notes in the Notes field"<Notesthree>"
          Then User are Clicks final Save button 
          Then User are Click Record adjusment button
          When User is Select Reason fifthtime drodown value of Transfer out 
          When User is Select item in the items name dropdown
          Then User are type the value of Quantity box field"<Quantity>"
          Then User are type Notes in the Notes field"<Notesfour>"
          Then User are Clicks final Save button 
         
         
         
    @dev      
    Examples:
         |username                            |  |password    ||Quantity||Notes              ||Quantityone||Notesone         ||Quantitytwo||Notestwo         ||Notesthree|     |Notesfour|       |Notesfive|
         |velumanieswaran2020@gmail.com       |  |!123456Zm   ||   10   ||eswaranvelufound10  ||10     |   |velumanimissing10||10         ||velupromotions10||velutrnasferin10||velutransferout10||veluwastage10|
         
       @devSecond     
    Examples:
         |username                            |  |password    ||Quantity||Notes              ||Quantityone||Notesone         ||Quantitytwo||Notestwo         ||Notesthree|     |Notesfour|       |Notesfive|
         |buyerautomated3@gmail.com           |  |!123456Zm   ||   10   ||eswaranvelufound10  ||10     |   |velumanimissing10||10         ||velupromotions10||velutrnasferin10||velutransferout10||veluwastage10|
           
  
         
Scenario Outline: Verify the Inventory SKU lisen page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on Inventory in the side navigation menubar 
          And User click on outlets icon
          Then User clicks on outlet 
          And User click on New stock count
          Then User click on New stock count close icon
          And User click on Record Adjustment
          Then User click on Record Adjustment close icon 
          And User click on Export download button
          Then User click on Add SKU
          And User Select dropdown list name 
          Then User click on check box of SKU
          And User click on done button
          Then User click on the first check box of SKU
          Then User click on Edit par level
          And User click on Edit par level close icon
          Then User click on Remove from inventory list icon
          Then User close on Remove from inventory list Delete icon
          Then User click on Add SKU
          And User Select dropdown list name   
          Then User click on check box of SKU
          And User click on done button
          Then User click on consumption report
          Then User click on backbutton of consumption report
          
     @dev     
     Examples:
         |username                        |  |password    | 
         |velumanieswaran2020@gmail.com   |  |!123456Zm   |
         
              
     @devSecond  
     Examples:
         |username                        |  |password    | 
         |buyerautomated3@gmail.com       |  |!123456Zm   |
               
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
    
    @dev       
    Examples: 
      | username                          | | password  |
      | velumanieswaran2020@gmail.com     | |!123456Zm   |
    
   @devSecond       
    Examples: 
      | username                          | | password  |
      | velumanieswaran2020@gmail.com     | |!123456Zm   |
    
    

Scenario Outline: Verify the Outlets listing page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>" 
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on outlets in the side navigation menubar
          Then User click on checkbox 
          Then User click on make inactive
          Then User click on disable textbox
          Then User enter the confirmation in textbox"<confirm>"
          Then User click on yes make inactive button
          Then User click on checkbox
          Then User click on make active icon
          Then User click on checkbox
          Then User click on clear icon
          Then User click on Actions dropdown 
          Then User click on manage details 
          Then User click on back button of outlets icon
          Then User click on Actions dropdown 
          Then User click on manage setting 
          Then User click on back button of outlets icon
          Then User click on Actions dropdown 
          Then User click on view suppliers 
          Then User click on back button of outlets icon
          Then User enter the outlet name in text box"<outletname>"
          
    @dev       
    Examples:  
      | username                          | | password   ||confirm||outletname     |
      | velumanieswaran2020@gmail.com     | |!123456Zm   ||DISABLE||velu masala2020|
      
     @devSecond       
    Examples:  
      | username                      | | password   ||confirm||outletname     |
      | buyerautomated3@gmail.com     | |!123456Zm   ||DISABLE||velu masala2020|
      
    
Scenario Outline: Verify the Outlets manage details page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>" 
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on outlets in the side navigation menubar
          And User clicks actions dropdown
          Then User clicks on Manage details
          And User clear on outlet email
          Then User enter the new email id"<Email>"
          Then User click on first manage subscription
          And User click on manage subscription
          Then User click on manage subscription close icon
          Then User click on save button
    @dev       
    Examples: 
      | username                          | | password   ||Email                      |
      |velumanieswaran2020@gmail.com      | |!123456Zm   ||lingeshsabari2009@gmail.com|
      
      @devSecond       
    Examples: 
      | username                      | | password   ||Email                      |
      |buyerautomated3@gmail.com      | |!123456Zm   ||lingeshsabari2009@gmail.com|
    
      
      
 Scenario Outline: Verify the Outlets settings page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>" 
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on outlets in the side navigation menubar
          And User clicks actions dropdown
          Then User clicks on Manage settings
          And User click on search box
          Then User Enter the name in search box"<Name>"
          And User click on Add member button
          Then User click on select user search box
          Then User click on check box in outlet setting
          Then User click on outside section
          And User click on Add button
          Then User select dropdown on wednesday send every
          Then User select dropdown on weeky starts on monday
          Then User Clear on weekly email
          And User enter on weekly email"<WeeklyEmail>"
          Then User select dropdown list in wednesday
          Then User clear the Email list
          And User enter on Email list"<Email>"
          Then User clear outlet email
          And User enter the outletemail"<outletemail>"
          Then User click on save button finally
          
    @dev       
    Examples: 
      | username                      | | password   ||Name       | |WeeklyEmail          ||Email                      ||outletemail                  |
      | velumanieswaran2020@gmail.com | |!123456Zm   ||buyer      | |velumani@zeemart.asia||lingeshsabari2009@gmail.com||velumanieswaran2020@gmail.com| 
      

      @devSecond       
    Examples: 
      | username                      | | password   ||Name       | |WeeklyEmail          ||Email                      ||outletemail                  |
      | buyerautomated3@gmail.com     | |!123456Zm   ||buyer      | |velumani@zeemart.asia||lingeshsabari2009@gmail.com||velumanieswaran2020@gmail.com| 
      
   
 
Scenario Outline: Verify the Outlets view suppliers page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>" 
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on outlets in the side navigation menubar
          And User clicks actions dropdown
          Then User clicks on View suppliers
          And User clicks on the actions dropdown
          Then User Click on view market list
          And User click on name search box
          Then User Enter on name in name searchbox field"<name>"
          And User click on check box of product code
          Then User Click on Edit tags
          Then User click on Edit tags close icon
          And User click on Delete button
          Then User click on Delete button close icon
          Then User click on check box clear button
          And User click on options icon
          Then User click on copy to another outlet
          And User click on select all icon
          Then User click on below select all icon
          Then User click on ok button
          And User click on options icon 
          Then User click on Download marketlist
           
    @dev       
    Examples: 
      | username                          | | password   ||name      |
      | velumanieswaran2020@gmail.com     | |!123456Zm   ||100pipers   |            
     
      @devSecond       
    Examples: 
      | username                      | | password   ||name      |
      | buyerautomated3@gmail.com     | |!123456Zm   ||100pipers   |            
      
    
   
      
Scenario Outline: Verify the Users Listing page of Buyer panel 
  
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          And User Clicks on Users in the side navigation menubar 
          Then User is click on check box of user "<username>"
          And User click on clear icon in edit user page
          Then User is click on check box of user "<username>"
          And User click on delete icon 
          Then User click on delete close icon
          And User click on clear icon in edit user page
          Then User click on search box in edit user page
          And User enter the name in search box in edit user page"<name>"
     @dev    
    Examples:
         |username                         |  |password    ||name      |  |username  |
         |velumanieswaran2020@gmail.com    |  |!123456Zm   ||velu mani2|  |velu mani2|   
         
   @devSecond  
    Examples:
         |username                         |  |password    ||name      |  |username  |
         |buyerautomated3@gmail.com    |  |!123456Zm   ||velu mani2    |  |velu mani2|  
         
        
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
          
    @dev      
    Examples:
         |username                       ||password    ||First name||Last name   ||Job title    ||Email                    ||Mobile phone|
         |velumanieswaran2020@gmail.com  ||!123456Zm   ||velumani  ||ganeshtamil ||ATZ          ||shwetha1100@gmail.com    ||+6512345677 |       
                                                    
    @devSecond      
    Examples:
         |username                   ||password    ||First name||Last name   ||Job title    ||Email                    ||Mobile phone|
         |buyerautomated3@gmail.com  ||!123456Zm   ||velumani  ||ganeshtamil ||ATZ          ||shwetha1100@gmail.com    ||+6512345677 |       
                                                    
                                                                 
Scenario Outline: Verify the Edit Users page of Buyer panel 
  
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          And User Clicks on Users in the side navigation menubar  
          Then User click on user "<usernameone>"
          And User clear the job title
          Then User enter the job title"<title>"
          And User clear the Email address
          Then User enter the Email in email filed"<Email>"
          And User clear the mobile phone field
          Then User enter the mobile number in mobile phone field"<mobilephone>"
          Then User click save button in edit user page
    
    @dev      
    Examples:
         |username                         |  |password    ||title      ||Email                            ||mobilephone  | |usernameone |
         |velumanieswaran2020@gmail.com    |  |!123456Zm   ||AtoZ test  ||velumanieswaran2020@gmail.com    ||+65122456789 | |velumanitwo  | 
         
        
     @devSecond    
    Examples:
         |username                     |  |password    ||title      ||Email                            ||mobilephone  | |username     |
         |buyerautomated3@gmail.com    |  |!123456Zm   ||AtoZ test  ||velumanieswaran2020@gmail.com    ||+65122456789 | |velumanitwo  | 
         
              
Scenario Outline: Verify the user name page of Buyer panel
         Given User is on Login Page
         When User enter exact username"<username>"
         And User enter exact password"<password>"
         And User is click login button 
         Then User click on user name in settings
         And User click on settings in user page
         Then User click on Linked companies in settings page
         Then User click on velu masala actions dropdown in settings page
         Then User click on manage payment settings
         And User click on Back button of My account
         Then User click on Linked companies in settings page
         Then User click on velu masala actions dropdown in settings page
         And User click on manage Integration
         
     @dev      
     Examples:
             |username                     |  |password    |
             |velumanieswaran2020@gmail.com | |!123456Zm   |     
             
     @devSecond      
     Examples:
             |username                     |  |password    |
             |buyerautomated3@gmail.com    |  |!123456Zm   |       
             
Scenario Outline: Verify the News page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on News in the side navigation menubar 
          Then User is Clicks in the test notification  
          Then user click on the close icon for test notification
          Then User Clicks on News in the side navigation menubar 
              
          
        @dev
        Examples:
         |username                            |  |password    |
         |velumanieswaran2020@gmail.com       |  |!123456Zm   |
         
        @devSecond 
        Examples:
         |username                            |  |password    |
         |buyerautomated3@gmail.com           |  |!123456Zm   |
    

         