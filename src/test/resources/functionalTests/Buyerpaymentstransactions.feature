Feature: Verify Buyer Payments Transactions page and test all the page

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
      