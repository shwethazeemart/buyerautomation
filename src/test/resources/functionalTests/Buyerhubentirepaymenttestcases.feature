Feature: Verify Buyer Payments Entire testcases

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
      
    

Scenario Outline: Verify the Payment plans page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button 
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
      | kovalan@zeemart.asia          | |!123456Zm   |      