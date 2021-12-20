Feature: Verify Buyer Orders screen Delivery Filter added

Scenario Outline: Verify the Orders delivery filter page
         Given User is on Login Page
         When User enter exact username"<username>"
         And User enter exact password"<password>"
         And User is click login button  
         And User Clicks Orders in the side navigation menubar
         Then User click on all orders icon
         And User click on filter in order first page
         Then User click on delivery status
         Then User click on select all in delivery status
         Then User click on apply button in delivery status
         And User click on filter in order first page
         Then User click on reset button in delivery status
         
         
        @dev  
        Examples:
             |username                         |  |password    |
             |velumanieswaran2020@gmail.com    |  |!123456Zm   |

         @devSecond 
        Examples:
             |username                     |  |password    |
             |buyerautomated3@gmail.com    |  |!123456Zm   |