Feature: Verify Buyer Dashboard lisen page and test all the page

Scenario Outline: Verify the Dashboard lisen page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on Dashboard in the side navigation menubar 
          And User click on New order icon
          Then User click on New order close icon
          And User click on upload invoice icon
          Then User click on upload invoice close icon
          And User select dropdown spending overview list of velu masala
          Then User click on YTD icon
          And User click on Last year icon
          Then User click on Past twelve week icon
          Then User click on view spending report icon
          Then User click on Dashboard side navigation menubar
          And User select dropdown top expenditures list of velu masala
          Then User click on SKU icon
          Then User click on category icon 
          And User click on supplier icon
          Then User click on This month icon
          And User click on This week icon
          Then User click on Last week icon
          And User click on Last month icon
          Then User click on view all spending by supplier
          
           Examples:
         |username                            |  |password    |
         |velumanieswaran2020@gmail.com       |  |!123456Zm   |
          