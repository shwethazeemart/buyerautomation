Feature: Verify Buyer user name page in settings

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
             |username                         |  |password    |
             |velumanieswaran2020@gmail.com    |  |!123456Zm   |
             
             
            @devSecond 
              Examples:
             |username                     |  |password    |
             |buyerautomated3@gmail.com    |  |!123456Zm   |