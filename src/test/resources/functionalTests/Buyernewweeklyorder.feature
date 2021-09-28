Feature: Verify Buyer New Weekly Order page and test all the page

Scenario Outline: Verify the New Weekly Order page of Buyer panel
         Given User is on Login Page
         When User enter exact username"<username>"
         And User enter exact password"<password>"
         And User is click login button  
         And User Clicks Orders in the side navigation menubar
         And User Clicks New order dropdown value
         Then User click on New weekly order
         Then User click on dropdown of weekly order
         Then User click on velu masala in weekly order
         Then User click on checkbox of Last thrity days order
         Then User click on Download button in new weekly order
         Then User Upload the weekly order excel file
         Then User click on upload and review order button
    
         
         Examples:
           |username                     |  |password    |
           |velumanieswaran2020@gmail.com|  |!123456Zm   |    