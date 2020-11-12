Feature: Login Action of Buyer Module
  Scenario Outline: Customer enters wrong password to buyer hub
    Given User is on Login Page
    When User enters correct username "<username>"
    And User enters wrong password "<password>"
    And User Clicks Login button
    Then User shown with invalid userName,password error message "Invalid Username/Password"
  

    Examples:
     | username                       || password |
     | velumanieswaran2020@gmail.com  || !123456Z | 

  Scenario Outline: Customer wants to reset password
    Given User is on Login Page
    When User enters exact username "<username>"
    When User clicks on I've forgotten my password link
    Then User shown with Reset password screen "Validate Email | Buyer Hub"
    When User enters invalid email for password reset page "<invalidEmail>"
    Then User shown with invalid email error message "Must be email."
    And User enters valid but unregisterd email for password reset "<noregisteredEmail>"
    When User clicks on Send request for password reset
    Then User shown with non registered email error message "Email not valid"
    And User enters valid registered email "<regesteredEmail>"
    Then User get display the popup message
    
   

    Examples: 
      | username                      || invalidEmail        | noregisteredEmail | regesteredEmail               |
      | velumanieswaran2020@gmail.com || guindyusergmail.com | user@aacbd.com    | velumanieswaran2020@gmail.com | 



 Scenario Outline: Customer Success fully logins to buyer hub
    Given User is on Login Page
    When User enters username "<username>"
    And User enters password "<password>"
    And User Clicks Login button
    Then User routed to dashboard page "Dashboard | Buyer Hub"

    Examples: 
      | username                      | password  |
      | velumanieswaran2020@gmail.com | !123456Zm |
      
      

  Scenario Outline: Verify the Dashboard page of Buyer panel
       Given User is on Dashboard Page
       When  User enters on Dashboard page yellow colour highlighted 
       When  User enters on Dashboard it display on "<username>" 
      Examples:
      | username                | 
      | Welcome back, velu      |
      
  Scenario Outline: Verify the Orders page of Buyer panel
         Given User is on Orders Page 
         And User Clicks Orders in the side navigation menubar
         And User Clicks New order dropdown value
         And User Clicks New order in the dropdown value
         And User Clicks velu masala2020 in the Suppliers page 
         And User Clicks in Add to order of SKU
         Then User Clicks increase the order button
         And User Clicks in Add to order of SKU
         Then User Clicks increase the order button
         And User Clicks in Add to order of SKU
         Then User Clicks increase the order button
         And  User Clicks Review order
         And User Clicks Place Order
         Then User Copy the particular order number in newly created 
         And User clicks the Back to Orders button 
         Then User paste the newly created order number in Search order ID
         And User Clicks Search button in the orders page
         Then It should display the particular order ID "<order ID>"
         
         Examples:
         |Order ID        |
         |202011110003    |
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      