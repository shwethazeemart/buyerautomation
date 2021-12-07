Feature: Verify Buyer Outlets action page and test all the page

Scenario Outline: Verify the Outlets page of Buyer panel 
          Given User is on Login Page
          When User enter exact username"<username>" 
          And User enter exact password"<password>"
          And User is click login button 
          Then User Clicks on outlets in the side navigation menubar
          And User clicks actions dropdown
          Then User clicks on View suppliers
          And User clicks on the actions dropdown
          Then User Clicks on the view orders
    
    @dev       
    Examples: 
      | username                          | | password  |
      | velumanieswaran2020@gmail.com     | |!123456Zm   |
      
      @devSecond       
    Examples: 
      | username                      | | password  |
      | buyerautomated3@gmail.com     | |!123456Zm   |

