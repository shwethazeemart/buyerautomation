Feature: Verify Buyer Orders screen lisen page

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
         And User click on supplier order "<Suppliername>"
         Then User click on Repeat order
         And User Clicks Orders in the side navigation menubar
         And User click on supplier order "<Suppliername>"
         Then User click on Receive order
         Then User click on yes marked button
         And User click on Activity
         Then User click on Cancel and linked order
         Then User click on reason of change quantity
         Then User click on confirm cancel button
         And User click on supplier order in order page "<Suppliername>"
         Then User click on PDF download button
         
             
                  
        @dev  
        Examples:
             |username                     |  |password    ||orderid     | |suppliername   |
             |buyerautomated3@gmail.com    |  |!123456Zm   ||202109090012| |sabari         |
             
         @naren
         @dev  
        Examples:
             |username                     |  |password    ||orderid     | |suppliername   |
             |buyerautomated1@gmail.com    |  |!123456Zm   ||202109090012| |sabari         |   
               
             
              