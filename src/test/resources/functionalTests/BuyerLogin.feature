Feature: Login Action of Buyer Module
  Description: The purpose of this feature is to test End 2 end integration testing on Buyer Hub

  Scenario Outline: Customer Success fully logins to buyer hub
    Given User is on Login Page
    When User enters username "<username>"
    And User enters password "<password>"
    And User Clicks Login button
    Then User routed to dashboard page "Dashboard | Buyer Hub"

    Examples: 
      | username             | password  |
      | guindyuser@gmail.com | !123456Zm |

  Scenario Outline: Customer enters wrong password to buyer hub
    Given User is on Login Page
    When User enters correct username "<username>"
    And User enters wrong password "<password>"
    And User Clicks Login button
    Then User shown with invalid userName,password error message "Invalid Username/Password"

    Examples: 
      | username             | password |
      | guindyuser@gmail.com | !123456Z |

  Scenario Outline: Customer wants to reset password
    Given User is on Login Page
    When User clicks on I've forgotten my password link
    Then User shown with Reset password screen "Validate Email | Buyer Hub"
    When User enters invalid email for password reset "<invalidEmail>"
    Then User shown with valid email error message "Must be email."
    And User enters valid but unregisterd email for password reset "<noregisteredEmail>"
    When User clicks on Send request for password reset
    Then User shown with non registered email error message "Email not valid"
    And User enters valid registered email "<regesteredEmail>"
    When User clicks on Send request for password reset
    Then User shown with password reset email sent screen

    Examples: 
      | invalidEmail        | noregisteredEmail | regesteredEmail      |
      | guindyusergmail.com | user@aacbd.com    | guindyuser@gmail.com |
