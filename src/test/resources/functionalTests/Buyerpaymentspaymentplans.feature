Feature: Verify Buyer Payments Payment plans page and test all the page

Scenario Outline: Verify the Payment plans page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>"
          And User enter exact password"<password>"
          And User is click login button
          And User name  should be displayed 
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
      | username                      | | password    |
      | kovalan@zeemart.asia          | |!1234567Zm   |