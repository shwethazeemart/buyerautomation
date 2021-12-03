Feature: Verify Buyer Orders screen lisen page
@Smoke
Scenario Outline: Verify the Orders lisen page of Buyer panel
         Given User is on Login Page
         When User enter exact username"<username>"
         And User enter exact password"<password>"
         And User is click login button  
         And User Clicks Orders in the side navigation menubar              
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
             |username                     |  |password    ||orderid     | |suppliername   |
             |buyerautomated3@gmail.com    |  |!123456Zm   ||202109090012| |sabari         |

        