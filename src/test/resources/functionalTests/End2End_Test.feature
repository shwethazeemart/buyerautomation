Feature: Automated End2End Tests
  Description: The purpose of this feature is to test End 2 end integraation

  Scenario Outline: Customer Success fully logins to supplier hub
    Given User is on Login Page
    When User enters username "<username>"
    And User enters password "<password>"
    And User Clicks Login button
    Then User routed to orders page "http://dev.supplier.zeemart.asia/sg/orders" //validate this by <page title> is better approach
    When User searches for orderId "2020"
    
    Examples: 
    | username            | password  |
    | mrmanager@gmail.com | !123456Zm |
