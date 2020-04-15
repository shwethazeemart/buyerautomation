Feature: Automated End2End Tests
  Description: The purpose of this feature is to test End 2 end integraation

  Scenario: Customer Success fully logins to supplier hub
    Given User is on Login Page
    And User enters username "mrmanager@gmail.com"
    And User enters password "!123456Zm"
    And User Clicks Login button
    And User routed to orders page "http://dev.supplier.zeemart.asia/sg/orders"
    And User searches for orderId "2020"
